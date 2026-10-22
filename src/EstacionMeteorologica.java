import java.util.Scanner;

public class EstacionMeteorologica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes",  "Sábado", "Domingo"};
        int [] temperaturas = new int [7];
        double media;
        double suma_temperaturas = 0;
        int max = 0;
        int min = 0;

        System.out.println("Introduce las temperaturas: ");

        for (int i = 0; i < temperaturas.length; i++){
            do {
                temperaturas [i] = sc.nextInt();
                if (temperaturas[i] > 50 || temperaturas[i] < -30) {
                    System.out.println("Error, introduce otra temperatura:");
                }
            }while (temperaturas [i] > 50 || temperaturas [i] < -30);


        }
        for (int i = 0; i < temperaturas.length; i++){
            System.out.println("Temperatura del " +  dias[i] + " : " + temperaturas[i]);
        }
        for (int i = 0; i < temperaturas.length; i++){
            suma_temperaturas += temperaturas[i];
        }
        System.out.println(" ");
        media = suma_temperaturas / temperaturas.length;
        System.out.printf("Media semanal: %.2f ºC%n", media);

        max = temperaturas [0];
        String dia_max = dias[0];
        for (int i = 0; i < temperaturas.length; i++){
            if (temperaturas[i] > max){
                max = temperaturas[i];
                dia_max = dias[i];
            }
        }
        min = temperaturas [0];
        String dia_min = dias[0];
        for (int i = 0; i < temperaturas.length; i++){
            if (temperaturas[i] < min){
                min = temperaturas[i];
                dia_min = dias[i];
            }
        }
        System.out.print("Máxima: " + max + " ºC " + "(" + dia_max + ")");
        System.out.print(" | ");
        System.out.println("Mínima: " + min + " ºC " + "(" + dia_min + ")");

        System.out.print("Días por encima de la media: ");
        boolean primero = true;
        for (int i = 0; i < temperaturas.length; i++){
            if (temperaturas[i] >= media) {
                if (!primero) {
                    System.out.print(", ");
                }
                System.out.print(dias[i]);
                primero = false;
            }
        }
        int mayor_subida = temperaturas [1] - temperaturas[1];
        String primera_subida = dias[0];
        String segunda_subida = dias[0];
        for (int i = 0; i < temperaturas.length - 1; i++){
            if (temperaturas[i + 1] -  temperaturas[i] > mayor_subida){
                mayor_subida = temperaturas[i + 1] -  temperaturas[i];
                primera_subida = dias[i];
                segunda_subida = dias[i + 1];
            }
        }
        System.out.println("\nMayor subida: " + "de " +  primera_subida + " a " + segunda_subida + " (" + "+" + mayor_subida + " ºC" + ")");
        System.out.println("Grafico de temperaturas: ");
        for (int i = 0; i < temperaturas.length; i++){
            System.out.printf("%-12s", dias[i]);

            String color;

            if (temperaturas[i] < 0) {
                color = "\u001B[96m"; // Cian brillante
            } else if (temperaturas[i] < 10) {
                color = "\u001B[36m"; // Cian
            } else if (temperaturas[i] < 20) {
                color = "\u001B[32m"; // Verde
            } else if (temperaturas[i] < 30) {
                color = "\u001B[33m"; // Amarillo
            } else {
                color = "\u001B[31m"; // Rojo
            }

            if (temperaturas[i] < 0) {
                System.out.print("\u001B[38;5;117m");
                for (int j = 0; j < Math.abs(temperaturas[i]); j++) {
                    System.out.print("█");
                }
            } else {
                for (int j = 0; j < temperaturas[i]; j++) {
                    System.out.print(color + "█");
                }
            }

            System.out.println("\u001B[0m " + temperaturas[i] + ",0");
        }

        System.out.println("\nLeyenda: "
                + "\u001B[96m█ bajo 0 "
                + "\u001B[36m█ 0-9  "
                + "\u001B[32m█ 10-19  "
                + "\u001B[33m█ 20-29  "
                + "\u001B[31m█ 30 o más"
                + "\u001B[0m");
    }
}
