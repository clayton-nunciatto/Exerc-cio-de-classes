package org.introducaoPoo;
import java.util.Scanner;


import classes.Cadastro;

public class Main {
    public static void main(String[] args) {

        Cadastro pf = new Cadastro();

        pf.setNome("Clayton Santana Nunciatto");
        pf.setCpf("221.924.888-74");
        pf.setRg(299178821);

        System.out.println(pf.getNome() + "\n" + pf.getCpf() + "\n" + pf.getRg());

    }
}