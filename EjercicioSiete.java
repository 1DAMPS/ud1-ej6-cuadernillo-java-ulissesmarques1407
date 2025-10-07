import java.util.Scanner; // este me costó mucho, miré tutoriales
 // se importa la librería util para el scanner 
public class EjercicioSiete{ /* no entiendo porque el método edadHumano no lleva static */
    
        public void edadHumano(double edadGato){ /*  en esta parte me perdía porque no sabía si declarar 
             las variables antes o después del método*/
            double humano = 4 * edadGato + 16; 
            System.out.println("La edad humana de tu gato sería " + humano);

        }
    public static void main (String[] args){ //declaro método main
        Scanner sc = new Scanner(System.in); //inicializo scanner
        System.out.println("Cuál es la edad de tu gato?"); //prompt
        double edadGato = sc.nextDouble(); //input
        sc.close(); //cierro scanner

        new EjercicioSiete() .edadHumano(edadGato); //esto lo saqué de internet, no lo entiendo al 100%.
         }
}
/*me daba error: non-static variable humano cannot be referenced from a static context
        new EjercicioSiete() .EdadHumano(edadGato, humano); */
    
        /* import java.util.Scanner;
  
public class EjercicioSiete{ 
    double edadGato;
    double humano = (edadGato *4) +16;
    
        public void EdadHumano(double edadGato){
            System.out.println("La edad humana de tu gato sería " + humano);

        };
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuál es la edad de tu gato?");
        double edadGato = sc.nextDouble();
        sc.close();

        new EjercicioSiete() .EdadHumano(edadGato);
         }
}*/