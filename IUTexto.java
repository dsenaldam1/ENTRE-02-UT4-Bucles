import java.util.Scanner;
/**
 * Modela el interfaz para interactuar con el usuario
 * @author David Sena
 */
public class IUTexto
{
    private Scanner teclado;
    private CalculadoraOctal calculadora;
    private PintorFiguras pintor;

    /**
     * Constructor  
     */
    public IUTexto(CalculadoraOctal calculadora, PintorFiguras pintor)
    {
        this.teclado = new Scanner(System.in);
        this.calculadora = calculadora;
        this.pintor = pintor;
    }

    /**
     * Controla la lógica de la aplicación
     */
    public void iniciar()
    {
        hacerSumasOctales();
        dibujarFiguras();

    }

    /**
     *  - borrar la pantalla
     *  - pedir al usuario un par de números
     *  - si los números no están en octal mostrar un mensaje
     *  - si los números no tienen el mismo número de cifras mostrar un mensaje
     *  - si son correctos calcular su suma octal y mostrar el resultado en pantalla
     *  - los pasos anteriores se repiten mientras el usuario quiera (pulsa 'S' o 's')
     *  
     */
    private void hacerSumasOctales()
    {
        char volver = 's';
        while (volver == 's' || volver == 'S'){
            System.out.println("Teclea número1: ");
            int primNumero = teclado.nextInt();
            System.out.println("Teclea número2: ");
            int secNumero = teclado.nextInt();
            if (Utilidades.estaEnOctal(primNumero) || 
                Utilidades.estaEnOctal(secNumero)){
                if (Utilidades.contarCifras(primNumero) == 
                    Utilidades.contarCifras(secNumero)){
                    System.out.println("------------------------------");
                    System.out.printf("\n %30d \n ", primNumero);
                    System.out.printf("%30d \n ", secNumero);
                    System.out.printf("\n Suma Octal: \t\t " +
                     calculadora.sumarEnOctal(primNumero, secNumero));
                }
                else{
                    System.out.println("Los números no tienen las mismas cifras");
                }
            }
            else{
                System.out.println("Alguno de los  números no esta en octal");
            }
            Pantalla.borrarPantalla();
            System.out.println("Quiere hacer otra suma en octal?  (S / s)");
            teclado.nextLine();
            volver = teclado.nextLine().charAt(0);
        }
    }

    /**
     *  Pide al usuario un valor de altura, 
     *  valida que sea correcto (un valor entre 1 y 10)
     *  y muestra la figura en pantalla
     */

    private void dibujarFiguras()
    {
        System.out.println("Ahora dibujará una figura"); 
        int altura = 0;
        System.out.print(" Altura de la figura? (1-10)");
        altura = this.teclado.nextInt();

        if(altura >= 1 && altura <= 10){
            pintor.dibujarFigura(altura);
        }else{
            System.out.print("Error, Altura de la figura? (1-10)");
        }
    }

}
