import java.util.Scanner;

public class Junio29 {

    public static void main(String[] args){
        /*Scanner scanner = new Scanner(System.in); //Forma de capturar datos, recibir datos por teclado
        //variable = input
        System.out.println("Ingresa una palabra ");
        String entrada = scanner.nextLine(); //Forma de recibir datos str
        System.out.println("El mensaje fue " + entrada);
        System.out.println("Ingresa un numero ");
        int resultado = scanner.nextInt();
        System.out.println("El numero fue " + resultado); //Forma de recibir datos int
        if (resultado>7){
           System.out.println("El resultado es mayor a 7:)");
        }else if (resultado>2){
            System.out.println("el resultado es mayor a 2 T.T");
        }else{
            System.out.println("El resultado es menor que 7:(");
        }
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Ingresa un animal");
        String animal = scanner1.nextLine();
        if (animal.equals("Perro")){ //equals para str ; == para int
            System.out.println("Woff");
        }else if(animal.equals("Gato")){
            System.out.println("Miau");
        }else{
            System.out.println("No encuentro el animal");
        }

        switch (animal){ //Usado para igualdades, también funciona con int
            case "Perro":
                System.out.println("Woff");
                break;
            case "Gato":
                System.out.println("Miau");
                break;
            case "Loro":
                System.out.println("Quiere cacao?");
                break;
            default:
                System.out.println("No se encontró");
        }
        System.out.println("Ingresa un numero ");
        int numero = scanner.nextInt();
        switch (numero){ //Usado para igualdades, también funciona con int
            case 0:
                System.out.println("Es igual a 0");
                break;
            default:
                System.out.println("No es igual a 0");
        }
            int contador = 1;
            while(true){
                System.out.println(":)");
                contador = contador + 1;
                if (contador==5){
                    break;
            }
        }*/
        /*int num = 5;
        do{
            System.out.println("ok :)");
        }while(num>7); //Do while, para garantizar que entre al menos una vez a la función
        */

        /*for(int i=0;i<5;i=i+1)//inicia;termina;incremento
        {
            System.out.println(i);
        }*/
        /*for(int i=7;i>0;i=i-1){
            System.out.println(i);
        }*/
        /*for(int i=0;i<=20;i=i+2){
            System.out.println(i);
        } */
        for(int i=0;i<=20;i=i+2){
            if (i==8){
                //continue;
                break;
            }
            System.out.println(i);
        }
    }

}
        


    