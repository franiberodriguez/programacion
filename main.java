
// // import java.util.Scanner;

// // // public class Ejercicio {
// // // public static void main(String[] args){
// // //     System.out.println("Hola mundo, me llamo Guille");
// // // }
// // // }

// // public class Ejercicio2 {
// //     public static void main(String[] args){
// //          int a = 7;
// //          int b = 13;
// //        // System.out.println("la suma de a y b es: " + (a + b));
// //        // System.out.println("La resta de a y b es: " + (a - b));
// //        // System.out.println("La multiplicación de a y b es:" + (a * b));
// //        // System.out.println("La división de a y b es: " + (a / b));  
// //     }
// // }

// // Pide al usuario que introduzca su nombre y su edad, luego lo imprima en patalla
// // Y que muestre un personaje personalizado 

// import java.util.Scanner;

// class Ejercicio3 {
//     public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

//        System.out.println("introduce tu nombre: ");
//        String nombre = scanner.nextLine();

//        System.out.println("introduce tu apellido: ");
//        String apellido = scanner.nextLine();

//        System.out.println("Introduce tu edad");
//        int edad = scanner.nextInt();

//        System.out.println("Hola " + nombre + "apellido" + apellido + ", tienes " + edad + "años,");

//        scanner.close();
//     }
// }

// Pide al usuario un numero entero y muestre su tabla de multiplicar del 1 al 10

// import java.util.Scanner;

// class Ejercicio4 {
//     public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

//        System.out.println("Introduce un numero que veas la tabla de multiplica: r");
//        int tabla = scanner.nextInt();

//        for (int i = 1; i <=10; i++){
//            System.out.println(tabla + "x" + i + "=" + (tabla * i));
//        }
//        scanner.close();

//     }

// }


// Pide al usuario que inroduzca una nota numerica del 0 al 10 (puede llevar decimales)
// // y muestre su calificacion segun la escala estandar

// import java.util.Scanner;

// class Ejercicio5 {
//     public static void main(String[] args) {

//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Introduce una nota del 0 al 10:");
//         double nota = scanner.nextDouble();

//         if (nota < 0 || nota > 10) {
//             System.out.println("La nota no es válida.");
//         } else if (nota < 5) {
//             System.out.println("Suspenso");
//         } else if (nota < 7) {
//             System.out.println("Aprobado");
//         } else if (nota < 9) {
//             System.out.println("Notable");
//         } else {
//             System.out.println("Sobresaliente");
//         }

//         scanner.close();
//     }
// }

//Crea un programa que pida al usuario un numero secreto
// El programa  desde seguir pidiendo el numero

// import java.util.Scanner;

// public class Ejercicio6 {
//       public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int numeroSecreto = 69;
//         int intento;

//         System.out.println("Adivina el numero secreto");

//         do{
//            System.out.println("Introduce un numero");
//            intento = scanner.nextInt();
           
//            if (intento < numeroSecreto) {
//             System.out.println("El numero secreto es mayor. Intenta de nuevo");
//         }else if (intento > numeroSecreto) {
//             System.out.println("El numero secreto es menor. Intenta de nuevo");
//         } else {
//             System.out.println("¡Felicidades! Has adivinado el número secreto");
//       }
//         } while (intento != numeroSecreto);

//          scanner.close();
//       }
// }

import java.util.Scanner;

public class Ejercicio7 {
    public static boolean esMayorDeEdad(int edad) {
       return edad >= 18;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        int edad = scanner.nextInt();

        if (esMayorDeEdad(edad)) {
            System.out.println("Eres mayorcito ya!!!!");
        } else {
            System.out.println("Eres un bebé, fuera de aqui... ");
        }
        scanner.close();
    }
    
}
