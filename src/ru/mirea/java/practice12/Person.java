package ru.mirea.java.practice12;

public class Person {
    private String surname;
    private String name;
    private String middleName;

    public Person(String surname, String name, String middleName) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
    }
    Person(String surname){
        this(surname,null,null);
    }

    String FIO() {
        if (name != null && middleName != null) {
            return surname + " " + name + " "  + middleName;
        } else
            return surname;
    }
}
