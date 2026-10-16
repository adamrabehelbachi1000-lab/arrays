import java.util.Scanner;

public class eliminar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = {10, 20, 30, 40, 50};
        int indice;
        do {
            System.out.print("Introduce el indice que quieres mover: ");
            indice = sc.nextInt();

        } while (indice < 0 || indice >= numeros.length);

        int numero = numeros[indice];
        for (int i = indice; i < numeros.length - 1; i++) {
            numeros[i] = numeros[i + 1];
        }
        numeros[numeros.length - 1] = numero;
        System.out.println("Array final: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
