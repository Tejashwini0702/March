package com.composition;

public class Car {
	//car variables
	String colour;
    private int maxi_Speed;
    
    //methods
    public void carDetails(){
        System.out.println("Car Colour= "+colour + "; Maximum Speed= "+ maxi_Speed);
    }
	public void setColour(String colour) {
		this.colour = colour;
	}
	public void setMaxi_Speed(int maxi_Speed) {
		this.maxi_Speed = maxi_Speed;
	}    
}
