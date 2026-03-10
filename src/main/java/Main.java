import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Cajero cajero = new Cajero();
        Mantenimiento mantenimiento = new Mantenimiento(cajero);
        Retiro retiro = new Retiro(cajero);

        int opcion;

        do {

            System.out.println("\n===== CAJERO AUTOMATICO =====");
            System.out.println("0. Mantenimiento");
            System.out.println("1. Retirar monto");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 0:
                    mantenimiento.menuMantenimiento();
                    break;

                case 1:
                    retiro.retirarMonto();
                    break;

                case 2:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

        } while (opcion != 2);

    }
}