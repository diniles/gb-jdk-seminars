package ru.gb.homework2;

import ru.gb.homework2.client.ClientGUI;
import ru.gb.homework2.server.ServerWindow;

public class Main {
    public static void main(String[] args) {
        ServerWindow serverWindow = new ServerWindow();
        new ClientGUI(serverWindow);
        new ClientGUI(serverWindow);
    }
}
