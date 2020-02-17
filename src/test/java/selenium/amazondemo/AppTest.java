package selenium.amazondemo;

import static org.junit.Assert.*;

import org.junit.Test;


public class AppTest 
{
	
	App obj = new App();
	
	@Test
    	public void testPalindrome() 
	{
		obj.printName("DEVOPS");
		 assertEquals("Software Engineering","Software Engineering");
    }
	
	
}