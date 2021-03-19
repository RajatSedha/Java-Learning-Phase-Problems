package com.company;

public class Car {
    private int doors; // these are fields or instance variables
    private int wheels;
    private String model;
    private String engine;
    private String colour;


    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera")||validModel.equals("fortuner")){
            this.model = model;
        }
        else{
            this.model = "Unknown";
        }

    }

    public String getModel(){
        return this.model;
    }
}
