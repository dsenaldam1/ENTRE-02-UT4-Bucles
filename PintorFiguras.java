
/**
 *  Clase que dibuja una figura 
 * 
 * @author David Sena 
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
        for(int fila = 1; fila <= altura; fila ++){
            escribirEspacios(ESPACIO, altura - (2*fila-2) + ANCHO_BLOQUE/2);
            for(int col = 1; col<= fila; col ++){           
                if(col % 2 !=0){
                    for(int contador = 1 ;contador <= ANCHO_BLOQUE; contador++){
                       System.out.print(CAR1);  
                    }
                }
                else {
                    for(int contador = 1 ;contador <= ANCHO_BLOQUE; contador++){
                       System.out.print(CAR2);  
                    }
                }
            }
            System.out.println();
        }
    }
    
        /**
         * Método privado de ayuda que escribe n espacios en la misma línea
         */
        private  void escribirEspacios(char caracter, int n) {
        for (int fila = 1; fila <=n; fila++){
            System.out.print(caracter);
        }
    }
}
