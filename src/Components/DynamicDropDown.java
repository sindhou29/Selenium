package Components;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users/admin/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(5000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
//List <WebElement>	list=	driver.findElements(By.id("glsctl00_mainContent_ddl_originStation1_CTNR"));
		int	list=   driver.findElements(By.xpath("//div[@class='dropdownDiv']/ul/li/a")).size();
for (int i=0;i<=list; i++)
{
String s=driver.findElements(By.xpath("//div[@class='dropdownDiv']/ul/li/a")).get(i).getText();

if(s.contains("Chennai (MAA)"))
{
	driver.findElements(By.xpath("//div[@class='dropdownDiv']/ul/li/a")).get(i).click();
}
}
Thread.sleep(3000);
driver.findElement(By.xpath("(//a[@value='CJB'])[2]")).click();

	}
}
