package ru.topjava.animals.moduls;

public class PeckAnimals extends Animal{
    public PeckAnimals( String name, String type, String birthday) {
        super(name, type, birthday);
    }

    @Override
    public String toString() {
        return "PeckAnimals{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
