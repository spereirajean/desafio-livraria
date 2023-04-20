package br.com.cdb.model;

import java.util.ArrayList;

public class CarrinhoDeCompras {
    ArrayList<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public double calcularTotal() {
        double total = 0.0;

        for (Livro livro : livros) {
            total += livro.getPrice();
        }
        return total;
    }
}

