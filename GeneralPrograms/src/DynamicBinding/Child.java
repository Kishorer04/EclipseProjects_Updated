package DynamicBinding;

public class Child extends Parent {

	public static void main(String[] args) {
		Parent ch =new Child(); //Dynamic Binding...Parent class reference pointing to Child class memory
		ch.study();
		ch.getMarriage();
		ch.grow();
		//ch.play(); Cannot call this method bcoz this is Child's own method
	}
	
	
	public void play() {
		System.out.println("Playing with friends");
	}

	@Override
	public void getMarriage() {
		System.out.println("Marriage Proposals");
	}

	@Override
	public void study() {
		System.out.println("Academic details");

	}

}
