package Common_Package;
public class ThisKeyword {
    private int x, y;
    private int width, height;
        
    public ThisKeyword() {
        this(0, 0, 1, 1);
    }
    public ThisKeyword(int width, int height) {
        this(0, 0, width, height);
    }
    public ThisKeyword(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    
    
    public static void main(String[] args) {
		ThisKeyword obj=new ThisKeyword(2,3,4,5);
		
		System.out.println(obj.width+" "+obj.height);
	}
 
    
}