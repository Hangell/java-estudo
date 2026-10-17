package org.hangell.base;

public class MinhaClasse {

    public static void main(String[] args) {
        String primeironome = "Rodrigo";
        String sobrenome = "Rangel";

        String nomeCompleto = nomeCompleto(primeironome, sobrenome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String nome, String sobrenome) {
        return nome.concat(" ").concat(sobrenome);
    }
}
