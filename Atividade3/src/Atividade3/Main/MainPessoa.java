package Atividade3.Main;

import java.util.Scanner;

import Atividade3.Model.Endereco;
import Atividade3.Model.Pessoa;

public class MainPessoa {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o seu nome");
		String nome = scan.nextLine();
		
		System.out.println("Digite a sua idade");
		int idade = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Digite o seu Endereço");
		String endereco = scan.nextLine();
		
		System.out.println("Digite o número da sua casa");
		int numero = scan.nextInt();
		
	
		Endereco enderecoPessoa = new Endereco(endereco, numero);
		
		Pessoa pessoanova = new Pessoa(nome, idade, enderecoPessoa, numero);
		
		System.out.println("\nDetalhe da Pessoa:");
		System.out.println(pessoanova.getDados());
		
		scan.close();

	}

}
