package ru.gb.homework2;

import javax.swing.*;
import java.awt.*;

public class ServerGUI extends JFrame implements GUIInterface {
    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;

    JButton btnStart, btnStop;
    public JTextArea chatWindow;

    public ServerGUI() {
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

    private Component createChatPanel() {
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
        btnStart.addActionListener(e -> {
            Utils.readFromFile(chatWindow);
            System.out.println("Server started!");
        });
        panel.add(btnStop);
        btnStop.addActionListener(e -> {
            Utils.saveToFile(chatWindow.getText());
            System.out.println("Server stopped!");
            System.exit(0);
        });
        return panel;
    }

    @Override
    public void showMessage(String text) {
        chatWindow.append(text);
    }
}
