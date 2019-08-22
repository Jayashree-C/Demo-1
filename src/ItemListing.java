import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ItemListing {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jayashree C\\eclipse-workspace\\SnapdealItemsListing\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Iphone7");
		
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		List<WebElement> items = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		
		int size = items.size();
		System.out.println(size);
		
		for(WebElement x:items) {
			String text = x.getText();
			System.out.println(text);
		}

	}

}
