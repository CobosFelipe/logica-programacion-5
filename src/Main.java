import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Comenzando un hashmap para las palabras
        HashMap<String, String> diccionario = new HashMap<String, String>();

        //Añadiendo claves y valores en el HashMap
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("casa", "house");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("libro", "book");
        diccionario.put("jardín", "garden");
        diccionario.put("agua", "water");
        diccionario.put("árbol", "tree");
        diccionario.put("montaña", "mountain");
        diccionario.put("amarillo", "yellow");
        diccionario.put("rojo", "red");
        diccionario.put("verde", "green");
        diccionario.put("azul", "blue");
        diccionario.put("manzana", "apple");
        diccionario.put("banana", "banana");
        diccionario.put("coche", "car");
        diccionario.put("playa", "beach");
        diccionario.put("tiempo", "weather");


        String[] palabrasAleatorias = obtenerPalabras(diccionario);

        Scanner scanner = new Scanner(System.in);
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;

        System.out.println("Traduce las siguientes palabras al inglés:");

        for(String palabra : palabrasAleatorias){
            System.out.println(palabra + ": ");
            String respuesta = scanner.nextLine().toLowerCase();

            if (diccionario.get(palabra).equalsIgnoreCase(respuesta)){
                System.out.println("¡Felicitaciones, acertaste!");
                respuestasCorrectas++;
            } else {
                System.out.println("Error, la palabra correcta es: " + diccionario.get(palabra));
                respuestasIncorrectas++;
            }
        }

        System.out.println("\nResultado:");
        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);

        scanner.close();
    }

    private static String[] obtenerPalabras(Map<String, String> diccionario) {
        String[] palabras = diccionario.keySet().toArray(new String[0]);
        Random random = new Random();
        String[] palabrasAleatorias = new String[5];

        for (int i = 0; i < 5; i++) {
            int indiceAleatorio = random.nextInt(palabras.length);
            palabrasAleatorias[i] = palabras[indiceAleatorio];
        }

        return palabrasAleatorias;
    }
}