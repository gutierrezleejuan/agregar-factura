import java.text.SimpleDateFormat;
import java.util.Date;

public class AppFacturas {

    public static void main(String[] args) {
        // Imprimir un mensaje en color negro
        imprimirEnColor("Este mensaje esta en color negro.", 30);
        
        // Imprimir un mensaje donde una parte está en color negro y otra en color verde
        imprimirEnColor("Esta parte esta en color negro, y esta en color verde.", 30, 32);
        
        // Imprimir un mensaje en color rojo
        imprimirEnColor("Este mensaje esta en color rojo.", 31);
        
        // Imprimir una línea de asteriscos en color rojo
        imprimirEnColor("**********", 31);
        
        // Imprimir un mensaje en color verde
        imprimirEnColor("Este mensaje esta en color verde.", 32);
        
        // Imprimir un mensaje en color naranja (amarillo)
        imprimirEnColor("Este mensaje esta en color naranja (amarillo).", 33);
        
        // Imprimir un mensaje en color azul
        imprimirEnColor("Este mensaje esta en color azul.", 34);
        
        // Imprimir un mensaje en color morado
        imprimirEnColor("Este mensaje esta en color morado.", 35);
        
        // Imprimir un mensaje en color cian
        imprimirEnColor("Este mensaje esta en color cian.", 36);
        
        // Imprimir un mensaje en color blanco
        imprimirEnColor("Este mensaje está en color blanco.", 37);
        
        // Imprimir un mensaje en diferentes colores y luego restablecer el color a su valor predeterminado
        imprimirEnColor("Este mensaje está en varios colores, y luego vuelvo al color predeterminado.", 31, 32, 33, 34, 35, 36, 37, 0);
        
        // Imprimir un carácter específico
        char caracter = 'A';
        System.out.printf("Carácter especifico: %c%n", caracter);
        
        // Imprimir un número entero en base decimal
        int numeroEntero = 123;
        System.out.printf("Número entero en base decimal: %d%n", numeroEntero);
        
        // Imprimir un número flotante en notación exponencial
        double numeroFlotante = 12345.6789;
        System.out.printf("Número flotante en notación exponencial: %e%n", numeroFlotante);
        
        // Imprimir un número flotante
        System.out.printf("Número flotante: %.2f%n", numeroFlotante);
        
        // Imprimir un número entero en base 8
        int numeroOctal = 64;
        System.out.printf("Número en base 8: %o%n", numeroOctal);
        
        // Imprimir una cadena de caracteres
        String cadena = "Hola, mundo!";
        System.out.printf("Cadena de caracteres: %s%n", cadena);
        
        // Imprimir un número entero en base 16
        int numeroHexadecimal = 255;
        System.out.printf("Número en base 16: %x%n", numeroHexadecimal);
        
        // Imprimir la fecha y hora actuales
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String fechaHoraActual = dateFormat.format(new Date());
        System.out.printf("Fecha y hora actuales: %s%n", fechaHoraActual);
    }

    // Método para imprimir un mensaje en un color específico
    private static void imprimirEnColor(String mensaje, int... colores) {
        StringBuilder formato = new StringBuilder("\u001B[");
        for (int i = 0; i < colores.length; i++) {
            formato.append(colores[i]);
            if (i < colores.length - 1) {
                formato.append(";");
            }
        }
        formato.append("m%s\u001B[0m%n");
        System.out.printf(formato.toString(), mensaje);
    }
}
