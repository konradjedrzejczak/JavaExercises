package org.example;

public class Capuccino extends CoffeMachine{
    @Override
    String getCoffeeType() {
        return CoffeType.CAPUCCINO.toString();
    }

    @Override
    public void brewCoffe(CoffeType coffeType) {
        System.out.println("brewing coffe");
    }
}
