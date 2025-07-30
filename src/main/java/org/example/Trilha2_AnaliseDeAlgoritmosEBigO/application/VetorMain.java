package org.example.Trilha2_AnaliseDeAlgoritmosEBigO.application;

import org.example.Trilha2_AnaliseDeAlgoritmosEBigO.entities.Vetor;

public class VetorMain {
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
