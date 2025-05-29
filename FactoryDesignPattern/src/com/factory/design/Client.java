package com.factory.design;

public class Client {

	public static void main(String[] args) {
		
		//FactoryClass fc =new FactoryClass();
		Water water=FactoryClass.initEle("Bathroom");
		water.wash();
		

	}

}
