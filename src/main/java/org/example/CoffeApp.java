package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CoffeApp {
    public static void main(String[] args) {

        Map<CoffeType, CoffeMachine> coffeeMachines = new HashMap<>();
        coffeeMachines.put(CoffeType.ESPRESSO, new Espresso());
        coffeeMachines.put(CoffeType.AMERICANO, new Americano());
        coffeeMachines.put(CoffeType.LATTE, new Latte());
        coffeeMachines.put(CoffeType.CAPUCCINO, new Capuccino());

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a coffee type:"  + CoffeType.AMERICANO + ", " +
                                  CoffeType.ESPRESSO + ", " +  CoffeType.LATTE +  ", " + CoffeType.CAPUCCINO);

        int choice = scanner.nextInt();
        CoffeType selectedCoffeeType = CoffeType.values()[choice];

        CoffeMachine selectedCoffeeMachine = coffeeMachines.get(selectedCoffeeType);

        if (selectedCoffeeMachine != null) {
            selectedCoffeeMachine.brewCoffe(selectedCoffeeType);

            System.out.println("How size of your coffe");
            if(scanner.next().equalsIgnoreCase("small")){
                CoffeSize.SMALL.toString();

            }
            System.out.println("Do you want to add milk normal yes/ no)");
            if (scanner.next().equalsIgnoreCase("yes")) {
                selectedCoffeeMachine.addMilk();
            }

            System.out.println("Or lactose? yes/ no");
            if(scanner.next().equalsIgnoreCase("yes")){
                selectedCoffeeMachine.addMilkLactose();
            }

            System.out.println("Do you want to add sugar? Type 0 for no, or level 1 2 or 3?");
            int sugar = scanner.nextInt();
            selectedCoffeeMachine.setSugar(sugar);
            if(sugar == 1){
                System.out.println("Sugar level is 1"   );
                selectedCoffeeMachine.addSugar();
            }else if(sugar == 2){
                System.out.println("Sugar level is 2"  );
                selectedCoffeeMachine.addSugar();
            }else if(sugar == 3){
                System.out.println("Sugar level is 3" );
                selectedCoffeeMachine.addSugar();
            }

            selectedCoffeeMachine.serveCoffe();

        } else {
            System.out.println("Invalid choice.");
        }
    }
}


