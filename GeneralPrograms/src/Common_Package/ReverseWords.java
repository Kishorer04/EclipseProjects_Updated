package Common_Package;

public class ReverseWords {

	public static void main(String[] args) {
		
		String sent = "Ram is a good boy";
		String[] words = sent.split(" ");
		StringBuilder reversed = new StringBuilder();
		
		for(int i = words.length-1; i>=0; i--)
		{
			reversed.append(words[i]);
			
			if(i!=0)
				reversed.append(" ");
		}
		
		System.out.println(reversed.toString());
		
	}
}
