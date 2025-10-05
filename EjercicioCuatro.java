import java.util.Scanner; //se importa la librería necesaria para el scanner

public class EjercicioCuatro {    //se crea primero una clase EjercicioCuatro (en mayúsculas)
    public static void main (String[] args){ //luego creamos el método main
        Scanner sc = new Scanner(System.in);    //se crea el objeto scanner, esa parte no la entiendo para nada
        System.out.println("Hola");  
        System.out.println("Elige el primer numero entero");       //primer prompt
        int foo = sc.nextInt();            //se declara y se inicializa la primera var
        sc.nextLine();  // no sé si esto es necesario pero lo tengo ahí
        System.out.println("Elige el segundo número");
        int bar = sc.nextInt();         //segundo prompt
        int uli = foo + bar;
        System.out.println("La suma de los dos números es:" + uli);  

        sc.close();
    }}