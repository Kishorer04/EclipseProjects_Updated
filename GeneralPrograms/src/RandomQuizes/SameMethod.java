package RandomQuizes;

public class SameMethod 
{
	public static void main(String[] args) {
		System.out.println(Adder.add(5,6));
	}
}



class Adder{
    
    static int add(int n,int m)
    {
    System.out.println("int");
    return n+m;
    }
    
//    static double add(int n, int m) {
//    return n+m;
//    }
    
    
}
