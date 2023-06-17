//Crie uma classe chamada "Livro" com os seguintes atributos privados:
//
//título (String)
//autor (String)
//anoPublicacao (int)
//preco (double)
//A classe deve fornecer métodos públicos para acessar e modificar esses atributos (encapsulamento).
//
//Crie uma classe chamada "LivroFisico" que herda da classe "Livro". Essa classe representa um livro físico que pode ser vendido na livraria. Adicione um atributo privado extra na classe "LivroFisico":
//
//peso (double)
//Além disso, adicione um método público chamado "calcularFrete" que recebe a distância em quilômetros e retorna o valor do frete com base no peso do livro. Considere que o valor do frete é de R$ 0,01 por grama por quilômetro.
//
//Crie uma classe chamada "LivroDigital" que herda da classe "Livro". Essa classe representa um livro digital que pode ser vendido na livraria. Adicione um atributo privado extra na classe "LivroDigital":
//
//formato (String)
public class Livro {
    private String titulo;
    private String autor;
    private int anoDePublicacao;
    private double preco;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}