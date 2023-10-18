package ru.gb.homework2;

public class Main {
    public static void main(String[] args) {
        ServerGUI srv = new ServerGUI();
        new ClientGUI(srv);
    }
}
