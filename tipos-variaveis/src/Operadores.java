public class Operadores {
    
    public static void main(String[] args) {
        //positivo e negativo
        int numero = 5;
        numero = - numero;
        System.out.println(numero);
        
        numero = numero * -1;
        System.out.println(numero);

        //incremento e decremento
        numero = 10;
        System.out.println(numero++);
        System.out.println(numero);

        numero = 5;
        System.out.println(numero--);
        System.out.println(numero);

        //negação
        boolean variavel = true;
        System.out.println(!variavel);
        System.out.println(variavel);

        //operador ternário
        int a, b;

        a = 6;
        b = 6;

        String resultado = a==b ? "os valores são iguais" : "os valores são diferentes";
        System.out.println(resultado);

        //condicional
        boolean condicao1 = true;
        boolean condicao2 = true;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras!");
        } 

        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira!");
        } 

        System.out.println("Fim!");
    }
}
