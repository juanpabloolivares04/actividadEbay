package pageObject;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

@DefaultUrl("https://www.ebay.com/")

public class pageBusqueda extends PageObject {
    //Se define los objectos interactuables
    String txtSearch = "//input[@id='gh-ac']";
    String btnSearch = "//input[@id='gh-btn']";
    String chkAdidas = "//input[@aria-label='adidas']";
    String txtTotalSearch = "//h1[@class='srp-controls__count-heading']/span[1]";


    //Escoge la ruta del driver
    @Before
    public void setUP() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
    }


    @WhenPageOpens
    //Metodo abre el navegador y lo maximiza
    public void maxPantalla() {

        getDriver().manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);
        getDriver().manage().window().maximize();

    }

    //Se busca el campo de usuario y se envia el usuario descrito en el feature
    public void busquedaTenis(String shoes) {
        shoes = "shoes";
        find(By.xpath(txtSearch)).sendKeys(shoes);
        find(By.xpath(btnSearch)).click();
    }

    //Se busca la marca indicada
    public void busquedaMarca() {
        find(By.xpath(chkAdidas)).click();
    }

    //Se valida el campo indicado
    public void validacionInventario() {

        String total = find(By.xpath(txtTotalSearch)).getText();
        System.out.println("Se encontraron " + total + " resultados");
        Boolean flagValidation = false;
        total = total.replace(".", "");
        if (Integer.parseInt(total) > 2000) {
            flagValidation = true;
        }
        Assert.assertTrue("No existen mas de 2000 resultados", flagValidation);

    }

    //Se cierra el navegador
    public void cierreNavegador() {
        getDriver().quit();
    }

}
