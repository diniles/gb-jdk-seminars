package ru.gb.homework1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utils {
    public static String currentDateTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    public static String loginData(String name) {
        System.out.println(currentDateTime());
        return String.format("User " + name + ", logged at " + currentDateTime());
    }
}
