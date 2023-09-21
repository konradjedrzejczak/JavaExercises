package org.example;

public class Main {
    public static void main(String[] args) {

        Employe employe1 = new Employe("Maciek ", " MAstechef ", 4222);
        Employe employe2 = new Employe("Franek ", " itspecjalst ", 22222);

        System.out.println(employe1.showEmplye() + "     " + employe2.showEmplye());

        employe1.raiseSalary();
        System.out.println("After salary" + employe1.showEmplye());
    }
}