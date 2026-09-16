
// import java.util.Scanner;

// // public class Ejercicio {
// // public static void main(String[] args){
// //     System.out.println("Hola mundo, me llamo Guille");
// // }
// // }

// public class Ejercicio2 {
//     public static void main(String[] args){
//          int a = 7;
//          int b = 13;
//        // System.out.println("la suma de a y b es: " + (a + b));
//        // System.out.println("La resta de a y b es: " + (a - b));
//        // System.out.println("La multiplicación de a y b es:" + (a * b));
//        // System.out.println("La división de a y b es: " + (a / b));  
//     }
// }

// Pide al usuario que introduzca su nombre y su edad, luego lo imprima en patalla
// Y que muestre un personaje personalizado 

import java.util.Scanner;

class Ejercicio3 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("introduce tu nombre: ");
       String nombre = scanner.nextLine();

       System.out.println("Introduce tu edad");
       int edad = scanner.nextInt();

       System.out.println("Hola " + nombre + ", tienes " + edad + "años,");

       scanner.close();
    }
}