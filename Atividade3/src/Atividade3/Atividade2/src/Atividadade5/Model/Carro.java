package Atividadade5.Model;

public class Carro extends Veiculo {

	private int qtdPortas;
	private boolean tetoSolar;
	
	public Carro(String placa, String marca, String modelo, String fabricante, int ano, int qtdPortas, boolean tetoSolar) {
		super(placa, marca, modelo, fabricante, ano);
		
		this.qtdPortas = qtdPortas;
		this.tetoSolar = tetoSolar;
		
		
	}

	public int getQtdPortas() {
		return qtdPortas;
	}

	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
	}

	
	public boolean isTetoSolar() {
		return tetoSolar;
	}

	public void setTetoSolar(boolean tetoSolar) {
		this.tetoSolar = tetoSolar;
	}
	
	public void drift() {
		System.out.println("Carro dando Drift");
	}
	
	public String toString1() {
		return "Carro: \n"
				+ "Placa: "+ this.getPlaca() +"\n"
				+ "Marca: "+ this.getMarca() +"\n"
				+ "Modelo: "+ this.getModelo() +"\n"
				+ "Ano: " + this.getAno() + "\n"
				+ "Fabricante: " + this.getFabricante() + "\n"
				+ "Portas: " + this.qtdPortas + "\n"
				+ "TetoSolar:" + (this.tetoSolar == true ? " Possui" : "Nao Possui");
	}
	
	
	
	
}
