import java.util.Scanner;

public class eliminar {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce 10 notas: ");
        int[] numeros1 = new int[10];
        for (int i = 0; i < numeros1.length; i++) {
            numeros1[i] = inputValue.nextInt();
        }

    }
}
