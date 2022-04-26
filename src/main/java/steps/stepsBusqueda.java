package steps;

import net.thucydides.core.annotations.Step;
import pageObject.pageBusqueda;

public class stepsBusqueda {

    pageBusqueda objpageBusqueda;

@Step
public void ingresoNavegador(){
objpageBusqueda.open();
objpageBusqueda.maxPantalla();
}



}
