#language: es
  Característica: Realizar una busqueda en la pagina ebay
    Escenario: Busqueda Ebay
      Dado que se requiere buscar inventario de tenis adidas
      Cuando se busque por la palabra "shoes"
      Y filtre por "adidas"
      Entonces se debe mostrar el numero de zapatos disponibles con el filtro aplicado