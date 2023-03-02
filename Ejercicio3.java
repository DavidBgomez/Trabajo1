import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el numero de horas trabajadas: ");
        int horasTrabajadas = Integer.parseInt(teclado.nextLine());

        System.out.print("Ingrese el valor de cadsa hora de trabajo: ");
        double pagoXHoras = Double.parseDouble(teclado.nextLine());

        double salarioBruto=horasTrabajadas*pagoXHoras;
        double retencion=salarioBruto*0.125;
        double salarioNeto=salarioBruto-retencion;

        System.out.println("El salario bruto es: " + salarioBruto);
        System.out.println("La retencion es: " + retencion);
        System.out.println("El salario Neto es: " + salarioNeto);
    }
}