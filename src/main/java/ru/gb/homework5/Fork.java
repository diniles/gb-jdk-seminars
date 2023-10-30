package ru.gb.homework5;

public class Fork {
    private final int id;
    private boolean availability = true;

    public Fork(int id) {
        this.id = id;
    }

    public void take() {
        long t = java.lang.System.nanoTime();
        if (Consts.DEBUG) {
            System.out.println(t + ": Fork " + id + " is taken");
        }
    }

    public void put() {
        long t = java.lang.System.nanoTime();
        if (Consts.DEBUG) {
            System.out.println(t + ": Fork " + id + " is put");
        }
    }

    public boolean getAvailability() {
        return availability;
    }

    public void setAvailability(boolean flag) {
        availability = flag;
    }
}
