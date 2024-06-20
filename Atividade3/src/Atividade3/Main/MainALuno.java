package Atividade3.Main;

import java.util.Scanner;

import Atividade3.Model.*;

public class MainALuno {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o Nome do Aluno: ");
		String nomeAluno = scan.nextLine();
		
		Aluno novoAluno = new Aluno(nomeAluno);
		
		System.out.println("Digite o Nome da Disciplina: ");
		String nomeDisciplina = scan.nextLine();
		
		System.out.println("Digite a carga Horária da disciplina: ");
		int cargaHorariaDisciplinar = scan.nextInt();
		
		Disciplina novaDisciplina = new Disciplina(nomeDisciplina, cargaHorariaDisciplinar);
		novoAluno.setDisciplina(novaDisciplina);
		
		System.out.println("\n Dados do Aluno: ");
		System.out.println(novoAluno);

		scan.close();
		
	}

}
