package models;

public abstract class Pessoa {
	private String nome;
	private String dataNascimento;
	
	public Pessoa(String nome, String dataNascimento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	public abstract String exibirDetalhes();

	public String getNome() {
		return nome;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}
}
