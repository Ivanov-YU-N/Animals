package ru.topjava.animals.view;

import ru.topjava.animals.moduls.Animal;

import javax.swing.text.View;
import java.util.Collection;

public class AnimalView {
    public void showAnimal(Collection<Animal> animals){
        for(Animal animal: animals){
            System.out.println(animal);
        }
    }

}
