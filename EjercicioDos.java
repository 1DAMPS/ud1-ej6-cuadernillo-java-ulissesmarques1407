import java.util.Scanner;

public class EjercicioDos{

    public void formula(double capitalInicial, double interes, double años){ //se evita tilde en nombres de variables según google
        double capitalFinal = capitalInicial *  Math.pow(1 + interes / 100, años);
        System.out.println("El capital final es " + capitalFinal);
    }

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
    System.out.println("***EJERCICIO DIEZ***");
    System.out.println("Capital inicial?");
        double capitalInicial = sc.nextDouble();
    System.out.println("Cuál es el interés?");
        double interes = sc.nextDouble(); //int es palabra reservada
    System.out.println("Por cuántos años?");
        double años = sc.nextDouble();
    
        sc.close();
    
    new EjercicioDiez().formula (capitalInicial, interes, años);
    }
    
}
