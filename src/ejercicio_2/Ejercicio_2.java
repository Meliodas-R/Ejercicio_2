package ejercicio_2;

import java.util.Scanner;

/**
 * 2. Recoger por teclado el nombre que introduzca el usuario y mostrarlo
 * por pantalla con un mensaje de bienvenida. Ejemplo: "Fernando" 
 * Resultado: Bienvenido, Fernando.
 *
 */
public class Ejercicio_2 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String nombre;
        
        System.out.print("Introduzca su nombre: ");
        nombre=teclado.nextLine();
        System.out.println("Bienvenido, " + nombre + ".");
         
    }

}
