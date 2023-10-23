package org.example;

public class Espresso extends CoffeMachine{
    @Override
    String getCoffeeType() {
        return CoffeType.ESPRESSO.toString();
    }

    @Override
    public void brewCoffe(CoffeType coffeType) {
        System.out.println("Brewing espresso");
    }
}
