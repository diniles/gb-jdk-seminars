package ru.gb.homework1.gui;

import ru.gb.homework1.Utils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Client extends JFrame {
    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;
    public static final String IP = "127.0.0.1";
    public static final String PORT = "8189";
    public static final String NAME = "dl";
    public static final String PASSWORD = "12345";
    public static final String LOGIN_DATA = "";

    Server srv;
    JButton btnLogin, btnSendMsg;
    JTextField tfldIP, tfldPort, tfldName, tfldPassword, tfldMsg;
    JTextArea chatWindow;

    public Client(Server srv) {
        this.srv = srv;
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
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
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(Utils.loginData(NAME));
                srv.chatWindow.append(Utils.loginData(NAME));
                tfldIP.setEnabled(false);
                tfldPort.setEnabled(false);
                tfldName.setEnabled(false);
                tfldPassword.setEnabled(false);
                btnLogin.setEnabled(false);
            }
        });
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
