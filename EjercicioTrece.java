import java.util.Scanner;

public class EjercicioTrece{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        final double irpf = 0.15;
        System.out.println("Cuál es tu sueldo bruto?");
        double sueldo = sc.nextDouble();
        double neto = sueldo - (sueldo * irpf);
        System.out.println("El sueldo neto es: " + neto); 

    }
}