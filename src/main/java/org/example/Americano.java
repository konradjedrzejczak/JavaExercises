package org.example;

public class Americano extends CoffeMachine{
    @Override
    String getCoffeeType() {
       return CoffeType.AMERICANO.toString();
    }

    @Override
    public void brewCoffe(CoffeType coffeType) {
        System.out.println("Brewing Americano...");
    }
}
