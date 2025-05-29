package mp;

import org.testng.Assert;
import org.testng.annotations.Test;

import mpm.App;


public class AppTest {
    

	@Test
    public void testlogin1() {
        App myapp=new App();
        Assert.assertEquals(0,myapp.userLogin("abc","abc@123"));
    }
	
	
	
	public void testlogin2(){
		App myapp=new App();
		Assert.assertEquals(0, myapp.userLogin("abc","abc123"));
	}
   
    }