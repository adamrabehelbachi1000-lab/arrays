import java.util.Arrays;
import java.util.Scanner;

public class Ahorcado {
    static final String[] DIBUJOS = {
            "  +---+\n  |   |\n      |\n      |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n      |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n  |   |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n /|   |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n /|\\  |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n /|\\  |\n /    |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n /|\\  |\n / \\  |\n      |\n========="
    };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] palabras = {"Casa", "Perro", "Montaña", "Coche", "Libro", "Ventana", "Playa", "Ordenador", "Manzana",
                "Reloj", "Árbol", "Silla", "Pelota", "Avión", "Guitarra"};
        String entrada;
        char letra = ' ';
        char[] letrasUsadas = new char[26];
        int contadorLetras = 0;
        int intentos = 6;
        int contadorletra = 0;
        char[] letrasFalladas = new char[26];
        int contadorFalladas = 0;
        boolean letra_acertado = false;

        System.out.println("Elige un numero del 0 al 14 para elegir la palabra del ahorcado:");
        int numero = sc.nextInt();
        String palabra = palabras[numero];
        char[] secreta = palabra.toLowerCase().toCharArray();
        char[] progreso = new char[secreta.length];
        for (int i = 0; i < progreso.length; i++) {
            progreso[i] = '_';
        }
        do {
            System.out.println("Palabra: " + String.valueOf(progreso));
            System.out.print("Fallos: ");
            for (int i = 0; i < contadorFalladas; i++) {
                System.out.print(letrasFalladas[i] + " ");
            }
            System.out.println();
            System.out.println("Intentos restantes: " + intentos);
            System.out.println("Letra: " + letra);
            if (letra_acertado == true) {

                System.out.println("AHORCADO:");
                System.out.println(DIBUJOS[6 - intentos]);
                do {
                    System.out.println("Introduce una letra");
                    entrada = sc.next();
                    if (entrada.length() != 1) {
                        System.out.println("Error, solo puedes introducir una letra");
                    }
                } while (entrada.length() != 1);
                letra = Character.toLowerCase(entrada.charAt(0));
                boolean repetida = false;
                for (int i = 0; i < contadorLetras; i++) {
                    if (letrasUsadas[i] == letra) {
                        System.out.println("Ya has usado esa letra.");
                        repetida = true;
                        break;
                    }
                }
                if (repetida) {
                    continue;
                }
                letrasUsadas[contadorLetras] = letra;
                contadorLetras++;
                letra_acertado = false;
                contadorletra = 0;
                for (int i = 0; i < secreta.length; i++) {
                    if (secreta[i] == letra) {
                        progreso[i] = letra;
                        letra_acertado = true;
                        contadorletra++;
                    }
                }

                if (letra_acertado == false) {
                    intentos = intentos - 1;
                    letrasFalladas[contadorFalladas] = letra;
                    contadorFalladas++;
                } else {
                    System.out.println("¡Bien! La " + "'" + letra + "' " + "aparece " + contadorletra + " vez/veces.");
                }
            }
        }while (intentos > 0 && !Arrays.equals(secreta, progreso)) ;

            if (Arrays.equals(secreta, progreso)) {
                System.out.println("¡Enhorabuena! Has adivinado la palabra: " + palabra);
            } else {
                System.out.println("Has perdido. La palabra era: " + palabra);
            }
            sc.close();

    }
}
