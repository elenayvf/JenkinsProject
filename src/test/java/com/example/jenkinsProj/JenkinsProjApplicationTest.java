
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/** * Created by  * Sample junit test code to integrate by */
public class JenkinsProjApplicationTests{    
	String message = "Hello World";	
   MessageUtil messageUtil = new MessageUtil(message);
	@Test
	public void testPrintMessage() {
	   assertEquals(message,messageUtil.printMessage());
	}


}