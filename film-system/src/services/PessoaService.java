package services;

import models.Ator;
import models.Diretor;
import java.util.ArrayList;
import java.util.List;

// felipe chagas
public class PessoaService {
    private List<Ator> atores = new ArrayList<>();
    private List<Diretor> diretores = new ArrayList<>();

    public void cadastrarAtor(String nome, String dataNascimento, String personagem) {
        Ator ator = new Ator(nome, dataNascimento, personagem);
        atores.add(ator);
        System.out.println("Ator cadastrado com sucesso!");
    }

    public void cadastrarDiretor(String nome, String dataNascimento, String genero) {
        Diretor diretor = new Diretor(nome, dataNascimento, genero);
        diretores.add(diretor);
        System.out.println("Diretor cadastrado com sucesso!");
    }

    public List<Ator> getAtores() {
        return atores;
    }

    public List<Diretor> getDiretores() {
        return diretores;
    }

    public void listarAtores() {
        if (atores.isEmpty()) {
            System.out.println("Nenhum ator cadastrado.");
            return;
        }
        for (Ator ator : atores) {
            System.out.println("- " + ator.getNome());
        }
    }

    public void listarDiretores() {
        if (diretores.isEmpty()) {
            System.out.println("Nenhum diretor cadastrado.");
            return;
        }
        for (Diretor diretor : diretores) {
            System.out.println("- " + diretor.getNome());
        }
    }
}