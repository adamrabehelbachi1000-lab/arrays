import java.util.Scanner;

public class Ej_9 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce 10 numeros: ");
        int [] numeros = new int[10];
        int pares = 0;
        int impares = 0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = inputValue.nextInt();
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Hay " + pares + " pares");
        System.out.println("Hay " + impares + " impares");
    }
}
