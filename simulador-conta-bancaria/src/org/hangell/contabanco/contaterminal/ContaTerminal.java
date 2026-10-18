package org.hangell.contabanco.contaterminal;

public class ContaTerminal {

    private final int numero;
    private final String agencia;
    private final String nomeCliente;
    private double saldo;

    public ContaTerminal(int numero, String agencia,
                         String nomeCliente, double saldo) {

        if (!Double.isFinite(saldo) || saldo < 0) {
            throw new IllegalArgumentException("Saldo inicial inválido");
        }

        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean sacar(double valor) {
        if (!Double.isFinite(valor) || valor <= 0 || valor > saldo) {
            return false;
        }

        saldo -= valor;
        return true;
    }

    public boolean depositar(double valor) {
        if (!Double.isFinite(valor) || valor <= 0 ||
                !Double.isFinite(saldo + valor)) {
            return false;
        }

        saldo += valor;
        return true;
    }
}