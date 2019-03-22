import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vezba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		String url="http://newtours.demoaut.com";
		
		driver.get(url);
		driver.navigate().to("http://newtours.demoaut.com/mercuryregister.php?osCsid=6ee5cde645f95bdf7eb34aae37ed77f8");
		WebElement FirstName=driver.findElement(By.xpath("//input[@name='firstName']"));
		FirstName.click();
		FirstName.sendKeys("Marija");
		WebElement LastName=driver.findElement(By.xpath("//input[@name='lastName']"));
		LastName.click();
		LastName.sendKeys("Maslesa");
		WebElement Phone=driver.findElement(By.xpath("//input[@name='phone']"));
		Phone.click();
		Phone.sendKeys("46365");
		WebElement Email=driver.findElement(By.xpath("//input[@id='userName']"));
		Email.click();
		Email.sendKeys("maslesamarija@gmail.com");
		WebElement Address=driver.findElement(By.xpath("//input[@name='address1']"));
		Address.click();
		Address.sendKeys("bul ars car 139");
		WebElement City=driver.findElement(By.xpath("//input[@name='city']"));
		City.click();
		City.sendKeys("Belgrade");
		WebElement State=driver.findElement(By.xpath("//input[@name='state']"));
		State.click();
		State.sendKeys("Serbia");
		WebElement PostalCode=driver.findElement(By.xpath("//input[@name='postalCode']"));
		PostalCode.click();
		PostalCode.sendKeys("11070");
		WebElement Country=driver.findElement(By.xpath("//select[@name='country']"));
		
		Country.sendKeys("serbia");
		Country.click();

		WebElement UserName=driver.findElement(By.xpath("//input[@id='email']"));
		UserName.click();
		UserName.sendKeys("marijamaslesa");
		WebElement Password=driver.findElement(By.xpath("//input[@name='password']"));
		Password.click();
		Password.sendKeys("marija92");
		WebElement ConfirmPassword=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		ConfirmPassword.click();
		ConfirmPassword.sendKeys("marija92");
		WebElement Confirm=driver.findElement(By.xpath("//input[@name='register']"));
		Confirm.click();
		
		
		
		
	}

}
