public class Operadores {
    public static void main(String[] args) {
        String resultado;
        int numero = 5;
        boolean isVerdadeiro = true;
        int a, b, c;
        boolean condicaoA = true;
        boolean condicaoB = false;
        a = 5;
        b = 6;
        c = 5;

        numero = - numero;
        System.out.println(numero);
        isVerdadeiro = numero < 5;
        System.out.println("Menor que 5 " + isVerdadeiro);

        numero = numero * -1;
        System.out.println(numero);
        isVerdadeiro = numero < 5;
        System.out.println("Menor que 5 " + isVerdadeiro);

        //Incrementar e decrementar
        numero++;
        System.out.println("Incremento " + numero);

        numero--;
        System.out.println("Decremento " + numero);

        //Ternario
        resultado = a < b ? "Verdadeiro" : "Falso";
        System.out.println("A menor que B: " + resultado);
        resultado = a >= b ? "Verdadeiro" : "Falso";
        System.out.println("A maior ou igual B: " + resultado);
        resultado = a != b ? "Verdadeiro" : "Falso";
        System.out.println("A diferente de B: " + resultado);
        resultado = a != c ? "Verdadeiro" : "Falso";
        System.out.println("A diferente de C: " + resultado);

        //Condicionais
        //E
        if(condicaoA && (a < b)) System.out.println("As duas condições são verdadeiras");
        //OU
        if(condicaoA || condicaoB) System.out.println("Uma das condições é verdadeiras");
    }
}
