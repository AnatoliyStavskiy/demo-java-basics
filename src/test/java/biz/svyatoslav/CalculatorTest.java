package biz.svyatoslav;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorTest {
    @Test
    public void test1(){
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");
        String inputNameXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input";
        By inputNameBy = By.xpath(inputNameXpath);
        WebElement inputNameWebElement = webDriver.findElement(inputNameBy);
        inputNameWebElement.sendKeys("John");

        String inputHeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input";
        By inputHeightBy = By.xpath(inputHeightXpath);
        WebElement inputHeightWebElement = webDriver.findElement(inputHeightBy);
        inputHeightWebElement.sendKeys("180");

        String inputWeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input";
        By inputWeightBy = By.xpath(inputWeightXpath);
        WebElement inputWeightWebElement = webDriver.findElement(inputWeightBy);
        inputWeightWebElement.sendKeys("75");

        String genderXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[1]";
        By genderBy = By.xpath(genderXpath);
        WebElement genderWebElement = webDriver.findElement(genderBy);
        genderWebElement.click();

        String ButtonCalculateXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By ButtonCalculateBy = By.xpath(ButtonCalculateXpath);
        WebElement ButtonCalculateWebElement = webDriver.findElement(ButtonCalculateBy);
        ButtonCalculateWebElement.click();

    }
}
