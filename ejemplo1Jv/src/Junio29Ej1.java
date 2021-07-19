import java.util.Scanner;
//ejercicio 1: Implemente un algoritmo que dado un nombre en una variable de tipo cadena, imprima un saludo en consola.

public class Junio29Ej1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un nombre ");
        String nombre = scanner.nextLine();
        //System.out.println("Hola " + nombre);
        System.out.println(saludar(nombre));
    }

    public static String saludar(String nombre){//forma de crear funciones
        return "Hola " + nombre + "!";

    }
}
