import java.util.ArrayList;
import java.util.Scanner;

//En esta clase se guardan las listas, los objetos y los métodos que se llaman en el main

public class Gestion {
    public ArrayList<Tienda> tiendas;
    public ArrayList<Trabajador> trabajadores;
    public ArrayList<Cliente> clientes;
    public ArrayList<Producto> productos;

    public Gestion() {
        tiendas = new ArrayList<>();
        trabajadores = new ArrayList<>();
        clientes = new ArrayList<>();
        productos = new ArrayList<>();
        //Función con todos los objetos de cada clase creados
        inicializarDatos();
    }

    public void inicializarDatos() {
        Tienda tienda1 = new Tienda("Calle 123", "1234567");
        Tienda tienda2 = new Tienda("Calle 456", "7654321");
        tiendas.add(tienda1);
        tiendas.add(tienda2);

        trabajadores.add(new Trabajador("Juan", "Perez", "Calle 123", tienda1));
        trabajadores.add(new Trabajador("Maria", "Lopez", "Calle 456", tienda1));
        trabajadores.add(new Trabajador("Pedro", "Gomez", "Calle 789", tienda2));
        trabajadores.add(new Trabajador("Ana", "Garcia", "Calle 101", tienda2));

        clientes.add(new Cliente("Carlos", "Perez", "Calle 123", "1234567"));
        clientes.add(new Cliente("Ana", "Lopez", "Calle 456", "7654321"));
        clientes.add(new Cliente("Pedro", "Gomez", "Calle 789", "4567890"));
        clientes.add(new Cliente("Maria", "Garcia", "Calle 101", "0987654"));

        productos.add(new Producto("Patatas", 1.5, 100, "1234"));
        productos.add(new Producto("Manzanas", 2.5, 200, "5678"));
        productos.add(new Producto("Peras", 3.5, 300, "9101"));
        productos.add(new Producto("Uvas", 4.5, 400, "1121"));
        productos.add(new Producto("Fresas", 5.5, 500, "3141"));
        productos.add(new Producto("Platanos", 6.5, 600, "5161"));
        productos.add(new Producto("Naranjas", 7.5, 700, "7181"));
        productos.add(new Producto("Mangos", 8.5, 800, "9201"));
    }

    public void mostrarTiendas() {
        System.out.println("Tiendas disponibles: ");
        for (int i=0; i < tiendas.size(); i++) {
            //Para que no empiece en 0 al enseñar la tienda (i+1)
            System.out.println("Información de la tienda " + (i + 1));
            System.out.println("Dirección: " + tiendas.get(i).getDireccion());
            System.out.println("Teléfono: " + tiendas.get(i).getTelefono());
            System.out.println("-----------------------------------");
        }
    }

    public void mostrarTrabajadores() {
        for (int i=0; i < trabajadores.size(); i++) {
            System.out.println("Información del trabajador " + (i+1));
            System.out.println("Nombre: " + trabajadores.get(i).getNombre() + " " + trabajadores.get(i).getApellido());
            System.out.println("Dirección: " + trabajadores.get(i).getDireccion());
            System.out.println("Teléfono: " + trabajadores.get(i).getTelefono());
            System.out.println("Tienda: " + trabajadores.get(i).getTienda().getDireccion());
            System.out.println("-----------------------------------");
        }
    }

    public void mostrarProductos() {
        for (int i=0; i<productos.size(); i++) {
            System.out.println("Productos disponibles: ");
            System.out.println("Producto " + (i+1) +":");
            System.out.println("Nombre: " + productos.get(i).getNombre());
            System.out.println("Precio: " + productos.get(i).getPrecio());
            System.out.println("Cantidad: " + productos.get(i).getCantidad());
            System.out.println("SKU: " + productos.get(i).getSku());
            System.out.println("----------------------------------");
        }
    }

    public void mostrar3UltimosProductos() {
        int total = productos.size();
        //Viendo la longitud de la lista de productos si tiene más de 3 selecciona los tres últimos
        if (total >= 3) {
            for (int i = total - 3; i < total; i++) {
                Producto p = productos.get(i);
                System.out.println("Nombre: " + p.getNombre());
                System.out.println("Precio: " + p.getPrecio());
                System.out.println("Cantidad: " + p.getCantidad());
                System.out.println("SKU: " + p.getSku());
                System.out.println("----------------------------------");
            }
        } else {
            //Si hay menos de 3 enseña los que hay
            for (int i = 0; i < total; i++) {
                Producto p = productos.get(i);
                System.out.println("Nombre: " + p.getNombre());
                System.out.println("Precio: " + p.getPrecio());
                System.out.println("Cantidad: " + p.getCantidad());
                System.out.println("SKU: " + p.getSku());
                System.out.println("----------------------------------");
            }
        }
    }

    public void comprarProducto(Scanner scanner) {
        System.out.println("Comprando productos...");
        System.out.print("Ingrese el SKU del producto que desea comprar: ");
        String sku = scanner.next();
        System.out.print("Ingrese la cantidad que desea comprar: ");
        int cantidad = scanner.nextInt();

        for (Producto p : productos) {
            if (p.getSku().equals(sku)) {
                if (p.getCantidad() >= cantidad) {
                    p.setCantidad(p.getCantidad() - cantidad);
                    System.out.println("Compra exitosa. Cantidad restante: " + p.getCantidad());
                } else {
                    System.out.println("No hay suficiente cantidad en stock.");
                }
                break;
            }
        }

    }
}
