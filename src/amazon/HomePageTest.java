package amazon;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends HomePag_Old {

    String ac="//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]";
    String dc="\"air condition\"";
    @Test
    public void testAiCondition() throws InterruptedException {
        checkAirCondition();
        String expectedResult=dc;
        String actualResult=driver.findElement(By.xpath(ac)).getText();
        Assert.assertEquals(actualResult,expectedResult,"Fail");
        driver.close();
    }





}
