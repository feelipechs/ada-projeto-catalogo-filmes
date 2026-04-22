package services;

import models.Ator;
import models.Diretor;
import models.Filme;
import java.util.ArrayList;
import java.util.List;

public class FilmeService {
    private List<Filme> filmes = new ArrayList<>();

    public void cadastrarFilme(String nome, String dataLancamento, double orcamento, String descricao) {
        Filme filme = new Filme(nome, dataLancamento, orcamento, descricao);
        filmes.add(filme);
        System.out.println("Filme cadastrado com sucesso!");
    }

    public void associarDiretor(Filme filme, Diretor diretor) {
        filme.setDiretor(diretor);
        System.out.println("Diretor associado com sucesso!");
    }

    public void associarAtor(Filme filme, Ator ator) {
        filme.adicionarAtor(ator);
        System.out.println("Ator associado com sucesso!");
    }

    public void buscarFilmePorNome(String nome) {
        List<Filme> encontrados = new ArrayList<>();
        for (Filme filme : filmes) {
            if (filme.getNome().equalsIgnoreCase(nome)) {
                encontrados.add(filme);
            }
        }
        if (encontrados.isEmpty()) {
            System.out.println("Nenhum filme encontrado.");
            return;
        }
        for (Filme filme : encontrados) {
            System.out.println(filme.exibirDetalhes());
        }
    }

    public Filme buscarFilmeParaAssociacao(String nome) {
        for (Filme filme : filmes) {
            if (filme.getNome().equalsIgnoreCase(nome)) {
                return filme;
            }
        }
        System.out.println("Filme não encontrado.");
        return null;
    }

    public void listarFilmes() {
        if (filmes.isEmpty()) {
            System.out.println("Nenhum filme cadastrado.");
            return;
        }
        for (Filme filme : filmes) {
            System.out.println("- " + filme.getNome());
        }
    }

    public List<Filme> getFilmes() {
        return filmes;
    }
}