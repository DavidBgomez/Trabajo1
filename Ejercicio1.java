import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el numero del cual desea obtener el cuadrado y el cubo: ");
        int numero = Integer.parseInt(teclado.nextLine());
        int cuadrado= numero*numero;
        int cubo= numero*numero*numero;

        System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
        System.out.println("El cubo de " + numero + " es: " + cubo );
    }
}
