<<<<<<< HEAD
package Atividade3.Main;

import java.util.Scanner;

import Atividade3.Model.Compra;
import Atividade3.Model.Cupom;


public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		Cupom cupom = null;
		
		
		System.out.println("Digite o Valor da compra");
		double valorTotal = scan.nextDouble();
		
		System.out.println("Tem o Cupom de desconto? (S/N)");
		String possuiCupomEsc = scan.next();
		
		if(possuiCupomEsc.equalsIgnoreCase("S")) {
			System.out.println("Digite o código do Cupom: ");
			String codigoCupom = scan.next();
			
			System.out.println("Digite o Valor De Desconto do Cupom");
			double descontoCupom = scan.nextDouble();
			
			cupom = new Cupom(codigoCupom, descontoCupom);
			
		}else {
			System.out.println("Não tem Cupom");
		}
		
		Compra novaCompra = new Compra(valorTotal, cupom);
		novaCompra.setCupom(cupom);
		
		System.out.println("\n Detalhes da compra: " + novaCompra);
		
		scan.close();
		
	}
	
	


}
=======
package Atividade4.Main;

import java.util.Scanner;

import Atividade4.Model.Carro;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		 
        boolean i=true;
        
        Carro meuCarro = new Carro(null, null, 180, 0, false, 0, 50);
        
        System.out.println("Digite a marca do seu carro: ");
		String marca = scan.nextLine();
		meuCarro.setMarca(marca);
 
		System.out.println("Digite o modelo do seu carro: ");
		String modelo = scan.nextLine();
		meuCarro.setModelo(modelo);
		
		System.out.println("Informe a quantidade atual de gasolina: ");
		int tanqueAtual = scan.nextInt();
		meuCarro.setTanqueAtual(tanqueAtual);


		
		
 
        while(i){
            String menu = """
                    *********************************
                    * O que quer fazer com o carro: *                
                    * 1 - Ligar						*
                    * 2 - Acelerar					*
            		* 3 - Frear						*
                    * 4 - Abastecer o carro			*
                    * 5 - Desligar					*
                    * 6 - Sair						*
                    *********************************
                    """;
 
            System.out.println(menu);
            int comando = scan.nextInt();
 
            switch(comando){
                case 1:
                    meuCarro.Ligar();
                    break;
 
                case 2:
                    System.out.println("Quanto de aceleração?");
                    double x = scan.nextDouble();
                    meuCarro.acelerarCarro(x);
                    break;
 
                case 3:
                    System.out.println("Quanto de frenagem?");
                    double y = scan.nextDouble();
                    meuCarro.FrearCarro(y);
                    break;
 
                case 4:
                	
                	System.out.println("Quanto de Gasolina você quer abastecer?");
                    int A = scan.nextInt();
                    meuCarro.AbastecerCarro(A);
                    break;
 
                case 5:
                    meuCarro.Desligar();
                    break;
 
                case 6:
                    System.out.println("Saindo...");
                    i = false;
                    break;
 
                default:
                    System.out.println("Comando inválido. Por favor, tente novamente.");
                    break;
            }
            
            
     

		}

	}

}

>>>>>>> ade69b3acfa5a17801b9814e222cd3351ede6092
