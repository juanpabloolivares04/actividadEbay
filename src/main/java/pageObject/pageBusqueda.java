package pageObject;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.ebay.com/")

public class pageBusqueda extends PageObject {
    String txtSearch="//input[@id='gh-ac']";
    String btnSearch="//input[@id='gh-btn']";
    String chkAdidas="//input[@aria-label='adidas']";
    String txtTotalSearch="//h1[@class='srp-controls__count-heading']/span[1]";


}
