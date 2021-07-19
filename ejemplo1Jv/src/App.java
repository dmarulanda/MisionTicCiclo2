public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("MisionTic");
        int variable = 8;
        System.out.println(variable);
        boolean variable2 = true;
        String variable3 = "Daniela";
        float variable4 = 1.2f; /*los #s flotantes deben acabar en f*/
        double variable5= 1.8;
        System.out.println(variable4-variable5);
        char variable6 = 'D'; /*solo un caracter*/
        byte variable7 = 127;
        short variable8 = 5;
        int variable9 = 5;
        long variable10 = 5;
        System.out.println(variable7);
        int [] lista = {5,9,3,2}; /*son arreglos, solo un tipo */
        System.out.println(lista[0]); /*se conserva el tema de posiciones */
        var variable11 = "hola"; /* no se declara la variable porque se intuye dependiendo de la igualdad, no se reocmienda su uso*/
        String variable12 = "Hola\nMundo";
        String variable13 = "Hola\tMundo";
        String variable14 = "Hola\"Mundo\"";
        System.out.println(variable12);
        System.out.println(variable13);
    }
}
