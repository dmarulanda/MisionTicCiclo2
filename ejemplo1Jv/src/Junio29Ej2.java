import java.util.Scanner;

public class Junio29Ej2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int resultado = contadorDigitos(numero);
        System.out.println(resultado);
    }
    public static int contadorDigitos (int numero){
        int cifras = 0;
        while(numero!=0){
            numero/=10;
            cifras++;  
        }
        return cifras;
    }
}
//Ejercicio 2: Implemente un algoritmo que reciba un número por teclado 
//y cuente cuántas cifras (o dígitos) contiene e imprima el mensaje en consola.