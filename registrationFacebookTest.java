package Clase2.Practico10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class registrationFacebookTest {

    private WebDriver facebookLink(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        return driver;
    }

    private void setBirthdate (WebDriver driver,String day, String month, String year){

        WebElement days = driver.findElement(By.name("birthday_day"));
        WebElement months = driver.findElement(By.name("birthday_month"));
        WebElement years = driver.findElement(By.name("birthday_year"));

        Select comboDay = new Select(days);
        Select comboMonth = new Select(months);
        Select comboYear = new Select(years);

        comboDay.selectByVisibleText(day);
        comboMonth.selectByVisibleText(month);
        comboYear.selectByVisibleText(year);
    }

    @Test
    public void fullRegistrationTest() throws InterruptedException{
        WebDriver driver = facebookLink();

        driver.findElement(By.linkText("Create New Account")).click();

        Thread.sleep(2000);

        WebElement firstname = driver.findElement(By.name("firstname"));
        firstname.sendKeys("John");

        WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.sendKeys("Smith");

        WebElement phone = driver.findElement(By.name("reg_email__"));
        phone.sendKeys("5555555");

        WebElement password = driver.findElement(By.name("reg_passwd__"));
        password.sendKeys("123456789");

        setBirthdate(driver, "26", "Jun","1980");

        List<WebElement> listaSexos = driver.findElements(By.name("sex"));
        WebElement maleElement = listaSexos.get(1);
        maleElement.click();



    }
}

