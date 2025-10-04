package org.introducaoPoo;

class Cadastro {
    String nome;
    int rg;
    String cpf;
    double salario;

    void valorSalario() {
        if (salario > 5000) {
            System.out.println("\nR$ " + salario + ", Este é um bom salário!");}
        else {
            System.out.println("\nR$ " + salario +", Este é um péssimo salário!");}
    }
        void mostrarDados() {
        System.out.println("Nome: " + nome + "\nRg: " + rg + "\nCpf: " + cpf);
    }
}

public class Main {
    public static void main(String[] args) {
      Cadastro pessoaFisica = new Cadastro();
      pessoaFisica.nome = "Clayton";
      pessoaFisica.salario = 7000.00;
      pessoaFisica.cpf = "221.924.888-74";
      pessoaFisica.rg = 299178821;

      Cadastro pessoaFisica2 = new Cadastro();
      pessoaFisica2.nome = "Luana";
      pessoaFisica2.salario = 3000.15;
      pessoaFisica2.cpf = "111.111.111.111";
      pessoaFisica2.rg = 222222222;

      pessoaFisica.valorSalario();
      pessoaFisica.mostrarDados();

      pessoaFisica2.valorSalario();
      pessoaFisica2.mostrarDados();
    }
}