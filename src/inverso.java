import java.util.Scanner;

public class inverso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = {10, 20, 30, 40, 50};
        int[] numeros1 = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++){
            numeros1 [i] = numeros [numeros.length - 1 - i];
        }
        System.out.println("Array inverso: ");
        for (int i = 0; i < numeros1.length; i++) {
            System.out.println(numeros1[i]);
        }
    }
}
