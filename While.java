// // // // public class Ejercicio1 {
// // // //     public static void main(String[] args) {
// // // //         int numero = 2;
// // // //         while (numero <= 20) {
// // // //             System.out.println(numero);
// // // //             numero += 2;
// // // //         }
// // // //     }
// // // // }

// // // // 
// // // // public class Ejercicio2 {
// // // //     public static void main(String[] args) {
// // // //         int contador = 10;
// // // //         while (contador >= 1) {
// // // //             System.out.println(contador);
// // // //             contador--;
// // // //         }
// // // //         System.out.println("¡Despegue!");
// // // //     }
// // // // }

// // // public class Ejercicio3 {
// // //     public static void main(String[] args) {
// // //         int n = 10;
// // //         int i = 1;
// // //         int suma = 0;
// // //         while (i <= n) {
// // //             suma += i;
// // //             i++;
// // //         }
// // //         System.out.println("La suma de 1 a " + n + " es: " + suma);
// // //     }
// // // }

// // public class Ejercicio4 {
// //     public static void main(String[] args) {
// //         int numero = 7;
// //         int i = 1;
// //         while (i <= 10) {
// //             System.out.println(numero + " x " + i + " = " + (numero * i));
// //             i++;
// //         }
// //     }
// // }

// import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int PIN_CORRECTO = 1234;
        int pin = 0;

        while (pin != PIN_CORRECTO) {
            System.out.print("Introduce tu PIN: ");
            pin = sc.nextInt();
            if (pin != PIN_CORRECTO) {
                System.out.println("PIN incorrecto. Inténtalo de nuevo.");
            }
        }
        System.out.println("¡Acceso concedido!");
        sc.close();
    }
}