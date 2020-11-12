
/**
 *  Clase que dibuja una figura 
 * 
 * @author - 
 *  
 */
public class PintorFiguras
{
    private static final int ANCHO_BLOQUE = 4;
    private static final char ESPACIO = ' ';
    private static final char CAR1 = 'B';
    private static final char CAR2 = '=';


    /**
     * Dibuja una figura (ver enunciado) de altura
     * indicada (se asume la altura un valor correcto)
     * 
     * (usa bucles for)
     */
    public  void dibujarFigura(int altura) {
        int CAR1 = 1;
        for(int fila = 1; fila <= 10; fila ++){
        int escribirEspacios= (fila - 1);
        for(int col = 10; col>=CAR1; col --){
            System.out.print(CAR1 * ANCHO_BLOQUE);
        }
    }
}

    /**
     * Método privado de ayuda que escribe n espacios en la misma línea
     */
    private  void escribirEspacios(char caracter, int n) {
         for (int contador = 1; contador <=n; contador++){
             System.out.print(ESPACIO);
         }
    }
}
