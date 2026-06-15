package app;

import model.ContaPoupanca;
import enums.TipoConta;
import enums.Banco;

public class Main {

    public static void main(String[] args) {

        ContaPoupanca conta1 = new ContaPoupanca(
                "Pedro Sante",
                "1001",
                5000,
                TipoConta.POUPANCA,
                Banco.ITAU,
                1.2,
                10);

        ContaPoupanca conta2 = new ContaPoupanca(
                "Joao Silva",
                "2002",
                8000,
                TipoConta.CORRENTE,
                Banco.BRADESCO,
                0.8,
                15);

        System.out.println("===== CONTA 1 =====");
        conta1.exibirExtrato();

        System.out.println("\nAplicando rendimento:");
        conta1.render();

        System.out.println("\nAplicando rendimento por 3 meses:");
        conta1.render(3);

        System.out.println("\nDepositando:");
        conta1.depositar(500);

        System.out.println("\n========================\n");

        System.out.println("===== CONTA 2 =====");
        conta2.exibirExtrato();

        System.out.println("\nAplicando rendimento:");
        conta2.render();

        System.out.println("\nAplicando rendimento por 2 meses:");
        conta2.render(2);

        System.out.println("\nDepositando:");
        conta2.depositar(1000);

        System.out.println("\n========================\n");

        // COMPARAÇÃO USANDO GETTERS

        if (conta1.getSaldo() > conta2.getSaldo()) {
            System.out.println(
                conta1.getTitular()
                + " possui o maior saldo."
            );
        } else if (conta2.getSaldo() > conta1.getSaldo()) {
            System.out.println(
                conta2.getTitular()
                + " possui o maior saldo."
            );
        } else {
            System.out.println(
                "As duas contas possuem o mesmo saldo."
            );
        }
    }
}