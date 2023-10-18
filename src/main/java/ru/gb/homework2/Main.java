package ru.gb.homework2;

public class Main {
    public static void main(String[] args) {
        Server srv = new Server();
        new Client(srv);
    }
}
