package model;

import enums.TipoConta;
import enums.Banco;

// HERANÇA
public class ContaPoupanca extends Conta {

    private double taxaRendimento;
    private int diaAniversario;

    public ContaPoupanca(String titular,
                         String numero,
                         double saldo,
                         TipoConta tipoConta,
                         Banco banco,
                         double taxaRendimento,
                         int diaAniversario) {

        super(titular, numero, saldo, tipoConta, banco);

        this.taxaRendimento = taxaRendimento;
        this.diaAniversario = diaAniversario;
    }

    // OVERRIDE
    @Override
    public void render() {

        double rendimento = getSaldo() * (taxaRendimento / 100);

        setSaldo(getSaldo() + rendimento);

        System.out.println("Rendimento aplicado: R$" + rendimento);
    }

    // OVERLOAD
    public void render(int meses) {

        for (int i = 1; i <= meses; i++) {
            render();
        }

        System.out.println("Rendimento aplicado por "
                + meses + " meses.");
    }

    // OVERRIDE
    @Override
    public void exibirExtrato() {

        super.exibirExtrato();

        System.out.println("Taxa de rendimento: "
                + taxaRendimento + "%");

        System.out.println("Dia aniversário: "
                + diaAniversario);
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public int getDiaAniversario() {
        return diaAniversario;
    }
}