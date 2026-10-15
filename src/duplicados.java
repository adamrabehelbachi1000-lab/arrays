import java.util.Scanner;

public class duplicados {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce 10 notas: ");
        int[] numeros = new int[10];
        boolean numero_duplicado = false;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = inputValue.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    numero_duplicado = true;
                    System.out.println("Numero duplicado");
                }
            }
        }
        if(numero_duplicado == false){
            System.out.println("No hay ningun numero duplicado");
        }
    }
}
