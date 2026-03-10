import java.util.Scanner;

public class Mantenimiento {

    Cajero cajero;
    Scanner scanner = new Scanner(System.in);

    public Mantenimiento(Cajero cajero) {
        this.cajero = cajero;
    }

    public void menuMantenimiento() {

        int opcion;

        do {

            System.out.println("\n--- MANTENIMIENTO ---");
            System.out.println("1. Agregar billetes");
            System.out.println("2. Ver billetes");
            System.out.println("3. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    agregarBilletes();
                    break;

                case 2:
                    verBilletes();
                    break;

            }

        } while (opcion != 3);

    }

    public void agregarBilletes() {

        System.out.print("Cantidad de billetes de 20000: ");
        cajero.b20000 += scanner.nextInt();

        System.out.print("Cantidad de billetes de 10000: ");
        cajero.b10000 += scanner.nextInt();

        System.out.print("Cantidad de billetes de 5000: ");
        cajero.b5000 += scanner.nextInt();

        System.out.print("Cantidad de billetes de 2000: ");
        cajero.b2000 += scanner.nextInt();

        System.out.print("Cantidad de billetes de 1000: ");
        cajero.b1000 += scanner.nextInt();

    }

    public void verBilletes() {

        System.out.println("\n--- BILLETES EN CAJERO ---");

        System.out.println("Cantidad de ₡20000: " + cajero.b20000);
        System.out.println("Cantidad de ₡10000: " + cajero.b10000);
        System.out.println("Cantidad de ₡5000: " + cajero.b5000);
        System.out.println("Cantidad de ₡2000: " + cajero.b2000);
        System.out.println("Cantidad de ₡1000: " + cajero.b1000);

    }
}