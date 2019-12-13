package OOupg2del1.Model;

import java.util.ArrayList;
import java.util.List;

public class Salong {
    private List<Bil> bilList;
    private String name;

    Salong(String name) {
        this.name = name;
        bilList = new ArrayList<>();
    }

    public void addCar(Bil bil) {
        bilList.add(bil);
    }

    public List<Bil> getBilar() {
        return bilList;
    }

    public String getName() {
        return name;
    }

    public List<String> showCars() {
        List<String> cars = new ArrayList<>();
        for(Bil b: bilList) {
            cars.add(b.getModelName());
        }
        return cars;
    }

}
