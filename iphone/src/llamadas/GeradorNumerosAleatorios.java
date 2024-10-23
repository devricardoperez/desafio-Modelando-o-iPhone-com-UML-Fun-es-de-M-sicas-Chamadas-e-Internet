package llamadas;

import java.util.Random;

public class GeradorNumerosAleatorios {
    public static void main(String[] args) {
        // Número de dígitos deseados
        int numDigits = 11;

        // Generar el número aleatorio
        long randomNumber = generateRandomNumber(numDigits);

        // Imprimir el número
        System.out.println("Número aleatorio de " + numDigits + " dígitos: " + randomNumber);
    }

    // Método para generar un número aleatorio con una cantidad exacta de dígitos
    public static long generateRandomNumber(int numDigits) {
        Random random = new Random();

        // El valor mínimo que puede tener el número (en este caso 10^(numDigits-1))
        long minValue = (long) Math.pow(10, numDigits - 1);

        // El valor máximo que puede tener el número (en este caso 10^numDigits - 1)
        long maxValue = (long) Math.pow(10, numDigits) - 1;

        // Generar un número aleatorio dentro de ese rango
        return minValue + ((long) (random.nextDouble() * (maxValue - minValue)));
    }
}
