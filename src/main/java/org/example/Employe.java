package org.example;

class Employe {

    private String name;
    private String jobTitle;
    private int salary;

    public Employe(String name, String jobTitle, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void raiseSalary (){
        salary = salary + salary;
    }

    public String showEmplye(){
        return "Imie" + name + "jobtitle" + jobTitle + "salary" + salary;
    }
}
