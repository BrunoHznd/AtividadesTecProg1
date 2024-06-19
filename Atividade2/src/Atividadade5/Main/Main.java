package Atividadade5.Main;

import Atividadade5.Model.*;

public class Main {

	public static void main(String[] args) {
		
		Carro novoCarro = new Carro("B2204progphp","Fusca","Volkswagem", "Volkswagem", 1980,  2, false);
		System.out.println(novoCarro);
		novoCarro.Ligar();
		novoCarro.Acelerar();
		novoCarro.drift();
		novoCarro.Parar();
		novoCarro.desligar();
		System.out.println("\n");
		
		Moto novaMoto = new Moto("uex2m02p4","Biz","Honda","Honda",2024,true);
		System.out.println(novaMoto);
		novaMoto.Ligar();
		novaMoto.Empinar();
		novaMoto.Caiu();
		System.out.println("\n");	 
		
		
		Caminhao novoCaminhao = new Caminhao("BRJaVa2024", "Volvo","Volvo FH540", "Volvo", 2019, 80, true);
		System.out.println(novoCaminhao);
		novoCaminhao.Ligar();
		novoCaminhao.CaminhaoSemCombustivel();
		novoCaminhao.AbastecerCaminhao();
		novoCaminhao.CaminhaoCheio();
		novoCaminhao.Acelerar();
		novoCaminhao.Parar();
		novoCaminhao.desligar();
		novoCaminhao.Dormir();
		System.out.println("\n");

	}

}
