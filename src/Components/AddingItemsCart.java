package Components;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddingItemsCart {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver", "C://Users/admin/Downloads/chromedriver_win32/chromedriver.exe");
WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		String[] products = { "Brocolli", "Cauliflower", "Beetroot" };
		
		addItems(driver,products);
	}
	
	public static void addItems(WebDriver d,String[] p) throws InterruptedException
	{
		int j=0;
		List<WebElement> option = d.findElements(By.xpath("//h4[@class='product-name']"));

		for (int i = 0; i <= option.size(); i++) {

				String[] name = option.get(i).getText().split("-");
				String formatedname = name[0].trim();
				List convert=Arrays.asList(p);
			
				
				if(convert.contains(formatedname))
			{
					j++;
					d.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
					
				}
				if(j==p.length)
				{
					break;
				}
					
			}
	
	}
		}


