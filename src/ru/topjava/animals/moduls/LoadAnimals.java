package ru.topjava.animals.moduls;

import java.util.ArrayList;
import java.util.Collection;

public class LoadAnimals {
    public Collection<Animal> animals;

    public Collection<Animal> loadAnimals(){
        if (animals == null){
            animals = new ArrayList();
            animals.add(new Animal( "Figo", "dog", "2012-01-15"));
            animals.add( new Animal("Body", "cat", "2012-01-15"));
            animals.add( new Animal( "Black", "camel", "2012-01-15"));
            animals.add( new Animal( "Whiskers", "horst", "2012-01-15"));
            animals.add( new Animal( "Smudge", "donkey", "2012-01-15"));
            animals.add( new Animal( "Moliver", "hamster", "2012-01-15"));
            animals.add( new Animal( "Hammy", "dog", "2012-01-15" ));
            animals.add( new Animal( "Peanta", "cat", "2012-01-15"));
        }
        return animals;
    }

}
