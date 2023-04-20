package br.com.cdb.app;

import br.com.cdb.model.Ebook;
import br.com.cdb.model.Livro;
import br.com.cdb.model.LivroFisico;

import java.util.ArrayList;
import java.util.Scanner;

public class Livraria {
    public static void main(String[] args) {
        ArrayList<Livro> Cátalogo = new ArrayList();

        LivroFisico fisico = new LivroFisico();
        fisico.setTitle("Pai Rico, Pai Pobre");
        fisico.setAuthor("Robert T. Kiyosaki");
        fisico.setIdentificationNumber("01");
        fisico.setWeight(0.950);
        fisico.setPriceFreight(14.99);
        fisico.setPrice(45.99);

        LivroFisico fisico02 = new LivroFisico();
        fisico02.setTitle("O Homem Mais Rico da Babilônia");
        fisico02.setAuthor(" George S. Clasoni");
        fisico02.setIdentificationNumber("02");
        fisico02.setWeight(0.950);
        fisico02.setPriceFreight(09.99);
        fisico02.setPrice(17.90);

        Ebook ebook = new Ebook();
        ebook.setTitle("Do Mil ao Milhão. Sem Cortar o Cafezinho.");
        ebook.setAuthor("Thiago Nigro");
        ebook.setPrice(22.90);
        ebook.setMbSize(24.5);

        Ebook ebook02 = new Ebook();
        ebook02.setTitle("Mais esperto que o Diabo: O mistério revelado da liberdade e do sucesso");
        ebook02.setAuthor("Napoleon Hill");
        ebook02.setPrice(29.90);
        ebook02.setMbSize(30.5);
        }
    }

