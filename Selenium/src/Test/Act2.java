package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Act2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		try {
			driver.get("https://www.odoo.com/es_ES");
			driver.findElement(By.xpath("//*[@id=\"top_menu\"]/div/li/a")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"wrapwrap\"]/main/div/div/div/form/div[3]/div[1]/a[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys("a_isabel.maye.piulestan@iespablopicasso.es");
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Pepito");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Pepito.1");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"wrapwrap\"]/main/div/div/div/form/div[4]/button")).click();
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			driver.quit();
		}

	}
}
