import java.util.Scanner;

public class comunes {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce 10 notas: ");
        int[] numeros1 = new int[10];
        for (int i = 0; i < numeros1.length; i++) {
            numeros1[i] = inputValue.nextInt();
        }
        System.out.println("Introduce otra vez 10 notas: ");
        int[] numeros2 = new int[10];
        for (int j = 0; j < numeros1.length; j++) {
            numeros2[j] = inputValue.nextInt();
        }

        for (int i = 0; i < numeros1.length; i++){
            for (int j = 0; j < numeros2.length; j++){
                if (numeros1[i] == numeros2[j]){
                    System.out.println("Es numero comun el" + numeros1[i]);
                }
            }
        }
    }
}
