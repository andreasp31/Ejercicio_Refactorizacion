import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Gestion gestion = new Gestion();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        while (true) {
            System.out.println("\n------------------ Menú ---------------------");
            System.out.println("1. Mostrar información de todas las tiendas");
            System.out.println("2. Mostrar información de todos los trabajadores");
            System.out.println("3. Mostrar productos disponibles");
            System.out.println("4. Últimos 3 productos añadidos");
            System.out.println("5. Comprar productos");
            System.out.println("6. Salir");
            System.out.println("-----------------------------------------------");
            System.out.print("Ingrese la opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n");
                    gestion.mostrarTiendas();
                    break;
                case 2:
                    System.out.println("\n");
                    gestion.mostrarTrabajadores();
                    break;
                case 3:
                    System.out.println("\n");
                    gestion.mostrarProductos();
                    break;
                case 4:
                    System.out.println("\n");
                    gestion.mostrar3UltimosProductos();
                    break;
                case 5:
                    System.out.println("\n");
                    gestion.comprarProducto(scanner);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}