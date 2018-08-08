package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {
    public static WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Abrir a pagina "https://interline.tudoazul.com/"
        navegador.get("https://interline.tudoazul.com/");

        //Com o navegador aberto a tela a maximizada
        navegador.manage().window().maximize();

        return navegador;
    }

    public static WebDriver getDriverTopper(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Abrir a pagina "https://interline.tudoazul.com/"
        navegador.get("https://interline.tudoazul.com/");

        //Com o navegador aberto a tela a maximizada
        navegador.manage().window().maximize();

        return navegador;
    }
}
