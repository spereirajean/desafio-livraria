package br.com.cdb.model;

public class Ebook extends Livro {

    private double mbSize=56;

    public double getMbSize(){
        return mbSize;
    }
    public void setMbSize(double mbSize){
        this.mbSize = mbSize;
    }

    public void sizeEbook(){
        System.out.println("O tamanho do ebook é de: "+mbSize+"MB");
    }

}
