package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePag_Old {
     WebDriver driver = null;
     String pop= "webdriver.chrome.driver";
     String pick="BrowserDriver/mac/chromedriver";
     String path="https://www.amazon.com/";
    //public static void main(String[] args) throws InterruptedException {
@Test
public void learnTestClass() throws InterruptedException {
    // Set Browser Driver (driverSyntax, driverPath)
    System.setProperty(pop,pick);
    // Reference variable of Browser Driver
     driver = new ChromeDriver();
    //Given iam at amazon homepage
    // url
    driver.get(path);
    // for  search box inspect
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Hand Sanitizer");// web edit field
    // for  search button
    driver.findElement(By.id("nav-search-submit-button")).click();
    //set time
    Thread.sleep(3000);
    //for  search box clear method
    driver.findElement(By.id("twotabsearchtextbox")).clear();


    //driver.findElement(By.id("nav-search-submit-button")).click();

    driver.close();
}

    //}
   @Test
    public void getText(){
       System.setProperty(pop,pick);
        driver = new ChromeDriver();
       driver.get(path);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("java book");
        driver.findElement(By.id("nav-search-submit-button")).click();
        String key = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).getText();
        System.out.println(key);
       driver.close();

    }

    public void connectSelenium(){
        System.setProperty(pop,pick);
        driver=new ChromeDriver();
        driver.get(path);
    }
    @Test
    public void checkAirCondition() throws InterruptedException {
    connectSelenium();
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("air condition");
     driver.findElement(By.id("nav-search-submit-button")).click();
    String cooler=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).getText();
        System.out.println(cooler);
     Thread.sleep(5000);
     //driver.close();
    }




}
