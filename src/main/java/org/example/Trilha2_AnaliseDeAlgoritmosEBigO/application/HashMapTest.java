package org.example.Trilha1_FundamentosEConfiguracao;

import java.util.HashMap;

public class HashMapTest {
    // Tempo gasto: 35 ms
    private static final int TAMANHO = 1000000;

    public static void main(String[] args) {
        HashMap<Integer, Produto> map = new HashMap<>();

        for (int i = 0; i <= TAMANHO; i++) {
            map.put(i, new Produto(i, "Produto " + i, i*20.0));
        }

        long startTime = System.currentTimeMillis();
        int codigoASerEncontrado = TAMANHO;

        for (int qtd = 0; qtd <= TAMANHO; qtd++){
            Produto p = map.get(codigoASerEncontrado);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Tempo gasto: " + (endTime - startTime) + " ms");
    }
}
