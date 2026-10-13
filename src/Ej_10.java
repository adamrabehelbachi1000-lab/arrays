import java.util.Scanner;

public class Ej_10 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        int [] numeros = new int[10];
        int posicion = -1;
        System.out.println("Introduce los numeros: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = inputValue.nextInt();
        }
        System.out.println("Introduce el numero que quieres buscar: ");
        int numero = inputValue.nextInt();
        for (int i = 0; i < numeros.length; i++) {
            if (numero == numeros[i]){
                posicion = i;
            }
        }
        System.out.println("El numero esta en la posicion: " + posicion);
    }
}
