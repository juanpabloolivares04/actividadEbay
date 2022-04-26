package pageObject;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.ebay.com/")

public class pageBusqueda extends PageObject {
    String txtSearch="//input[@id='gh-ac']";
    String btnSearch="//input[@id='gh-btn']";


}
