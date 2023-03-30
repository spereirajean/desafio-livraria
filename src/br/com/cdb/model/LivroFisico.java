package br.com.cdb.model;

public class LivroFisico extends Livro {

    private double weight;
    private double priceFreight = 15;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPriceFreight() {
        return priceFreight;
    }

    public void setPriceFreight(double priceFreight) {
        this.priceFreight = priceFreight;
    }

    public void freigthPrice() {
        System.out.println(priceFreight);
    }

    public void priceWithFreight() {
        double priceWithFreight = getPrice() + getPriceFreight();
        System.out.println("O valor do livro com frete é de R$" + priceWithFreight);
    }
}
