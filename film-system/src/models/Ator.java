package models;

//Thiago Manhães Lima
public class Ator extends Pessoa {
    private String personagem;

    public Ator(String nome, String dataNascimento, String personagem) {
        super(nome, dataNascimento);
        this.personagem = personagem;
    }

    @Override
    public String exibirDetalhes() {
        return "Ator: " + getNome() + " | Nascimento: " + getDataNascimento() + " | Personagem: " + personagem;
    }

    public String getPersonagem() {
        return personagem;
    }

}
