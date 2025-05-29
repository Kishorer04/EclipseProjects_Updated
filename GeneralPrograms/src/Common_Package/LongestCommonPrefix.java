package Common_Package;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
    String result="";
    int curInd=0;
   if(strs.length==1)
    return strs[0];

  while(true){
   for(int i=0;i<strs.length-1;i++)
   {
    if(curInd>strs[i].length() || curInd>strs[i+1].length() || strs[i].charAt(curInd)!=strs[i+1].charAt(curInd))
    {
        return result;
    } 
     
    }
    result=result+strs[0].charAt(curInd);
    curInd++;
    }
    }


public static void main(String[] args){
    String[] arr={"flower","flag","flat"};
    LongestCommonPrefix lcp=new LongestCommonPrefix();
    String res=lcp.longestCommonPrefix(arr);
    System.out.println(res);
    
}
}
