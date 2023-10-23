package org.example;

public abstract class CoffeMachine implements CoffeMethods {

    private boolean milk;
    private int sugar;
    private boolean lactose;


    @Override
    public void addMilk() {
        milk = true;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    @Override
    public void addSugar() {
        setSugar(sugar);
    }

    @Override
    public void addMilkLactose() {
        lactose = true;
    }


    @Override
    public void serveCoffe() {
        System.out.println("Your coffee is ready!");
        System.out.println("Coffee type: " + getCoffeeType());
        System.out.println("Coffe size is: " + getCoffeSize());
        System.out.println("Milk: " + (milk ? "Yes" : "No"));
        System.out.println("Milk Lactose " +(lactose ? "lact" : "No"));
        System.out.println("Sugar level is  " + getSugar());

    }

    abstract String getCoffeeType();

    private String getCoffeSize() {
        return getCoffeSize();
    }
}
