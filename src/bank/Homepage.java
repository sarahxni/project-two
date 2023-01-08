package bank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Homepage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver ;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
 
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/button")).click();
		
		Thread.sleep(1000);
	
	    driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]")).click();
		Thread.sleep(3000);

	    driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys("Sarah");

	    driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys("Nidal");

	    driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")).sendKeys("11234");

		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button")).click();
		Thread.sleep(3000);

		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("/html/body/div/div/div[1]/button[1]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/button")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"userSelect\"]")).click();
		Thread.sleep(1000);
		
	   driver.findElement(By.xpath("//*[@id=\"userSelect\"]")).sendKeys("sa");
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"userSelect\"]")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/button")).click();

		
		

	    

		
		
		

		
		


	    

	    


	    

	}

}
