package ru.gb.homework2;

import ru.gb.homework1.gui.Client;
import ru.gb.homework1.gui.Server;

public class Main {
    public static void main(String[] args) {
        Server srv = new Server();
        new Client(srv);
    }
}
