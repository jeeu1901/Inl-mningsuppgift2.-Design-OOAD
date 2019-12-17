package OOupg2del1.View;


import OOupg2del1.Controller.Controller;

import java.util.Scanner;

public class View {
    public View() {
        Controller controller = new Controller(this);
        Scanner sc = new Scanner(System.in);
        while (true) {
            String input;
            System.out.println("TJENA MORS VAD VILL DU GÖRA NU?");
            System.out.println("Skapa bil, Skapa salong, visabilar");
            input = sc.nextLine();
            switch(input) {
                case "bil":
                    System.out.print("Ange bilmodell: ");
                    input = sc.nextLine();
                    controller.addCar(input);
                    break;
                case "salong":
                    System.out.print("Ange salong namn: ");
                    input = sc.nextLine();
                    controller.addSalong(input);
                    break;
                case "visabilar":
                    System.out.println("Här kommer alla bilar");
                    controller.getCars();
                    break;

            }
        }

    }
    public void printMessage(String msg) {
        System.out.println(msg);
    }
}
