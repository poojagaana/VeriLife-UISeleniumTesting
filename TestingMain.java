package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestingMain {
	
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\verizon\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver myDriver=new ChromeDriver();
		myDriver.get("http://localhost:3000/");
		Thread.sleep(1000);
		myDriver.manage().window().maximize();
		
		myDriver.findElement(By.xpath("//*[@id='root']/div/div[1]/nav/ul/div[2]/li/a")).click();
		Thread.sleep(1000);
		myDriver.findElement(By.xpath("//*[@id='root']/div/div[1]/nav/ul/div[3]/a")).click();
		Thread.sleep(1000);
		myDriver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/form/div/div[1]/div/div/div[1]/div/input")).sendKeys("David");
		Thread.sleep(1000);
		myDriver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/form/div/div[1]/div/div/div[2]/div/input")).sendKeys("05/06/2019");
		Thread.sleep(1000);
		myDriver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/form/div/div[2]/div/div/div[1]/div/input")).sendKeys("8405674888");
		Thread.sleep(1000);
		myDriver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/form/div/div[2]/div/div/div[2]/div/input")).sendKeys("abc@gmail.com");
		Thread.sleep(1000);
		myDriver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/form/div/div[2]/div/div/div[3]/div/input")).sendKeys("7th Cross Street,Guindy,Chennai-600041");
		Thread.sleep(1000);
		myDriver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/form/div/div[2]/div/div/div[4]/div[1]/input")).sendKeys("Chennai");
		Thread.sleep(1000);
		myDriver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/form/div/div[2]/div/div/div[4]/div[2]/input")).sendKeys("TamilNadu");
		Thread.sleep(1000);
		myDriver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/form/div/div[2]/div/div/div[5]/div[1]/input")).sendKeys("India");
		Thread.sleep(1000);
		myDriver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/form/div/div[2]/div/div/div[5]/div[2]/input")).sendKeys("600028");
		Thread.sleep(1000);
		myDriver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/form/div/div[1]/div/div/div[4]/div/input")).sendKeys("06/05/2019");
		Thread.sleep(1000);
		myDriver.findElement(By.xpath("//*[@id='donor_status_1']")).click();
		Thread.sleep(1000);
		Select s=new Select(myDriver.findElement(By.id("id")));
		s.selectByIndex(3);
		Thread.sleep(1000);
		myDriver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/form/div/div[3]/input")).click();
		Thread.sleep(2000);
		
		myDriver.findElement(By.xpath("//*[@id='dropdownMenuButton']")).click();
		Thread.sleep(1000);
        myDriver.findElement(By.xpath("	//*[@id='root']/div/div[1]/nav/ul/div[7]/div/div/a[1]")).click();
		Thread.sleep(1000);
		myDriver.findElement(By.xpath("//*[@id='id']")).sendKeys("123");
		Thread.sleep(1000);
		myDriver.findElement(By.xpath("//*[@id='password']")).sendKeys("123");
		Thread.sleep(1000);
		myDriver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/form/button")).click();
		Thread.sleep(2000);
		
		myDriver.close();
		
		
	}

}
