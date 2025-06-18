package org.example.Trilha2.application;

import org.example.Trilha2.Vetor;

public class Main {
    public static void main(String[] args) {

        try {
            Vetor nomes = new Vetor(5);
            nomes.adicionar("João");
            nomes.adicionar("Maria");
            nomes.adicionar("José");
            nomes.adicionar("Ana");
            nomes.adicionar("Pedro");
            nomes.adicionar("Lucas");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
