package com.galaxe.training.exception;

import java.io.IOException;

public class Exception {
	
	public static void main(String[] args) {
		ExceptionDao exceptiondao=new ExceptionDao();
		System.out.println(exceptiondao.getResult("400",20));
		
		
		try {
			exceptiondao.readFile();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
