package Test;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Act4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		// https://testsheepnz.github.io/BasicCalculator.html
		try {
			driver.get("https://testsheepnz.github.io/BasicCalculator.html");
			driver.findElement(By.xpath("//*[@id=\"number1Field\"]")).sendKeys("5");
			driver.findElement(By.xpath("//*[@id=\"number2Field\"]")).sendKeys("5");
			driver.findElement(By.xpath("//*[@id=\"selectOperationDropdown\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"selectOperationDropdown\"]/option[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"calculateButton\"]")).click();
			assertEquals("10",driver.findElement(By.xpath("//*[@id=\"numberAnswerField\"]")).getDomProperty("value"));
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"selectOperationDropdown\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"selectOperationDropdown\"]/option[3]")).click();
			driver.findElement(By.xpath("//*[@id=\"calculateButton\"]")).click();
			assertEquals("25",driver.findElement(By.xpath("//*[@id=\"numberAnswerField\"]")).getDomProperty("value"));
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"selectOperationDropdown\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"selectOperationDropdown\"]/option[2]")).click();
			driver.findElement(By.xpath("//*[@id=\"calculateButton\"]")).click();
			assertEquals("0",driver.findElement(By.xpath("//*[@id=\"numberAnswerField\"]")).getDomProperty("value"));
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			driver.quit();
		}

	}

}
