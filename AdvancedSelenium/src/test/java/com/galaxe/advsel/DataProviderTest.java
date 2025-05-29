package com.galaxe.advsel;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@Test(dataProvider="objectArray")
	public void dtest(String name,String number) {
		
		System.out.println(name+"  "+number);
		
	}
	
	@DataProvider(name="objectArray")
	public Object[][] dPT() {
	return new Object[][]{
			                    {"Kishore","1"},
			                    {"Kishore2","2"},
			                    {"Kishore3","3"}
			             };
	}
	
	
//
//	public String[][] dPTt() {
//		return new String[][]{
//			                    {"Kishore","1"},
//			                    {"Kishore2","2"},
//			                    {"Kishore3","3"}
//			                  };	
//	}
//	
//	
//	public int[][] dPTtt() {
//		return new int[][]{
//			                    {1,1},
//			                    {2,2},
//			                    {3,3}
//			                  };	
//	}

	

}
