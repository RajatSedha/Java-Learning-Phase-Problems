package com.company;

public class Main {

    public static void main(String[] args) {
	Wall a  = new Wall(5.00,8.00);
        System.out.println("width= "+a.getWidth());
        System.out.println("height= "+a.getHeight());
        System.out.println("area= "+a.getArea());
    }
}
