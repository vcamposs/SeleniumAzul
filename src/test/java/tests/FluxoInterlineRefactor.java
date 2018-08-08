package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.SearchPage;
import utils.Web;

public class FluxoInterlineRefactor {
    WebDriver navegador;

    @Before
    public void setUp() {
        //navegador = Web.getDriver();
    }

    @Test
    public void searchFlight() throws InterruptedException {
        SearchPage searchPage = PageFactory.initElements(navegador, SearchPage.class);
        searchPage.selectOrigin("GRU");
        searchPage.selectDestination("CLL");
        searchPage.dateOrigin("01/10/2018");
        searchPage.dateDestination("15/10/2018");
        Thread.sleep(2000);
        searchPage.getBtnSearchTickets().click();
    }

    @After

    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        navegador.close();
        navegador.quit();
    }
}