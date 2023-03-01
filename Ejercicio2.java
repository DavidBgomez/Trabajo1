import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el radio del circulo: ");
        double radio = Integer.parseInt(teclado.nextLine());
        double area = Math.PI*(radio*radio);
        double longitud = 2*(Math.PI*radio);
        System.out.println("el area de la cirucunferencia de radio " + radio + " es: " + area);
        System.out.println("La longitud de la circunferencia de radio " + radio + " es: " + longitud);
    }
    
}
