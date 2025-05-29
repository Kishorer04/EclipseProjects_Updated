// Define an interface
package Common_Package;

interface Person {
    String getName();
    int getAge();
}

// Implement the interface in a class
class ConcretePerson implements Person {
    private String name;
    private int age;

    public ConcretePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }
}

// Function that returns an object implementing the Person interface
public class ReturnTypeInterface {
	
    public static Person createPerson(String name, int age) {
        return new ConcretePerson(name, age);
    }

    // Example usage
    public static void main(String[] args) {
        Person newPerson = createPerson("John Doe", 25);
        System.out.println("Name: " + newPerson.getName());
        System.out.println("Age: " + newPerson.getAge());
    }
}