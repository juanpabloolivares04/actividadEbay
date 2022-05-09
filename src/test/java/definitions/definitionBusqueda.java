package definitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import steps.stepsBusqueda;

public class definitionBusqueda {
    @Steps
    stepsBusqueda objstepsBusqueda;

    @Dado("^que se requiere buscar inventario de tenis adidas$")
    public void que_se_requiere_buscar_inventario_de_tenis_adidas() {
        objstepsBusqueda.ingresoNavegador();

    }

    @Cuando("^se busque por la palabra \"([^\"]*)\"$")
    public void se_busque_por_la_palabra(String shoes) {
        objstepsBusqueda.busqueda(shoes);
    }

    @Cuando("^filtre por adidas$")
    public void filtre_por_adidas() {
        objstepsBusqueda.seleccion();
    }

    @Entonces("^se debe mostrar el numero de zapatos disponibles con el filtro aplicado$")
    public void se_debe_mostrar_el_numero_de_zapatos_disponibles_con_el_filtro_aplicado() {
        objstepsBusqueda.validacion();
        objstepsBusqueda.cierreNavegador();
    }


}
