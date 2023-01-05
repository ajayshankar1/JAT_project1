package main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.BaseClass;

public class TestCases extends BaseClass {
	
	String emp_code="";
	
	@Test
	public void testLogin1() throws Exception {
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	
		Thread.sleep(3000);
	}
	
	@Test
	public void testLogin2() throws Exception {

		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Invalid password");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	
		Thread.sleep(3000);
	}

	
	@Test
	public void testPIM1() throws Exception {
		//adding employee details
//		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']//*[text()='PIM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("testAjay");
		driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys("testMiddle");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("testLast");
//		emp_code= driver.findElement(By.xpath("//label[text()='Employee Id']//following::div//input")).getText();
//		emp_code= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).getText();
		WebElement element = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input"));
		System.out.println(element.getText());
//		System.out.println("The employee code is "+emp_code);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text()='Job']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='yyyy-mm-dd']")).sendKeys("2021-11-11");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Database Administrator']")).click();
		driver.findElement(By.xpath("//label[text()='Job Category']//following::div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Officials and Managers']")).click();
		driver.findElement(By.xpath("//label[text()='Sub Unit']//following::div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Administration']")).click();
		
		driver.findElement(By.xpath("//label[text()='Location']//following::div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='HQ - CA, USA']")).click();
		driver.findElement(By.xpath("//label[text()='Employment Status']//following::div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Full-Time Permanent']")).click();
		
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
	
		Thread.sleep(3000);
	}
	
	
	@Test
	public void testPIM2() throws Exception {
		//editing employee details
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']//*[text()='PIM']")).click();
		Thread.sleep(2000);
	

		
		driver.findElement(By.xpath("//input[@placeholder=\"Type for hints...\"]")).sendKeys("testAjay testMiddle testLast");
		driver.findElement(By.xpath("//label[text()='Employment Status']//following::div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Full-Time Permanent']")).click();
		
driver.findElement(By.xpath("//label[text()='Job Title']//following::div")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Database Administrator']")).click();
		
		driver.findElement(By.xpath("//label[text()='Sub Unit']//following::div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Administration']")).click();
		
		driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@class=\"oxd-icon-button oxd-table-cell-action-space\"]//following::button")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("1");
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
		
		Thread.sleep(3000);
	}
	
	@Test
	public void testPIM3() throws Exception {
		//deleting employee
Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']//*[text()='PIM']")).click();
		Thread.sleep(2000);
	
		
		driver.findElement(By.xpath("//input[@placeholder=\"Type for hints...\"]")).sendKeys("testAjay1 testMiddle testLast");
		driver.findElement(By.xpath("//label[text()='Employment Status']//following::div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Full-Time Permanent']")).click();
		
driver.findElement(By.xpath("//label[text()='Job Title']//following::div")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Database Administrator']")).click();
		
		driver.findElement(By.xpath("//label[text()='Sub Unit']//following::div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Administration']")).click();
		
		driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@class='oxd-icon-button oxd-table-cell-action-space'][1]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
		
		
		Thread.sleep(3000);
	}
	
	
}
