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

@Step
    public void busqueda(String shoes){
    objpageBusqueda.busquedaTenis(shoes);
}

    @Step
    public void seleccion(){
        objpageBusqueda.busquedaMarca();
    }

    @Step
    public void validacion(){
        objpageBusqueda.validacionInventario();
    }

    @Step
    public void cierreNavegador(){
    objpageBusqueda.cierreNavegador();
    }

}
