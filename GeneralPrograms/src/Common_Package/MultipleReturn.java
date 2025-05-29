package Common_Package;

public class MultipleReturn {
	
	int add;
	int sub;
	double mul;

	
	MultipleReturn(int a, int s, int m){
		
		add=a;
		sub=s;
		mul=m; 
		
	}
	
	
}

class Test{
	
	static MultipleReturn getMultipleReturn(int a, int b) {
		
		
		return new MultipleReturn((a+b),a-b,a*b) ;
		
	}
	
	public static void main(String[] args) {
		MultipleReturn ans=getMultipleReturn(10,20);
		System.out.println("Addition"+ans.add);
		System.out.println("Subtraction"+ans.sub);
		System.out.println("Multiplication"+ans.mul); 
		
		
	}
	
}
