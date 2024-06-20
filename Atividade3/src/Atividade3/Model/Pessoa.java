package Atividade3.Model;

public class Pessoa {
	
	private String nome;
	private int idade;
	private Endereco endereco;
	private int numero;
	
	public Pessoa(String nome, int idade, Endereco endereco, int numero) {
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.numero = numero;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getDados() {
		return "A pessoa: " + nome + " Que tem " + idade + " anos e mora no Endereço: " + endereco.getEndereco();
		
	}
	

	
	

}
