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

    @Override
    public void calculateTotalPrice() {
        System.out.println("\n O preço total da compraé de R$:" + getPriceFreight() + getPrice());
    }
}
