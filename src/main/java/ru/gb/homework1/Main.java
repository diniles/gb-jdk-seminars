package ru.gb.homework1;

import ru.gb.homework1.gui.Client;
import ru.gb.homework1.gui.Server;

public class Main {
    public static void main(String[] args) {
        Server srv = new Server();
        Client client = new Client(srv);
    }
}
