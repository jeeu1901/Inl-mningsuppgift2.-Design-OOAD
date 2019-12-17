package OOupg2del1.Controller;

import OOupg2del1.Model.Facade;
import OOupg2del1.View.View;

public class Controller implements IObersver{
    Facade facade = new Facade();
    int index = 0;
    private View view;

    public Controller(View view) {
        facade.attach(this);
        this.view = view;
    }



    public void getCars() {
        for(String s: facade.getSalong().showCars()) {
            view.printMessage(s);
        }
    }


    @Override
    public void update() {
        view.printMessage("La till bilen: " + facade.getSalong().getBilar().get(index).getModelName() + " i salongen: "
                + facade.getSalong().getName());
        index++;
    }


    public void addCar(String input) {
        facade.addCarToSalong(input);
    }

    public void addSalong(String input) {
        facade.createSalong(input);
    }
}
