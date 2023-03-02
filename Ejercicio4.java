import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la edad de Juan: ");
        int edadJuan = Integer.parseInt(teclado.nextLine());
        int edadAlberto = 2*(edadJuan/3);
        int edadAna = 4*(edadJuan/3);
        int edadMadre= edadJuan + edadAlberto + edadAna;
        System.out.println("la edad de juan es: " + edadJuan);
        System.out.println("la edad de Alberto es: " + edadAlberto);
        System.out.println("la edad de Ana es: " + edadAna);
        System.out.println("la edad de la madre es: " + edadMadre);
    }
}
