package com.naven.examregister.SignUpTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SignUpTest {

  private WebDriver driver;
  private String baseUrl;

  @BeforeClass
  public void setUp() throws Exception {
    driver = new ChromeDriver();
    baseUrl = "http://localhost:8080/signup"; // Update URL to your signup page
  }

  @Test
  public void testSignUp() throws Exception {
    driver.get(baseUrl);

    // Find form elements using appropriate locators (id, name, etc.)
    driver.findElement(By.id("username")).sendKeys("newuser1");
    driver.findElement(By.id("password")).sendKeys("password1231");
    driver.findElement(By.id("college")).sendKeys("Sample College1");
    driver.findElement(By.id("department")).sendKeys("Computer Science1");
    driver.findElement(By.id("year_of_study")).sendKeys("Senior1");

    // Submit the form
    driver.findElement(By.id("submit")).click();

    // Assert successful registration (check for confirmation message, etc.)
    
  }

  @AfterClass
  public void tearDown() throws Exception {
    driver.quit();
  }
}
