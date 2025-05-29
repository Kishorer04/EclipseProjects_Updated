package methodReferenceExamples;

@FunctionalInterface
interface IVanakam{
	
	public void vanakam(String name);
	
}

public class InstanceMethodExample {
	
	public void greet(String name) {
		System.out.println("Vanakam "+name);
	}

	public static void main(String[] args) {
		
		InstanceMethodExample instanceMethodExample = new InstanceMethodExample();
		
		IVanakam iVanakam = instanceMethodExample::greet;
		iVanakam.vanakam("Kishore");

	}

}
