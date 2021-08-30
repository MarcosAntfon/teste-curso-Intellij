package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        Gato gato = new Gato();
        System.out.println(gato);

        Livros livro1 = new Livros("O problema dos 3 corpos" , 300);
        System.out.println(livro1);

        /*int a = 5;
         int b = 3;
        System.out.println("Hello World! " + (a+b));
    }*/
    }
}

class Livros {
    private String nome;
    private Integer numdepag;

    public Livros(String nome, Integer numdepag) {
        this.nome = nome;
        this.numdepag = numdepag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumdepag() {
        return numdepag;
    }

    public void setNumdepag(Integer numdepag) {
        this.numdepag = numdepag;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "nome='" + nome + '\'' +
                ", numdepag=" + numdepag +
                '}';
    }
}
