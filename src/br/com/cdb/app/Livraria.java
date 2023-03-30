package br.com.cdb.app;

import br.com.cdb.model.Ebook;
import br.com.cdb.model.Livro;
import br.com.cdb.model.LivroFisico;

import java.util.Scanner;

public class Livraria {
    public static void main(String[] args) {

        Livro livro = new Livro();
        LivroFisico livroFis = new LivroFisico();
        Ebook ebook = new Ebook();
        Scanner input = new Scanner(System.in);

        int numMenu = 0;
            System.out.println("===== Menu inicial =====" +
                    "\n 1 - Valor do livro Físico" +
                    "\n 2 - Tamanho do ebook" +
                    "\n 3 - Valor do frete livro físico" +
                    "\n 4 - Valor do livro com frete" +
                    "\n 5 - Sair");
        numMenu = input.nextInt();

        switch (numMenu){
            case 1:
                livro.calculateTotalPrice();
            case 2:
                ebook.sizeEbook();
            case 3:
                livroFis.getPrice();
            case 4:
                livroFis.priceWithFreight();
        }
    }
}
