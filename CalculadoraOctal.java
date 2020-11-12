
/**
 *  Representa a una calcualdora que hace sumas octales
 * 
 * @author David Sena
 * 
 */
public class CalculadoraOctal
{

    /**
     * sumar dos nºs supuestos en base 8 y con el mismo
     * nº de cifras
     * Asumimos positivos
     */
    public int sumarEnOctal(int n1, int n2) {
        int numero1 = n1;
        int numero2 = n2;
        int suma = 0;
        int resultadoSuma = 0;
        int cifraContada = 0;       
        int llevada = 0;
        while (numero1 != 0 && numero2 != 0){            
            int cifra1 = numero1 % 10;
            int cifra2 = numero2 % 10;
            llevada = 0;
            suma = cifra1 + cifra2;
            if (suma > 7){
                suma = suma - 8;
                resultadoSuma = resultadoSuma + ((int) Math.pow(10, cifraContada) * suma);
                llevada = 1;
                if (llevada == 1){
                    resultadoSuma = resultadoSuma + ((int) Math.pow(10, cifraContada) * 1);
                }
            }
            else {
                resultadoSuma = resultadoSuma + ((int) Math.pow(10, cifraContada) * suma);
            }
            cifraContada ++;
            numero1 = numero1 / 10;
            numero2 = numero2 / 10;
        }

        return resultadoSuma;
    }
}

