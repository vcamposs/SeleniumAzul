package tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.util.concurrent.TimeUnit;

public class FluxoInterline {
    @Test
    public void setUp() throws InterruptedException {
        //Abre o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Abrir a pagina "https://interline.tudoazul.com/"
        navegador.get("https://interline.tudoazul.com/");

        //Com o navegador aberto a tela a maximizada
        navegador.manage().window().maximize();

        // Inicio Fluxo
        navegador.findElement(By.id("btnRoundTrip")).click(); // ida e volta

        navegador.findElement(By.id("autocompleteFlightOrigin")).sendKeys("GRU");
        navegador.findElement(By.id("autocomplete-link-item-autocompleteFlightOrigin-1")).click();

        navegador.findElement(By.id("autocompleteFlightDestination")).sendKeys("CLL");
        navegador.findElement(By.id("autocomplete-item-autocompleteFlightDestination-1")).click();


        // Data Ida ----------------------------------------------------------------------------------------------------
        WebElement dataIda = navegador.findElement(By.id("calendarStartDate_group"))
                .findElement(By.className("form-control"));

        dataIda.click();
        dataIda.clear();
        dataIda.sendKeys("01/10/2018");

        // Data Volta --------------------------------------------------------------------------------------------------
        WebElement dataVolta = navegador.findElement(By.id("calendarEndDate_group"))
                .findElement(By.className("form-control"));

        dataVolta.click();
        dataVolta.clear();
        dataVolta.sendKeys("22/10/2018");
        dataVolta.sendKeys(Keys.TAB);

        Thread.sleep(1000);

        // Cotar passagem em pontos ------------------------------------------------------------------------------------
        navegador.findElement(By.id("btnSearchTickets")).click();
    }
}
