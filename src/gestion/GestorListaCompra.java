package gestion;

import java.util.Scanner;

public class GestorListaCompra {
    public static String[] lista = new String[50];
    public static int contador = 0;

    public static boolean addProducto(String producto) {
        // Verificar si hay espacio en la lista
        if (contador >= lista.length) {
            return false; // Lista llena
        }
        
        // Verificar si el producto ya existe
        for (int i = 0; i < contador; i++) {
            if (lista[i].equalsIgnoreCase(producto)) {
                return false; // Producto ya existe
            }
        }
        
        // Añadir producto a la lista
        lista[contador] = producto;
        contador++;
        return true;
    }

    public static boolean eliminarProducto(String producto) {
        // Buscar el producto en la lista
        int indice = buscarProducto(producto);
        
        // Si no se encuentra, devolver false
        if (indice == -1) {
            return false;
        }
        
        // Mover todos los elementos una posición hacia atrás
        for (int i = indice; i < contador - 1; i++) {
            lista[i] = lista[i + 1];
        }
        
        // Decrementar contador y limpiar la última posición
        contador--;
        lista[contador] = null;
        return true;
    }

    public static int buscarProducto(String producto) {
        // Buscar producto en la lista (comparación case-insensitive)
        for (int i = 0; i < contador; i++) {
            if (lista[i].equalsIgnoreCase(producto)) {
                return i; // Devuelve el índice donde se encontró
            }
        }
        return -1; // No encontrado
    }

    public static String[] obtenerLista() {
        // Crear un nuevo array con solo los elementos existentes
        String[] listaActual = new String[contador];
        for (int i = 0; i < contador; i++) {
            listaActual[i] = lista[i];
        }
        return listaActual;
    }

    public static void vaciarLista() {
        // Reiniciar la lista y el contador
        for (int i = 0; i < contador; i++) {
            lista[i] = null;
        }
        contador = 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("\n=== Lista de la Compra ===");
            System.out.println("1. Añadir producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Buscar producto");
            System.out.println("4. Mostrar lista completa");
            System.out.println("5. Vaciar lista");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer
            
            switch (opcion) {
                case 1: // Añadir producto
                    System.out.print("Introduce el nombre del producto: ");
                    String productoAdd = sc.nextLine();
                    if (addProducto(productoAdd)) {
                        System.out.println("Producto añadido correctamente.");
                    } else {
                        System.out.println("Error: Producto ya existe o lista llena.");
                    }
                    break;
                    
                case 2: // Eliminar producto
                    System.out.print("Introduce el nombre del producto a eliminar: ");
                    String productoEliminar = sc.nextLine();
                    if (eliminarProducto(productoEliminar)) {
                        System.out.println("Producto eliminado correctamente.");
                    } else {
                        System.out.println("Error: Producto no encontrado.");
                    }
                    break;
                    
                case 3: // Buscar producto
                    System.out.print("Introduce el nombre del producto a buscar: ");
                    String productoBuscar = sc.nextLine();
                    int indice = buscarProducto(productoBuscar);
                    if (indice != -1) {
                        System.out.println("Producto encontrado en la posición " + (indice + 1) + ".");
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;
                    
                case 4: // Mostrar lista completa
                    String[] listaActual = obtenerLista();
                    if (listaActual.length == 0) {
                        System.out.println("La lista está vacía.");
                    } else {
                        System.out.println("\n=== Lista de Compra ===");
                        for (int i = 0; i < listaActual.length; i++) {
                            System.out.println((i + 1) + ". " + listaActual[i]);
                        }
                        System.out.println("Total: " + listaActual.length + " productos.");
                    }
                    break;
                    
                case 5: // Vaciar lista
                    System.out.print("¿Estás seguro de vaciar la lista? (S/N): ");
                    String confirmacion = sc.nextLine();
                    if (confirmacion.equalsIgnoreCase("S")) {
                        vaciarLista();
                        System.out.println("Lista vaciada correctamente.");
                    } else {
                        System.out.println("Operación cancelada.");
                    }
                    break;
                    
                case 6: // Salir
                    System.out.println("¡Hasta luego!");
                    break;
                    
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
            
        } while (opcion != 6);
        
        sc.close();
    }
}