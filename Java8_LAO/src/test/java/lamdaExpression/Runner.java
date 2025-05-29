package lamdaExpression;

public class Runner {
	
	
	public void usingClassicalWay() {
		
		IPanchayat panchayatImpl = new PanchayatImpl();
		System.out.println(panchayatImpl.interrogate("Ponna kaiya pudichu iluthiya?"));
	
	}
	
	
	public void usingAnonymousInnerClass() {
		
		IPanchayat ipanchayat = new IPanchayat() {
			
		@Override
		public String interrogate(String question) {
			
			return "Enna "+question;
		}
			
		};
		
		System.out.println(ipanchayat.interrogate("Ponna kaiya pudichu iluthiyaa?"));
		
	}
	
	public void usingLamda() {
		
		IPanchayat ipanchayat = question -> {return "Enna "+ question;};
		System.out.println(ipanchayat.interrogate("Ponna kaiya pudichu iluthiyaaa?"));
		
	}
	
	public static void main(String[] args) {
		
		Runner runner = new Runner();
		runner.usingClassicalWay();
		runner.usingAnonymousInnerClass();
		runner.usingLamda();
	
	}

}
