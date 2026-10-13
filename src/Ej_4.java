import java.util.Scanner;

public class Ej_4 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce 10 notas: ");
        int [] numeros = new int[10];
        double media = 0;
        double suma = 0;


        for (int i = 0; i<numeros.length; i++){
            numeros[i] = inputValue.nextInt();
            suma +=  + numeros[i];
        }
        media = suma/10;
        System.out.println("La media de las notas es: " + media);

    }
}
