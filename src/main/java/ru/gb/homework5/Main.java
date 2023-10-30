package ru.gb.homework5;

public class Main {
    protected static Thread[] threads = new Thread[Consts.PHILOSOPHERS_COUNT];

    public static void main(String[] args) throws InterruptedException {
        System.out.println(System.nanoTime() + ": Dinner is started");

        Fork[] forks = new Fork[Consts.PHILOSOPHERS_COUNT];
        for (int i = 0; i < forks.length; i++) {
            forks[i] = new Fork(i);
        }

        Philosopher[] philosophers = new Philosopher[Consts.PHILOSOPHERS_COUNT];
        State state = new State(philosophers);
        for (int i = 0; i < philosophers.length; i++) {
            Fork leftFork = forks[i];
            Fork rightFork = forks[(i + 1) % forks.length];

            philosophers[i] = new Philosopher(i, leftFork, rightFork, state);

            threads[i] = new Thread(philosophers[i], "Philosopher " + (i + 1));
            threads[i].start();
        }

        waitMillis(Consts.DINNER_DURATION_IN_MS);
        stopPhilosophers(philosophers);
        stopThreads(threads);

        System.out.println(System.nanoTime() + ": Dinner is finished");
        printStats(philosophers);
    }

    private static void stopPhilosophers(Philosopher[] philosophers) throws InterruptedException {
        for (Philosopher philosopher : philosophers) {
            if (!philosopher.stopped.get()) {
                philosopher.stop();
            }
        }
        waitMillis(200);
    }

    private static void printStats(Philosopher[] philosophers) {
        int totalCount = 0;
        for (Philosopher philosopher : philosophers) {
            totalCount += philosopher.eatCount.intValue();
        }
        if (totalCount > 0) {
            System.out.println("Eating stats:");
            System.out.println("Total: " + totalCount);
            for (int i = 0; i < philosophers.length; i++) {
                System.out.println(
                        "Philosopher " + (i + 1) + ": " + (100.0 * philosophers[i].eatCount.intValue() / totalCount) + "%");
            }
        }
    }

    protected static void waitMillis(long millis) {
        if (millis <= 0) {
            return;
        }
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    protected static void stopThreads(Thread[] threads) {
        for (Thread thread : threads) {
            if (!thread.isInterrupted()) {
                thread.interrupt();
            }
        }
        waitMillis(100);
    }
}
