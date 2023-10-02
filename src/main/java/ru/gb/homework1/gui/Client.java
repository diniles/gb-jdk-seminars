package ru.gb.homework1.gui;

import javax.swing.*;
import java.awt.*;

public class Client extends JFrame {
    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;
    public static final String IP = "127.0.0.1";
    public static final String PORT = "8189";
    public static final String NAME = "dl";
    public static final String PASSWORD = "12345";

    JButton btnLogin, btnSendMsg;
    JTextField tfldIP, tfldPort, tfldName, tfldPassword, tfldMsg;
    JTextArea chatWindow;

    public Client() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setTitle("Chat Client");
        setResizable((true));

        add(createMainPanel());
        setVisible(true);
    }

    private Component createMainPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(createTopPanel(), BorderLayout.NORTH);
        panel.add(createChatWindowPanel(), BorderLayout.CENTER);
        panel.add(createBottomPanel(), BorderLayout.SOUTH);
        return panel;
    }

    private Component createTopPanel() {
        JPanel panel = new JPanel(new GridLayout(2, 3, 2, 2));
        tfldIP = new JTextField(IP);
        tfldPort = new JTextField(PORT);
        tfldName = new JTextField(NAME);
        tfldPassword = new JTextField(PASSWORD);
        btnLogin = new JButton("Login");
        panel.add(tfldIP);
        panel.add(tfldPort);
        panel.add(new JPanel());
        panel.add(tfldName);
        panel.add(tfldPassword);
        panel.add(btnLogin);
        return panel;
    }

    private Component createChatWindowPanel() {
        chatWindow = new JTextArea();
        chatWindow.setEditable(false);
        chatWindow.setLineWrap(true);
        chatWindow.setWrapStyleWord(true);
        return new JScrollPane(chatWindow);
    }

    private Component createBottomPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        tfldMsg = new JTextField();
        btnSendMsg = new JButton("Send");
        panel.add(tfldMsg, BorderLayout.CENTER);
        panel.add(btnSendMsg, BorderLayout.EAST);
        return panel;
    }
}
