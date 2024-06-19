package Atividadade5.Model;

public class Veiculo {
	
	private String placa;
	private String marca;
	private String modelo;
	private String fabricante;
	private int ano;
	
	
	public Veiculo(String placa, String marca, String modelo, String fabricante, int ano) {
		
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	
	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void Ligar() {
		System.out.println("Ligou");
	}
	
	public void Acelerar() {
		System.out.println("Acelerando");
	}
	
	public void Parar() {
		System.out.println("Freando");
	}
	
	public void desligar() {
		System.out.println("Desligando ");
	}
	
	@Override
	public String toString() {
	    return "Veiculo" +
	           "\nplaca: " + placa +
	           "\nmarca: " + marca +
	           "\nmodelo: " + modelo +
	           "\nano: " + ano +
	           "\nfabricante: " + fabricante;
	}
	
	

}
