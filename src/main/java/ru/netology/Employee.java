package ru.netology;

public class Employee {
    public long id;
    public String firstName;
    public String lastName;
    public String country;
    public int age;

    @Override
    public String toString() {
        return "id: " + id +
                ", firstname: " + firstName +
                ", lastname: " + lastName +
                ", country: " + country +
                ", age: " + age
                ;
    }
}