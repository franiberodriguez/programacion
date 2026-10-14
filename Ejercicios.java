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

// public class Book {
//     private String title;
//     private String author;
//     private int pages;
//     private boolean borrowed;
//     private boolean whitelist;

//     public Book(String title, String author, int pages) {
//         this.title = title;
//         this.author = author;
//         this.pages = pages;
//         this.borrowed = false;
//         this.whitelist = false;

// }

// public String getTitle() {
//     return title;
// }
// public String getAuthor() {
//     return author;
// }
// public boolean isBorrowed() {
//     return borrowed;
// }
// public void setBorrowed(boolean b) {
//     this.borrowed = b;
//     if (borrowed) {
//         BooksBorrowed = BooksBorrowed + 1;
    
// }
// else{
//     BooksBorrowed = BooksBorrowed - 1;
//    }
// }
// public boolean getWhitelist() {
//     return whitelist;
// }
// public void setWhitelist(boolean b) {
//      whitelist = b;
// }
// public static int getNumberOfBooksBorrowed() {
//     return BooksBorrowed;
// }
// public String toString() {
//     return "Name of Book: " + title + ", Author of Book: " + author + ",Borrowed: " + borrowed + ", White List: " + whitelist;
// }

public class LibraryMain {

    public static void main(String[] args) {
       
       Book one = new Book ("Community and Support", "D Larkin");
       Book two = new Book ("Where is Archibald?", "C Rigton");
       Book three = new Book ("Horticulture for the Balcony", "A Abed");

       one.setBorrowed(true);
       two.setBorrowed(true);
       three.setBorrowed(true);

       System.out.println(one.toString());
       System.out.println(two.toString());
       System.out.println(three.toString());
       System.out.println("The number of books borrowed is: " + Book.getNumberOfBooksBorrowed());

    }
}