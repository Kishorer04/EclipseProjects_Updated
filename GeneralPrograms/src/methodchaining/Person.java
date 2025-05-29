package methodchaining;

public class Person {
    private String name;
    private int age;

    public Person withName(String name) {
        this.name = name;
        return this;
    }

    public Person withAge(int age) {
        this.age = age;
        return this;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
    	
//    	Person person = new Person();
//    	 person= person.withName("Kishore");
//    	  person =person.withAge(22);
    	  
//    	  person.displayInfo();
    	
        // Create a new Person and configure it using method chaining
        Person person = new Person()
            .withName("Kishore")
            .withAge(22);

        // Display the configured information
        person.displayInfo();
    }
}
