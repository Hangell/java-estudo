package org.hangell.contabanco.contaterminal;

public class GerenciadorContas {

    private final ContaTerminal[] contas;
    private int qtdContas;

    // Construtor
    public GerenciadorContas(int capacidade) {
        if (capacidade <= 0) {
            throw new IllegalArgumentException("Capacidade inválida");
        }

        this.contas = new ContaTerminal[capacidade];
        this.qtdContas = 0;
    }

    // Adicionar uma conta
    public boolean adicionar(ContaTerminal conta) {

        if (conta == null || qtdContas >= contas.length) {
            return false;
        }

        // Evita cadastrar a mesma conta duas vezes
        if (buscarPorNumero(conta.getNumero()) != null) {
            return false;
        }

        contas[qtdContas] = conta;
        qtdContas++;

        return true;
    }

    // Buscar pelo número
    public ContaTerminal buscarPorNumero(int numero) {

        for (int i = 0; i < qtdContas; i++) {

            if (contas[i].getNumero() == numero) {
                return contas[i];
            }
        }

        return null;
    }

    // Buscar pela agência e nome do cliente
    public ContaTerminal buscarPorAgenciaENome(
            String agencia, String nome) {

        if (agencia == null || nome == null) {
            return null;
        }

        for (int i = 0; i < qtdContas; i++) {

            ContaTerminal conta = contas[i];

            if (conta.getAgencia().equals(agencia.trim())
                    && conta.getNomeCliente().equalsIgnoreCase(nome.trim())) {

                return conta;
            }
        }

        return null;
    }

    // Listar todas as contas
    public void listar() {

        if (qtdContas == 0) {
            System.out.println("Nenhuma conta cadastrada.");
            return;
        }

        for (int i = 0; i < qtdContas; i++) {

            ContaTerminal conta = contas[i];

            System.out.printf(
                    "Conta: %d | Agência: %s | Cliente: %s | Saldo: R$ %.2f%n",
                    conta.getNumero(),
                    conta.getAgencia(),
                    conta.getNomeCliente(),
                    conta.getSaldo()
            );
        }
    }

    public int getQuantidadeContas() {
        return qtdContas;
    }

    public int getCapacidade() {
        return contas.length;
    }
}