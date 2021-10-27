package com.revature.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:8080/");
		
		WebElement addInput1 = driver.findElement(By.id("number1"));
		WebElement addInput2 = driver.findElement(By.id("number2"));
		WebElement addInputButton = driver.findElement(By.id("addNumbers"));
		
		addInput1.sendKeys("25.5");
		addInput2.sendKeys("15.5");
		addInputButton.click();
		
		
		driver.switchTo().frame("addResult");
		WebElement addOutput = driver.findElement(By.tagName("pre"));
		System.out.println("Example: 25.5 + 15.5 = " + addOutput.getText());
		
		driver.switchTo().defaultContent();
		
		
		WebElement subtractInput1 = driver.findElement(By.id("number3"));
		WebElement subtractInput2 = driver.findElement(By.id("number4"));
		WebElement subtractInputButton = driver.findElement(By.id("subtractNumbers"));
		
		subtractInput1.sendKeys("89.6");
		subtractInput2.sendKeys("2.1");
		subtractInputButton.click();
		
		
		driver.switchTo().frame("subtractResult");
		WebElement subtractOutput = driver.findElement(By.tagName("pre"));
		System.out.println("Example: 89 - 2 = " + subtractOutput.getText());
		
		driver.switchTo().defaultContent();
		
		WebElement multiplyInput1 = driver.findElement(By.id("number5"));
		WebElement multiplyInput2 = driver.findElement(By.id("number6"));
		WebElement multiplyInputButton = driver.findElement(By.id("multiplyNumbers"));
		
		
		multiplyInput1.sendKeys("5");
		multiplyInput2.sendKeys("6");
		multiplyInputButton.click();
		
		
		driver.switchTo().frame("multiplyResult");
		WebElement multiplyOutput = driver.findElement(By.tagName("pre"));
		System.out.println("Example: 5.8 x 6.5 = " + multiplyOutput.getText());
		
		driver.switchTo().defaultContent();
		
		
		WebElement divideInput1 = driver.findElement(By.id("number7"));
		WebElement divideInput2 = driver.findElement(By.id("number8"));
		WebElement divideInputButton = driver.findElement(By.id("divideNumbers"));
		
		divideInput1.sendKeys("12");
		divideInput2.sendKeys("4");
		divideInputButton.click();
		
		
		driver.switchTo().frame("divideResult");
		WebElement divideOutput = driver.findElement(By.tagName("pre"));
		System.out.println("Example: 50 / 2 = " + divideOutput.getText());
		
		driver.switchTo().defaultContent();
		

	}
}
