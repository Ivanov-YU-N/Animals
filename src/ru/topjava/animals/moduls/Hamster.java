package ru.topjava.animals.moduls;

public class Hamster extends Pets implements Commands{
    public Hamster( String name, String type, String birthday) {
        super( name, type, birthday);
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
