package com.composition;

public class Honda extends Car{
    public void HondaStart(){
        CarEngine Honda_Engine = new CarEngine(); //composition
        Honda_Engine.StartEngine();
        }
    public static void main(String[] args) {   
        Honda HondaJazz = new Honda();
        HondaJazz.setColour("Black");
        HondaJazz.setMaxi_Speed(160);
        HondaJazz.carDetails();
        HondaJazz.HondaStart();
    }

}
