import java.util.Scanner;

public class PatronesAnidados {
    public static void main(String[] args) {
        int opcion, cantidad = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Seleccione una opción: ");
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
            } else if (opcion == 4) {
                cantidad = pedirCantidad();
                dibujarPatron4(cantidad);
            } else {
                System.out.println("Opción no válida");
            }
        } while (opcion != 5);

    }

    public static void menu() {
        System.out.println("_____________________________________");
        System.out.println("1. Dibujar patrón 1: ");
        for (int i = 1; i <= 5; i++) {
            System.out.printf("n = %d:\n", i);
            System.out.print("\n");
            dibujarPatron1(i);

        } System.out.println("_____________________________________");
        System.out.println("2. Dibujar patrón ");
        for (int i = 1; i <= 5; i++) {
            System.out.printf("n = %d:\n", i);
            System.out.print("\n");
            dibujarPatron2(i);
        } System.out.println("_____________________________________");
        System.out.println("3. Dibujar patrón ");
        for (int i = 1; i <= 6; i++) {
            System.out.printf("n = %d:\n", i);
            System.out.print("\n");
            dibujarPatron3(i);
        } System.out.println("_____________________________________");
        System.out.println("4. Dibujar patrón ");
        for (int i = 1; i <= 5; i++) {
            System.out.printf("n = %d:\n", i);
            System.out.print("\n");
            dibujarPatron4(i);
        } System.out.println("_____________________________________");
        System.out.println("5. Salir");
        System.out.println("_____________________________________");
    }

    public static int pedirCantidad() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos: ");
        return sc.nextInt();
    }

    public static void dibujarPatron1(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            for(int j = 0; j < cantidad; j++) {
                if (i==0 || i == cantidad-1) {
                    System.out.print(" * ");
                } else if (j == 0 || j == cantidad-1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            } System.out.print("\n");
        } System.out.println();
    }

    public static void dibujarPatron2(int cantidad) {
          for (int i = 0; i < cantidad; i++) {
                for(int j = 0; j < cantidad; j++) {
                 if (i==0 || i == cantidad-1) {
                      System.out.print(" * ");
                 } else if (j == cantidad-i) {
                      System.out.print(" * ");
                 } else {
                      System.out.print("  ");
                 }
                } System.out.print("\n");
          } System.out.println();
    }

    public static void dibujarPatron3(int cantidad){
        for (int i = 0; i < cantidad; i++) {
            for(int j = 0; j < cantidad; j++) {
                if (i == j || i + j == cantidad - 1) {
                    System.out.print(" X ");
                } else {
                    System.out.print("   ");
                }
            }System.out.print("\n");
            System.out.println();
        }
    }

    public static void dibujarPatron4(int cantidad){
        for (int i = 0; i < cantidad; i++) {
            for(int j = 0; j < cantidad; j++) {
                if (i == j || j != 0 && j != cantidad -1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("  ");
                }
            }  System.out.println();
        }
    }
}
