INCIDENCIAS
ID	Descripción del bug	Cómo se detectó	Cambios realizados	Commit
1	No se podía añadir un producto duplicado	Probando addProducto("Leche") dos veces	Se añadió comprobación para no añadir duplicados	commit 1: Añadido método addProducto() y opción en menú
2	Al eliminar un producto, la lista no se reordenaba	Probando eliminarProducto("Pan")	Se movieron los elementos posteriores una posición hacia atrás	commit 2: Añadido método eliminarProducto() y opción en menú
3	Buscar un producto no encontraba correctamente	Buscando con diferente capitalización ("leche" vs "Leche")	Se hizo la comparación case-insensitive	commit 3: Añadido método buscarProducto() y opción en menú
4	Mostrar lista completa mostraba null al final	Mostrando lista con 5 productos	Se generó un array nuevo con solo los elementos válidos	commit 4: Añadido método obtenerLista() y opción mostrar lista completa
5	Vaciar lista no reiniciaba contador correctamente	Probando vaciarLista() y luego añadir producto	Se reinició contador a 0 y se limpiaron todas las posiciones	commit 5: Añadido método vaciarLista() y opción vaciar lista