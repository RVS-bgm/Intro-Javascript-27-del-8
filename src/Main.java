//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        int c = 1;
        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int division = a/b;
        int modulo = a%b;
        //int incremento = a++;
        //int decremento = b--;
        System.out.println("suma: " + suma);
        System.out.println("resta: " + resta);
        System.out.println("multiplicacion: " +multiplicacion);
        System.out.println("division: " + division);
        System.out.println("modulo: " + modulo);
        //System.out.println("incremento: " + a++);
        //System.out.println("decremento: " + b--);

        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a==b);
        System.out.println((a!=b));

        System.out.println(a<b && c<b);
        System.out.println(a>b && c<b);
        System.out.println(a>b || c<b);




    }
}