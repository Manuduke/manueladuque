package Practico9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Ejercicio14 {

    @Test
    public void netflixTest(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https:/www.netflix.com");

        List<WebElement> listaH1s = driver.findElements(By.tagName("h1"));
        System.out.println("La cantidad de h1s es " + listaH1s.size());

        for (WebElement h1 : listaH1s){
            System.out.println("-->h1 " + h1.getText());
        }

        System.out.println("***************************");

        List<WebElement> listaH2s = driver.findElements(By.tagName("h2"));
        System.out.println("La cantidad de h2s es " + listaH2s.size());

        for (WebElement h2 : listaH2s){
            System.out.println("-->h2 " + h2.getText());
        }
        System.out.println("***************************");

        driver.navigate().refresh();

        List<WebElement> listaBotones = driver.findElements(By.tagName("button"));
        System.out.println("La cantidad de botones es " + listaBotones.size());

        for (WebElement btn : listaBotones){
            System.out.println("-->boton " + btn.getText());
        }
        System.out.println("***************************");

        List<WebElement> listaDivs = driver.findElements(By.tagName("div"));
        System.out.println("La cantidad de div es " + listaDivs.size());

        System.out.println("***************************");

        System.out.println("El titulo de la pagina es " + driver.getTitle());

        System.out.println("***************************");

        List<WebElement> listaLinks = driver.findElements(By.tagName("a"));
        System.out.println("La cantidad de links es " + listaLinks.size());

    }
}
