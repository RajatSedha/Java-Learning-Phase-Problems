package com.company;
public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car honda = new Car();
       // System.out.println("Model is "+ porsche.getModel()); // will show null because it is printed before setting
        porsche.setModel("Carrera");
        System.out.println("Model is "+ porsche.getModel());
    }
}
