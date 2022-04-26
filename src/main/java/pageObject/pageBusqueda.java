package pageObject;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

@DefaultUrl("https://www.ebay.com/")

public class pageBusqueda extends PageObject {
    String txtSearch="//input[@id='gh-ac']";
    String btnSearch="//input[@id='gh-btn']";
    String chkAdidas="//input[@aria-label='adidas']";
    String txtTotalSearch="//h1[@class='srp-controls__count-heading']/span[1]";

    @WhenPageOpens
    //Metodo abre el navegador y lo maximiza
    public void maxPantalla() {
        // getDriver().quit();
        getDriver().manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);
        getDriver().manage().window().maximize();
    }

    //Se busca el campo de usuario y se envia el usuario descrito en el feature
    public void busquedaTenis() {

        find(By.xpath(txtSearch)).sendKeys("adidas");
    }


}
