package models;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Filme {
	private String nome;
	private String dataLancamento;
	private double orcamento;
	private String descricao;
	
	private Diretor diretor;
	private List<Ator> atores;
	
	public Filme(String nome, String dataLancamento, double orcamento, String descricao) {
		this.nome = nome;
		this.dataLancamento = dataLancamento;
		this.orcamento = orcamento;
		this.descricao = descricao;
		this.atores = new ArrayList<>();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setDiretor(Diretor diretor) {
		this.diretor = diretor;
	}
	
	public void adicionarAtor(Ator ator) {
		this.atores.add(ator);
	}
	
	public String exibirDetalhes() {
		String nomeDiretor = (diretor != null) ? diretor.getNome() : "Diretor não definido";
		
		NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		String orcamentoFormatado = formatoMoeda.format(orcamento);
		
		String listaAtores = "Não definido";
		
		if (!atores.isEmpty()) {
			listaAtores = "";
			
			for (Ator ator : atores) {
				listaAtores += ator.getNome() + ", ";
			}
			
			listaAtores = listaAtores.substring(0, listaAtores.length() - 2);
		}
		
		return "\n--------- ADA FLIX - CATÁLOGO ---------\n\n" +
				"Filme: " + nome.toUpperCase() + "\n" +
				"Ano de lançamento: " + dataLancamento + "\n\n" +
				"Descrição:\n" + descricao + "\n\n" +
				"Atores: " + listaAtores + "\n" +
				"Diretor: " + nomeDiretor + "\n" +
				"Orçamento: " + orcamentoFormatado + "\n\n" +
				"------ © 2026 Grupo 4 - Ada Flix ------";
	}
}