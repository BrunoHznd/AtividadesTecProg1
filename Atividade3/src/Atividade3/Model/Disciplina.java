package Atividade3.Model;

// Agragegação Aluno Disciplina

public class Disciplina {
	
	private String nome;
	private int cargaHoraria;
	
	public Disciplina(String nome, int cargaHoraria) {
		
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public String toString() {
		return "Disciplina: " + nome + "\n " + "Tem a carga Horaria de: " + cargaHoraria + " Horas";
	}
	
	

}
