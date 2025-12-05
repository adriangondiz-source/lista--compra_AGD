package gestion;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GestorListaCompraTest {


@BeforeEach
public void setUp() {
    // Se ejecuta antes de cada test
    GestorListaCompra.vaciarLista();
}

@Test
public void testAddProducto() {
    assertTrue(GestorListaCompra.addProducto("Leche")); // Producto agregado
    assertFalse(GestorListaCompra.addProducto("Leche")); // Producto duplicado
}

@Test
public void testEliminarProducto() {
    GestorListaCompra.addProducto("Pan");
    assertTrue(GestorListaCompra.eliminarProducto("Pan")); // Eliminado correctamente
    assertFalse(GestorListaCompra.eliminarProducto("Pan")); // Ya no existe
}

@Test
public void testBuscarProducto() {
    GestorListaCompra.addProducto("Huevos");
    assertEquals(0, GestorListaCompra.buscarProducto("Huevos")); // Encontrado en índice 0
    assertEquals(-1, GestorListaCompra.buscarProducto("Azúcar")); // No existe
}

@Test
public void testObtenerLista() {
    GestorListaCompra.addProducto("Arroz");
    String[] lista = GestorListaCompra.obtenerLista();
    assertEquals(1, lista.length); // Solo 1 producto
    assertEquals("Arroz", lista[0]);
}

@Test
public void testVaciarLista() {
    GestorListaCompra.addProducto("Tomate");
    GestorListaCompra.vaciarLista();
    assertEquals(0, GestorListaCompra.obtenerLista().length); // Lista vacía

}


}
