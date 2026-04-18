package models;

//Thiago Manhães Lima
public class Diretor extends Pessoa {


    public Diretor(String nome, String dataNascimento, int numeroFilmes, String genero) {
        super(nome, dataNascimento);
        this.numeroFilmes = numeroFilmes;
        this.genero = genero;
    }

    public int getNumeroFilmes() {
        return numeroFilmes;

    }

    public int getGenero() {
        return genero;
    }

    }