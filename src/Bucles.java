public class Bucles {
    public static void main(String[] args) {
        //Bycle FOR
        //Mostrar los numeros del 1 al 10

        System.out.println("FOR: numeros del 1 al 10");
        for(int i = 1; i<=10 ; i++){
            System.out.println(i);
        }

        //bucle WHILE
        System.out.println("-------------------------");
        System.out.println("While: suma acumulada");
        int i = 0;
        int suma = 0;
        while (i<=5){
            suma = suma + i;
            i++;
        }
        System.out.println("la suma acumulada es: " + suma);

    }

}
