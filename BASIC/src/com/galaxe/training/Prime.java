package com.galaxe.training;

public class Prime {
	public void primeNo(int n,int m) {
		int temp=0;
		for(int i=n;i<m;i++) {
			for(int j=2;j<i;j++) {
				if(i%j==0)
				{
					temp=temp+1;
				}
			}
			 if(temp==0)
			{
				System.out.println(i);
			}
			else {
				temp=0;
			}
		}
		
	}
	public static void main(String[] args) {
		Prime prime=new Prime();
		prime.primeNo(1,1000);	
		
		}
	}
	
