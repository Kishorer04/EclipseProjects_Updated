package com.galaxe.training;

public class Tables {
	public void table(int table) {
		for(int i=1;i<=10;i++)
		{
			String result=(table+"*"+i+"="+table*i);
			System.out.println(result);
			
		}
		
		
		
	}
	public static void main(String[] args) {
		Tables tables=new Tables();
		tables.table(23);
		
		
	}

}
