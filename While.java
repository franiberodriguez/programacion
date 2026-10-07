// // // // // // public class Ejercicio1 {
// // // // // //     public static void main(String[] args) {
// // // // // //         int numero = 2;
// // // // // //         while (numero <= 20) {
// // // // // //             System.out.println(numero);
// // // // // //             numero += 2;
// // // // // //         }
// // // // // //     }
// // // // // // }

// // // // // // 
// // // // // // public class Ejercicio2 {
// // // // // //     public static void main(String[] args) {
// // // // // //         int contador = 10;
// // // // // //         while (contador >= 1) {
// // // // // //             System.out.println(contador);
// // // // // //             contador--;
// // // // // //         }
// // // // // //         System.out.println("¡Despegue!");
// // // // // //     }
// // // // // // }

// // // // // public class Ejercicio3 {
// // // // //     public static void main(String[] args) {
// // // // //         int n = 10;
// // // // //         int i = 1;
// // // // //         int suma = 0;
// // // // //         while (i <= n) {
// // // // //             suma += i;
// // // // //             i++;
// // // // //         }
// // // // //         System.out.println("La suma de 1 a " + n + " es: " + suma);
// // // // //     }
// // // // // }

// // // // public class Ejercicio4 {
// // // //     public static void main(String[] args) {
// // // //         int numero = 7;
// // // //         int i = 1;
// // // //         while (i <= 10) {
// // // //             System.out.println(numero + " x " + i + " = " + (numero * i));
// // // //             i++;
// // // //         }
// // // //     }
// // // // }

// // // import java.util.Scanner;

// // // public class Ejercicio5 {
// // //     public static void main(String[] args) {
// // //         Scanner sc = new Scanner(System.in);
// // //         final int PIN_CORRECTO = 1234;
// // //         int pin = 0;

// // //         while (pin != PIN_CORRECTO) {
// // //             System.out.print("Introduce tu PIN: ");
// // //             pin = sc.nextInt();
// // //             if (pin != PIN_CORRECTO) {
// // //                 System.out.println("PIN incorrecto. Inténtalo de nuevo.");
// // //             }
// // //         }
// // //         System.out.println("¡Acceso concedido!");
// // //         sc.close();
// // //     }
// // // }

// // // public class Termostato {

// // //     int temperatura;

// // //     public Termostato(int temperatura) {
// // //         this.temperatura = temperatura;
// // //     }

// // //     public void subirTemperatura(int grados) {
// // //         temperatura += grados;
// // //     }

// // //     public boolean modoCalefaccion() {
// // //         return temperatura < 20;
// // //     }

// // //     public static void main(String[] args) {

// // //         Termostato t = new Termostato(15);

// // //         t.subirTemperatura(3);

// // //         System.out.println("Temperatura: " + t.temperatura);

// // //         if (t.modoCalefaccion()) {
// // //             System.out.println("La calefacción está encendida");
// // //         } else {
// // //             System.out.println("La calefacción está apagada");
// // //         }
// // //     }
// // // }

// // // public class Bateria {

// // //     int porcentaje = 100;

// // //     public void usar() {

// // //         int ciclo = 1;

// // //         while (porcentaje > 0) {

// // //             porcentaje -= 15;

// // //             if (porcentaje < 0) {
// // //                 porcentaje = 0;
// // //             }

// // //             System.out.println("Ciclo " + ciclo + ": " + porcentaje + "%");

// // //             ciclo++;
// // //         }
// // //     }

// // //     public static void main(String[] args) {

// // //         Bateria bateria = new Bateria();

// // //         bateria.usar();
// // //     }
// // // }

// // public class Estudiante {

// //     String nombre;
// //     double nota;

// //     public Estudiante(String nombre, double nota) {
// //         this.nombre = nombre;
// //         this.nota = nota;
// //     }

// //     public static void main(String[] args) {

// //         Estudiante[] estudiantes = {
// //             new Estudiante("Juan", 7),
// //             new Estudiante("Pedro", 8),
// //             new Estudiante("Ana", 9)
// //         };

// //         double suma = 0;

// //         for (int i = 0; i < estudiantes.length; i++) {
// //             suma += estudiantes[i].nota;
// //         }

// //         double promedio = suma / estudiantes.length;

// //         System.out.println("Nota promedio: " + promedio);
// //     }
// // }

// public class Monedero {

//     int monedas;

//     public Monedero(int monedas) {
//         this.monedas = monedas;
//     }

//     public void añadirMonedas(int cantidad) {
//         monedas += cantidad;
//     }

//     public boolean quitarMonedas(int cantidad) {

//         if (monedas >= cantidad) {
//             monedas -= cantidad;
//             return true;
//         }

//         return false;
//     }
// }


// public class Persona {

//     String nombre;
//     Monedero monedero;

//     public Persona(String nombre, int monedas) {
//         this.nombre = nombre;
//         this.monedero = new Monedero(monedas);
//     }

//     public void pasarMonedas(Persona otraPersona, int cantidad) {

//         if (monedero.quitarMonedas(cantidad)) {
//             otraPersona.monedero.añadirMonedas(cantidad);
//             System.out.println(nombre + " ha pasado "
//                     + cantidad + " monedas a " + otraPersona.nombre);
//         } else {
//             System.out.println("No tienes suficientes monedas.");
//         }
//     }

//     public static void main(String[] args) {

//         Persona persona1 = new Persona("Juan", 100);
//         Persona persona2 = new Persona("Pedro", 50);

//         persona1.pasarMonedas(persona2, 30);

//         System.out.println("Monedas de Juan: "
//                 + persona1.monedero.monedas);

//         System.out.println("Monedas de Pedro: "
//                 + persona2.monedero.monedas);
//     }
// }

