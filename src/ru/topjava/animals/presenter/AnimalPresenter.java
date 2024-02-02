package ru.topjava.animals.presenter;

import ru.topjava.animals.moduls.Animal;
import ru.topjava.animals.view.AnimalView;

import java.util.Collection;

public class AnimalPresenter {

    private final Model model;
    private AnimalView view;

    public AnimalPresenter(Model model, AnimalView view) {
        this.model = model;
        this.view = view;
    }

    public Collection<Animal> loadAnimal(){
        return model.loadAnimals();
    }
    public  void updateAnimals(){
        view.showAnimal(loadAnimal());
    }
}
