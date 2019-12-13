package OOupg2del1.Model;

import OOupg2del1.Controller.IObersver;

import java.util.ArrayList;
import java.util.List;

public class Facade implements ISubject{
    Salong salong;
    private List<IObersver> observers;

   public Facade() {
        observers = new ArrayList<>();
    }

    public void createSalong(String name) {
        this.salong = new Salong(name);
    }

    public void addCarToSalong(String name) {
        salong.addCar(new Bil(name));
        notify1();
    }

    public Salong getSalong() {
        return salong;
    }

    @Override
    public void detach(IObersver o) {
        observers.remove(o);
    }

    @Override
    public void attach(IObersver o) {
        observers.add(o);
    }

    @Override
    public void notify1() {
        for(IObersver o: observers) {
            o.update();
        }

    }
}
