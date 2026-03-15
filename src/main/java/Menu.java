
import java.util.Scanner;

public class Menu {

    Scanner sc = new Scanner(System.in);
    Cajero cajero = new Cajero();

    public void iniciar(){

        int opcion;

        do{

            System.out.println("\n===== CAJERO AUTOMATICO =====");
            System.out.println("0. Mantenimiento");
            System.out.println("1. Retirar dinero");
            System.out.println("2. Salir");

            opcion = leerEnteroSeguro();

            switch(opcion){

                case 0:
                    mantenimiento();
                    break;

                case 1:
                    retirar();
                    break;

                case 2:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");

            }

        }while(opcion!=2);

    }

    private void mantenimiento(){

        int opcion;

        do{

            System.out.println("\n--- Mantenimiento ---");
            System.out.println("1. Agregar billetes");
            System.out.println("2. Ver inventario");
            System.out.println("3. Salir");

            opcion = leerEnteroSeguro();

            switch(opcion){

                case 1:
                    agregarBilletes();
                    break;

                case 2:
                    cajero.verBilletes();
                    break;

                case 3:
                    break;

                default:
                    System.out.println(" Opción inválida");

            }

        }while(opcion!=3);

    }

    private void agregarBilletes(){

        int[] nuevos = new int[5];

        int[] valores = {20000,10000,5000,2000,1000};

        System.out.println("\nIngrese cantidad de billetes:");

        for(int i=0;i<valores.length;i++){

            System.out.print("₡"+valores[i]+": ");

            int cantidad = leerEnteroSeguro();

            if(cantidad < 0){

                System.out.println("No se permiten negativos");
                return;

            }

            nuevos[i] = cantidad;

        }

        cajero.agregarBilletes(nuevos);

        System.out.println(" Billetes agregados correctamente");

    }

    private void retirar(){

        System.out.println("\nIngrese monto a retirar:");

        int monto = leerEnteroSeguro();

        if(monto <= 0){

            System.out.println("El monto debe ser mayor a 0");
            return;

        }

        if(monto % 1000 != 0){

            System.out.println(" El monto debe ser múltiplo de 1000");
            return;

        }

        cajero.retirar(monto);

    }

    private int leerEnteroSeguro(){

        while(true){

            if(sc.hasNextInt()){
                return sc.nextInt();
            }

            System.out.println("Debe ingresar un número válido");
            sc.next();

        }

    }

}