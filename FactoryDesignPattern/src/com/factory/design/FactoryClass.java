package com.factory.design;

public class FactoryClass {
	
	public static Water initEle(String val) {
		if(val==null)
		 return null;
		switch(val) {
		case "Kitchen":
			return new Kitchen();
		case "Bathroom":
			return new Bathroom();
		case "Dining":
			return new Dining();
		default:
			return null;
			
		}
	
	}

}
