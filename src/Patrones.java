import java.util.Scanner;

public class Patrones {
    public static void main(String[] args) {
        int opcion, cantidad = 0;
        Scanner sc = new Scanner(System.in);
        do {
            menu();
            opcion = sc.nextInt();
            if (opcion == 1) {
                cantidad = pedirCantidad();
                dibujarPatron1(cantidad);
            } else if (opcion == 2) {
                cantidad = pedirCantidad();
                dibujarPatron2(cantidad);
            } else if (opcion == 3) {
                cantidad = pedirCantidad();
                dibujarPatron3(cantidad);
            }
        } while (opcion != 4);

    }

    public static void menu() {
        System.out.println("1. Dibujar patrón *.");
        System.out.println("2. Dibujar patrón 1234");
        System.out.println("3. Dibujar patrón ||*");
        System.out.println("4. Salir");
    }

    public static int pedirCantidad() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos: ");
        return sc.nextInt();
    }

    public static void dibujarPatron1(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            if (i % 2 == 0) {
                System.out.print("*");
            } else {
                System.out.print(".");
            }
        }
        System.out.println();
    }

    public static void dibujarPatron2(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            if (i % 4 == 0) {
                System.out.print("1");
            } else if (i % 4 == 1) {
                System.out.print("2");
            } else if (i % 4 == 2) {
                System.out.print("3");
            } else {
                System.out.print("4");
            }
        }
        System.out.println();
    }

    public static void dibujarPatron3(int cantidad) {
        for (int i = 1; i <= cantidad; i++) {
            if (i % 3 == 0) {
                System.out.print("*");
            } else {
                System.out.print("|");
            }
        } System.out.println();
    }
}
