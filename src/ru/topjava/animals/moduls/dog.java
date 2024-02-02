package ru.topjava.animals.moduls;

public class dog extends Pets implements Commands{
    public String sit;
    public String stay;
    public String fetch;
    public dog( String name, String type, String birthday, String sit, String stay, String fetch) {
        super( name, type, birthday);
        this.sit = sit;
        this.stay = stay;
        this.fetch = fetch;
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

    @Override
    public String toString() {
        return "dog{" +
                "sit='" + name + '\'' +
                ", stay='" + type + '\'' +
                ", fetch='" + sit + '\'' +
                ", name='" + stay + '\'' +
                ", type='" + fetch + '\'' +
                '}';
    }
}
