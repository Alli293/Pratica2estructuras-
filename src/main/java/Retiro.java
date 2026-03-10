import java.util.Scanner;

public class Retiro {

    Cajero cajero;
    Scanner scanner = new Scanner(System.in);

    public Retiro(Cajero cajero) {
        this.cajero = cajero;
    }

    public void retirarMonto() {

        System.out.print("Ingrese el monto a retirar: ");
        int monto = scanner.nextInt();

        int original = monto;

        int r20000 = Math.min(monto / 20000, cajero.b20000);
        monto -= r20000 * 20000;

        int r10000 = Math.min(monto / 10000, cajero.b10000);
        monto -= r10000 * 10000;

        int r5000 = Math.min(monto / 5000, cajero.b5000);
        monto -= r5000 * 5000;

        int r2000 = Math.min(monto / 2000, cajero.b2000);
        monto -= r2000 * 2000;

        int r1000 = Math.min(monto / 1000, cajero.b1000);
        monto -= r1000 * 1000;

        if (monto != 0) {

            System.out.println("Imposible dispensar la cantidad solicitada");
            return;

        }

        cajero.b20000 -= r20000;
        cajero.b10000 -= r10000;
        cajero.b5000 -= r5000;
        cajero.b2000 -= r2000;
        cajero.b1000 -= r1000;

        System.out.println("\n--- BILLETES ENTREGADOS ---");

        if (r20000 > 0) System.out.println("Cantidad de ₡20000: " + r20000);
        if (r10000 > 0) System.out.println("Cantidad de ₡10000: " + r10000);
        if (r5000 > 0) System.out.println("Cantidad de ₡5000: " + r5000);
        if (r2000 > 0) System.out.println("Cantidad de ₡2000: " + r2000);
        if (r1000 > 0) System.out.println("Cantidad de ₡1000: " + r1000);

        System.out.println("----------------------");
        System.out.println("Total: ₡" + original);

    }
}