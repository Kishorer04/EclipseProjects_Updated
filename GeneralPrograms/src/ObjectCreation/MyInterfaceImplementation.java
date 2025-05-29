package ObjectCreation;


public class MyInterfaceImplementation implements MyInterface {
   
    
    public static void main(String[] args) {
        // Creating an instance of the class that implements the interface
    	MyInterface result = getMyInterfaceInstance();
        result.myMethod();
    }
    
    public static MyInterface getMyInterfaceInstance() {
        return new MyInterfaceImplementation();
    }
    
    
    @Override
    public void myMethod() {
        System.out.println("Executing myMethod");
    }
    
    
    
    
}



