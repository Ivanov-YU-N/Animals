package ru.topjava.animals.moduls;

public class Hors extends PeckAnimals implements Commands{
    public Hors(  String name, String type, String birthday) {
        super(  name, type, birthday);
    }

    @Override
    public String sit() {
        return null;
    }

    @Override
    public String stay() {
        return null;
    }

    @Override
    public String fetch() {
        return null;
    }
}
