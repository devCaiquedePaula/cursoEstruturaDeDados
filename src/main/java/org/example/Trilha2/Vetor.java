package org.example.Trilha2;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(final int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    /* Pessimo algoritmo de adicionar elementos, pois percorre o vetor inteiro
        public void adicionar(final String elemento) {
        for (int i =0; i < elementos.length; i++){
            if (elementos[i] == null){
                this.elementos[i] = elemento;
                break;
            }
        }
    }
    * */

    public boolean adicionar(final String elemento) throws Exception {
        aumentarCapacidade();
        if (tamanho < elementos.length) {
            elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    private void aumentarCapacidade() {
        if (tamanho == elementos.length){
            String[] novoArray = new String[elementos.length * 2];
            for (int i = 0; i < elementos.length; i++) {
                novoArray[i] = elementos[i];
            }
            elementos = novoArray;
        }
    }
}

