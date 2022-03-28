package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Act3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		try {
			driver.get("https://es.wikipedia.org");
			driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys("Pablo Picasso");
			driver.findElement(By.xpath("//*[@id=\"searchButton\"]")).click();
			Thread.sleep(3000);
			// driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table/tbody/tr[2]/td/a/img"));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			driver.quit();
		}

	}

}
