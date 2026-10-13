import java.util.Scanner;

public class Ej_5 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce 10 numeros: ");
        int [] numeros = new int[10];
        int maximo = 0;
        for (int i = 0; i<numeros.length; i++){
            numeros[i] = inputValue.nextInt();
            if (numeros[i] > maximo){
                maximo = numeros [i];
            }
        }
        System.out.println("El numero mas grande es: " + maximo);
    }
}
