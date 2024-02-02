package ru.topjava.animals.presenter;

import ru.topjava.animals.moduls.Animal;

import java.util.Collection;

public interface Model {
    Collection<Animal> loadAnimals();
}
