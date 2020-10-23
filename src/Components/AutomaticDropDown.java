package Components;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomaticDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users/admin/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		
		driver.findElement(By.id("autosuggest")).sendKeys("IND");
		Thread.sleep(3000);
		
List <WebElement> names=	driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));

for (WebElement name:names)
{
if(	name.getText().equalsIgnoreCase("India"))
{
	name.click();
	break;
}
}
		
	}

}
