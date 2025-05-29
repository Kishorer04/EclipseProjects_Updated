package anonymousInnerClassAsMethodArgument;

public class Runner {

	public static void main(String[] args) {
		
		Friend fr = new Friend();
		fr.canManage(new IManageable() {
			
			@Override
			public void manage() {
				System.out.println("Kaal la vilunthu kathariduven..!");
			}
		});
	}
}
