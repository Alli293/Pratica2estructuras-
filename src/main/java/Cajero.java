
public class Cajero {

    private int[] denominaciones = {20000,10000,5000,2000,1000};
    private int[] inventario = {0,0,0,0,0};

    public void agregarBilletes(int[] nuevos){

        for(int i=0;i<inventario.length;i++){
            inventario[i]+=nuevos[i];
        }

    }

    public void verBilletes(){

        System.out.println("\n--- Inventario del Cajero ---");

        for(int i=0;i<denominaciones.length;i++){

            System.out.println("Cantidad de ₡"+denominaciones[i]+": "+inventario[i]);

        }

    }

    public void retirar(int monto){

        int[] usar = new int[denominaciones.length];
        int restante = monto;

        for(int i=0;i<denominaciones.length;i++){

            int billetesNecesarios = restante / denominaciones[i];

            usar[i] = Math.min(billetesNecesarios, inventario[i]);

            restante -= usar[i]*denominaciones[i];

        }

        if(restante != 0){

            System.out.println(" Imposible dispensar la cantidad solicitada ");
            return;

        }

        for(int i=0;i<inventario.length;i++){
            inventario[i]-=usar[i];
        }

        System.out.println("\n--- Billetes entregados ---");

        for(int i=0;i<denominaciones.length;i++){

            if(usar[i]>0){
                System.out.println("Cantidad de ₡"+denominaciones[i]+": "+usar[i]);
            }

        }

        System.out.println("----------------------------");
        System.out.println("Total: ₡"+monto);

    }

}