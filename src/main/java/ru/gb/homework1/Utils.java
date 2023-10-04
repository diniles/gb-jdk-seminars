package ru.gb.homework1;

import javax.swing.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utils {
    public static String currentDateTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    public static String loginData(String name) {
        return String.format("User %s , logged at %s\n", name, currentDateTime());
    }

    public static void saveToFile(String text) {
        File file = new File("chatlog.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(text);
            writer.close();
            System.out.println("Text saved to file successfully.");
        } catch (IOException e) {
            System.out.println("Error saving text to file: " + e.getMessage());
        }
    }

    public static void readFromFile(JTextArea chat) {
        File file = new File("chatlog.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            chat.setText(content.toString());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

}
