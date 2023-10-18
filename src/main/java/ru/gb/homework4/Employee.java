package ru.gb.homework4;

public class Employee {
    private static int idCounter = 10000;
    private final int id;
    private String phoneNumber;
    private final String name;
    private int experience;

    public Employee(String phoneNUmber, String name, int experience) {
        this.id = idCounter;
        this.phoneNumber = phoneNUmber;
        this.name = name;
        this.experience = experience;
        idCounter++;
    }

    public int getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return String.format("id=%d, phone number=%s, name=%s, experience=%d"
                , id, phoneNumber, name, experience);
    }
}
