import java.util.Scanner;
public class MainScanner {

    public static void main (String[] args) {

    Scanner sal = new Scanner(System.in);
    System.out.println( "Ingrese el salario sin ajuste: ");
    float salarioSinAjuste = sal.nextFloat();
    System.out.println("Ingrese el porcentaje del aumento (si es el 15% ingresar 0.15");
    float porcentajeAumento = sal.nextFloat();
    EjercicioIF pruebaScanner = new EjercicioIF(salarioSinAjuste, porcentajeAumento, 0);
    float salarAjustado = pruebaScanner.calcularSalario();
    System.out.println("El salario ajustado es igual a : " + salarAjustado);
    sal.close();



    }
    
}
