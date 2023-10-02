package ru.gb.homework1;

import javax.swing.*;
import java.awt.*;

public class Server extends JFrame {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;

    JButton btnStart, btnStop;

    Server() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setTitle("Chat Server");
        setResizable((true));

        add(createMainPanel());
    }

    private Component createMainPanel() {
        JPanel panel = new JPanel(new GridLayout(2, 1));
        panel.add(createChatPanel());
        panel.add(createButtonsPanel());
        return panel;
    }

    private Component createChatPanel() {
        JPanel panel = new JPanel();
        JTextArea chatWindow = new JTextArea();
        chatWindow.setEditable(false);
        chatWindow.setLineWrap(true);
        JScrollPane scrollChatWindow = new JScrollPane(chatWindow);

        panel.add(scrollChatWindow);
        return panel;
    }

    private Component createButtonsPanel() {

    }
}
