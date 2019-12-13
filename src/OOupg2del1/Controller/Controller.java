package OOupg2del1.Controller;

import OOupg2del1.Model.Facade;

public class Controller implements IObersver{
    Facade facade = new Facade();
    int index = 0;


    public Controller() {
        facade.attach(this);
    }



    public void getCars() {
        System.out.println(facade.getSalong().showCars());
    }


    @Override
    public void update() {
        System.out.println("La till bilen: " + facade.getSalong().getBilar().get(index).getModelName() + " i salongen: "
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
