package methodArgumentWithoutAnonymousInnerClass;

public class Runner {
	
	
	public static void main(String[] args) {
	
		Friend  f = new Friend();
		f.canManage(new IManageableImpl());
		
	}

}
