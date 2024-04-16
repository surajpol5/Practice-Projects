import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Suraj");
		driver.findElement(By.name("email")).sendKeys("hga@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("abcroot");
		driver.findElement(By.className("form-check-label")).click();
		driver.findElement(By.id("exampleFormControlSelect1")).click();
		WebElement options = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(options);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByIndex(1);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("Female");
		System.out.println(dropdown.getFirstSelectedOption().getText());

		driver.findElement(By.id("inlineRadio2")).click();

		driver.findElement(By.name("bday")).sendKeys("02/11/1996");

		driver.findElement(By.cssSelector("[type='submit']")).click();

		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());

	}

}
