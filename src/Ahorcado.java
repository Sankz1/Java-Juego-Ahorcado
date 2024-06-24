import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        //Clase Scanner , Nos permite que el usuario escriba
        Scanner scan = new Scanner(System.in);

        //Declaraciones y asignaciones
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        //Arreglos:
        char [] letrasAdivinadas = new char[palabraSecreta.length()];

        //Bucle : Estructura de control iterativa
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
           
        }

        //Bucle : Estructura de control iterativa
        while (!palabraAdivinada && intentos < intentosMaximos) {
            
            System.out.println("Palabra a Adivinar: " + String.valueOf(letrasAdivinadas) + " (" +palabraSecreta.length() + " letras)" );

            System.out.println("Introduce una letra, Por favor");
            // Usamos la clase scanner para pedir una letra
            char letra = Character.toLowerCase(scan.next().charAt(0));

            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                // Estructura de control condicional
                if (palabraSecreta.charAt(i)== letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }
            if (!letraCorrecta) {
                intentos++;
                System.out.println("Letra incorrecta, Te quedan: " + (intentosMaximos - intentos) + " intentos.");
            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)){

                palabraAdivinada = true;
                System.out.println("Felicidades has adivinado la palabra secreta: " + palabraSecreta);
            }


        }
        if (!palabraAdivinada) {
            System.out.println("Game Over");
        }
        scan.close();
    }
}
