import java.util.Scanner;

public class Ej_7 {
    public static void main(String[] args) {
        String[] cadenas = new String[5];
        System.out.println("Introduce 5 cadenas de texto:");
        Scanner miScanner;
        miScanner = new Scanner(System.in);

        for (int i = 0; i < cadenas.length; i++){
            cadenas[i] = miScanner.next();
        }
        System.out.println("*********");
        for (int i = 0; i < cadenas.length; i++){
            System.out.println("* " + cadenas[i] + " *");
        }
        System.out.println("*********");
    }
}
