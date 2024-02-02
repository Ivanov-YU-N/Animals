package ru.topjava.animals.moduls;

import ru.topjava.animals.presenter.Model;

import java.util.Collection;

public class Animal implements Model {
    private static int id;
    public  String name;
    public String type;
    private String birthday;
    private final int no;

    public int getNo(){
        return no;
    }

    {
        no = ++ id;
    }

    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getBirthday() {
        return birthday;
    }

    public Animal( String name, String type, String birthday) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.birthday = birthday;

    }

    public Animal() {
    }

    @Override
    public String toString() {
        return "Animal{" +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }

    @Override
    public Collection<Animal> loadAnimals() {
        return null;
    }
}
