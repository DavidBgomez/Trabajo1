public class Ejercicio3 {
    public static void main(String[] args){
        double pagoXHoras=5.000;
        int horasTrabajadas=48;
        double salarioBruto=horasTrabajadas*pagoXHoras;
        double retencion=salarioBruto*0.125;
        double salarioNeto=salarioBruto-retencion;

        System.out.println("El salario bruto es: " + salarioBruto);
        System.out.println("La retencion es: " + retencion);
        System.out.println("El salario Neto es: " + salarioNeto);
    }
    
}
