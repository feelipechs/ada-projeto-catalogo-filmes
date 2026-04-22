package models;

//Thiago Manhães Lima
public class Diretor extends Pessoa {
    private String genero;

    public Diretor(String nome, String dataNascimento, String genero) {
        super(nome, dataNascimento);
        this.genero = genero;
    }

    @Override
    public String exibirDetalhes() {
        return "Diretor: " + getNome() + " | Nascimento: " + getDataNascimento() + " | Gênero: " + genero;
    }

    public String getGenero() {
        return genero;
    }

    }