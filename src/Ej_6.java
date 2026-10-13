import java.util.Scanner;

public class Ej_6 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce 10 numeros: ");
        int [] numeros = new int[10];

        for (int i = 0; i<numeros.length; i++) {
            numeros[i] = inputValue.nextInt();
        }
        int minimo = numeros [0];
        for (int i = 0; i<numeros.length; i++){
            if (numeros[i] <= minimo){
                minimo = numeros [i];
            }
        }
        System.out.println("El numero mas pequeño es: " + minimo);

    }
}
