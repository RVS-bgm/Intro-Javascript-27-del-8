public class condiciones {
    public static void main(String[] args) {
        // determinar si el numero es par o impar
        int num = 8;

        if(num % 2 == 0){
            System.out.println("el numero es par");
        }else{
            System.out.println("el numero es impar");
        }

        //operador ternario
        String resultado = num % 2 == 0 ? "el numero es par" : "el numero es impar";
        System.out.println(resultado);
    }
}


