import java.util.Scanner;
/**
 *   Clase de utilidades
 *   Incluye métodos estáticos
 *   
 *   @author David Sena
 */
public class Utilidades
{

    /**
     * Dado un número n (asumimos positivo)
     * devueve true si está en octal false en otro caso
     * Un nº está en octal si cada una de sus cifras
     * es un valor entre 0 y 7
     * 
     * (usa bucles while)
     */
    public static boolean estaEnOctal(int n) {
        int numero = n;
        int cifra;
        boolean octal = true;
        while (numero != 0){
           cifra = numero % 10;
           numero = numero / 10;
           int cifras = contarCifras(numero);
            if  (cifra > 7){
                 return false;
            }
        }
        return octal;
    }

    /**
     * Dado un número n (asumimos positivo)
     * devuelve la cantidad de cifras que tiene
     * 
     * (usa bucles while)
     */
    public static int contarCifras(int n) {
        int numero = n;
        int cifras = 0;
        while (numero != 0){
            numero = numero / 10;
            cifras ++;
        }
        return cifras;

    }

}
