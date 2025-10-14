import java.util.Scanner; // se importa el paquiete util para el scanner

public class ExercicioUno {  // se declara la clase 
    public static void main (String[] args){ //se declara el método main
        Scanner sc = new Scanner(System.in); //creado el scanner
        
        System.out.println("Elige un numero entero"); // prompt 1 
        int foo = sc.nextInt();  
        int bar = (foo * 2); // primera operaciópn entre ints
        System.out.println("Tu numero por dos es: " + bar);   
        
        System.out.println("Ahora escribe un numero real: "); //prompt 2
        double real = sc.nextDouble(); // ahora operamosw con doubles
        double div = (real / 10); // división
        System.out.println("Tu numero real dividido por diez es: " + div);
        

    }
}