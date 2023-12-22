package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public WebDriver driver;
@BeforeMethod
public void launch_Obsqurawebsite()
{
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
	driver.get("https://selenium.obsqurazone.com/index.php");
driver.manage().window().maximize();
	
}

}
