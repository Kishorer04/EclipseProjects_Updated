package Overridding;

class A {
	
    final String s = "Class A";
}

class B extends A {
    String s = "Class B"; // Error: Variable 's' is already defined in the scope
}

public class Main {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.s);
        obj.s = "New value"; // This will result in a compilation error
        System.out.println(obj.s);
    }
}