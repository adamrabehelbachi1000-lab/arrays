import java.util.Scanner;

public class sumaigual {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = inputValue.nextInt();
        System.out.println("Introduce 10 notas: ");
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = inputValue.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] + numeros[i+1] == numero) {
                System.out.println("La suma del elemento " + i + " y " + i + 1 + "da el numero " + numero);
            }
        }
    }
}
