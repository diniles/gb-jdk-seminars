package ru.gb.homework4;

public class Employee {
    private static int idCounter = 10000;
    private int id;
    private String phoneNUmber;
    private String name;
    private int experience;

    public Employee(int id, String phoneNUmber, String name, int experience) {
        this.id = idCounter;
        this.phoneNUmber = phoneNUmber;
        this.name = name;
        this.experience = experience;
        idCounter++;
    }

    public String getPhoneNUmber() {
        return phoneNUmber;
    }

    public void setPhoneNUmber(String phoneNUmber) {
        this.phoneNUmber = phoneNUmber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return String.format("id=%d, phone number=%s, name=%s, experience=%d");
    }
}
