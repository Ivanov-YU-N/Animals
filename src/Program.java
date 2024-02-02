import ru.topjava.animals.moduls.Animal;
import ru.topjava.animals.presenter.AnimalPresenter;
import ru.topjava.animals.presenter.Model;
import ru.topjava.animals.presenter.View;
import ru.topjava.animals.view.AnimalView;


class Programm{
    public static void main(String[] args) {

        Animal model = new Animal();
        AnimalView view = new AnimalView();
        AnimalPresenter presenter = new AnimalPresenter( model, view);

        presenter.updateAnimals();







    }

}