package Common_Package;

public class CommonCharacters {
	public static void main(String[] args) {
		
		String str1 ="bcfde";
		String str2 = "afcd";
		String str3 = "abfde";
	   
		String common ="";
	
		for(char c:str1.toCharArray())
		{
			if(str1.indexOf(c)!= -1 && str2.indexOf(c)!=-1 && str3.indexOf(c)!=-1)
				common = common +c;	 
		}
		System.out.println("Common characters "+ common);
	}

}
