import java.util.Scanner;

public class Ej_8 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce 10 numeros: ");
        int [] numeros = new int[10];
        int suma_positivos = 0;
        int suma_negativos = 0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = inputValue.nextInt();
            if (numeros[i] < 0) {
                suma_negativos += numeros[i];
            }
            if (numeros[i] >= 0) {
                suma_positivos += numeros[i];
            }
        }
        System.out.println("La suma de positivos es : " + suma_positivos);
        System.out.println("La suma de negativos es : " + suma_negativos);

    }
}
