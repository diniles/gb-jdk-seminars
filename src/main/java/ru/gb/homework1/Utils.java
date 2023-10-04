package ru.gb.homework1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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

}
