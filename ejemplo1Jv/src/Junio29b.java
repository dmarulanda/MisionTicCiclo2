public class Junio29b {
    public static void main(String[] args){
        /*int a=5; //Expresiones
        System.out.println(5+5);
        System.out.println(5-5);
        System.out.println(5*5);
        System.out.println(5/5);
        System.out.println(5%5);
        System.out.println(Math.pow(4, 3)); //potencia
        System.out.println(Math.sqrt(16)); //raiz cuadrada
        System.out.println(Math.abs(3-5)); //valor absoluto
        System.out.println(Math.cbrt(64)); //raiz cubica */
        /*int contador = 0;
        contador = contador + 1; //para aumentar de 1 en 1
        contador +=1; //para aumentar de 1 en 1
        contador ++; //para aumentar de 1 en 1 esta es la más usada
        contador --; //para disminuir de 1 en 1
        contador +=4; //Ayumentar en 4
        contador -=2; //Disminuir en 2
        contador *=7; //valor anterior por 7
        contador /=2; //valor anterior divido 5
        contador %=2; // valor anterior modulo 2
        System.out.println(contador);*/
        //int numero = 1;
        //System.out.println(numero++);//primero muestra y luego suma
        //System.out.println(++numero);//primero suma y luego muestra
        //System.out.println(numero);
        //System.out.println(numero--);
        //System.out.println(++numero);
        //char caracter = 'J';
        //System.out.println(++caracter);
        //System.out.println(--caracter);
        //caracter +=2;
        //System.out.println(caracter);
        /*if (5>2){
            System.out.println(":)");
        }*/
        /*if (5 !=2){
            System.out.println(":)");
        }else{
            System.out.println(":(");
        }*/
        /*String resultado = 5>2 ? ":)" : ":("; //solo un if else (sencillos)
            System.out.println(resultado);*/
        /*if (5>3 | 4>6){// &=and |=or la && se utiliza para que 
            cuando haya un falso no se evaluen las demás; || para que en cuento haya un verdadero no haga
            lo demás
            System.out.println("?");
        }
        if (!(5==1)){
            System.out.println(":(");
        }*/
        if(5>3 ^ 5>4){//^ es un o exclusivo, solo una debe ser verdad
            System.out.println(":)");
        }else{
            System.out.println("Se gano el regaño");
        }
    }
}
