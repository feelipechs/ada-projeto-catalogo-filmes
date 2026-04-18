package models;

//Thiago Manhães Lima
public class Ator extends Pessoa {


    public Ator(String nome, String dataNascimento, int numeroFilmes, String personagem) {
        super(nome, dataNascimento);
        this.numeroFilmes = numeroFilmes;
        this.personagem = personagem;
    }

    public int getNumeroFilmes (){
            return numeroFilmes;
        }
    public int getPersonagem() {
        return personagem;
    }

}
