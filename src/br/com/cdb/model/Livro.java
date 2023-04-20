package br.com.cdb.model;

public class Livro {

    private String title;
    private String author;
    private String identificationNumber;
    private double price=30;

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public String getIdentificationNumber(){
        return identificationNumber;
    }
    public void setIdentificationNumber(String identificationNumber){
        this.identificationNumber = identificationNumber;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public void calculateTotalPrice(){
        System.out.println("O preço do livro é de R$"+price);
    }
}
