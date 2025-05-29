package com.galaxe.training.exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDao {
	public int getResult(String numeratorStr, int denominator) {
		int result=0;
		try {
			int numerator= Integer.parseInt(numeratorStr);
			result= numerator/denominator;
		}catch(ArithmeticException e ){
			System.out.println("/is not possible");
		}catch(NumberFormatException e) {
			System.out.println("String cannot be converted to integer");
		}finally {
			System.out.println("This will execute always");
		}
		System.out.println("All completed");
		return result;
	}
	
	public void readFile() throws IOException {
		File file = new File("\"C:\\Users\\kravikumar\\OneDrive - GalaxE. Solutions, Inc\\Desktop\\fsafafs.txt\"");
		BufferedReader bufferedreader = new BufferedReader(new FileReader(file));
		String str=null;
		while((str=bufferedreader.readLine())!=null) {
			System.out.println(str);
		}
	
				
	}

}
