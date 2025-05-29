package Common_Package;

public class ValueCheck {

	public static void main(String[] args) {
		int i;
		int j = 0;
		for(i=1;i<3;i++) {
			for(j=1;j<i;j++) {
				System.out.println(j);
			}
		System.out.println("Outer loop adutha iteration mame...durr");
		}
		
		System.out.println("i value "+i);
		System.out.println("j value "+j);

	}

}
