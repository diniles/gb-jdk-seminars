package ru.gb.homework1.gui;

import javax.swing.*;
import java.awt.*;

public class Server extends JFrame {
    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;

    Server srv;
    JButton btnStart, btnStop;
    public JTextArea chatWindow;

    public Server() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setLocation(400, 400);
        setTitle("Chat Server");
        setResizable((true));
        add(createMainPanel());
        setVisible(true);
    }

    private Component createMainPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(createChatPanel());
        panel.add(createButtonsPanel(), BorderLayout.SOUTH);
        return panel;
    }

    public Component createChatPanel() {
        chatWindow = new JTextArea();
        chatWindow.setEditable(true);
        chatWindow.setLineWrap(true);
        chatWindow.setWrapStyleWord(true);
        return new JScrollPane(chatWindow);
    }

    private Component createButtonsPanel() {
        JPanel panel = new JPanel(new GridLayout(1, 2));
        btnStart = new JButton("Start Server");
        btnStop = new JButton("Stop Server");
        panel.add(btnStart);
        panel.add(btnStop);
        return panel;
    }
}
