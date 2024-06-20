package Atividade4.Model;

public class Carro {
	
	private String marca;
	private String modelo;
	private double velMax = 180;
	private double velAtual = 0;
	private boolean estadoCarro;
	private int tanqueAtual;
	private int capacidadeTanque = 50;
	
	
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
	
	
	public double getVelMax() {
		return velMax;
	}
	public void setVelMax(double velMax) {
		this.velMax = velMax;
	}
	
	
	public double getVelAtual() {
		return velAtual;
	}
	public void setVelAtual(double velAtual) {
		this.velAtual = velAtual;
	}
	
	
	public boolean isEstadoCarro() {
		return estadoCarro;
	}
	public void setEstadoCarro(boolean estadoCarro) {
		this.estadoCarro = estadoCarro;
	}
	

	public int getTanqueAtual() {
		return tanqueAtual;
	}
	public void setTanqueAtual(int tanqueAtual) {
		this.tanqueAtual = tanqueAtual;
	}
	
	
	public int getCapacidadeTanque() {
		return capacidadeTanque;
	}
	public void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
	
	
	
	
	public Carro(String marca, String modelo, double velMax, double velAtual, boolean estadoCarro, int tanqueAtual, int capacidadeTanque) {
		this.marca = marca;
		this.modelo = modelo;
		this.velMax = velMax;
		this.velAtual = velAtual;
		this.estadoCarro = estadoCarro;
		this.tanqueAtual = tanqueAtual;
		this.capacidadeTanque = capacidadeTanque;
	}
	
	
	public void LigarCarro() {
		this.estadoCarro = true;
		System.out.println("Carro Ligado");
	}
	
	public void DesligarCarro() {
		this.estadoCarro = false;
		System.out.println("Carro Desligado");
	}
	
	public void Ligar() {
		
		if(this.estadoCarro = false) {
			System.out.println("O carro esta ligando");
			System.out.println("Carro Ligado");
			this.estadoCarro = true;
		}else {
			
			System.out.println("Ligando...");
			this.estadoCarro = true;
			System.out.println("Carro Ligado");
			
		}
	}
	
	public void Desligar() {
		if(this.estadoCarro = true) {
			System.out.println("Carro Desligando");
			System.out.println("Carro Desligado");
			this.estadoCarro = false;
		}else {
			
			System.out.println("Carro Ligado... Desligando Carro");
			this.estadoCarro = false;
			System.out.println("Carro Desligado");
			
		}

	}
	
	public void acelerarCarro(double aceleracao) {
		if(estadoCarro == false) {
			System.out.println("Para Acelerar o carro deve estar ligado");
		}else {
			if(this.velAtual < this.velMax) {
				this.velAtual+=aceleracao;
				System.out.println("Carro Acelerando");
				System.out.println("A velocidade atual do carro é de: " + this.velAtual);
				if(velAtual >= velMax) {
					System.out.println("Velocidade maxima Atingida 180KM/H !!!!!");
				}
			}
		}
	}
	
	public void FrearCarro(double frenagem) {
		if(estadoCarro == false) {
			System.out.println("Ligue o Carro Primeiro");
		}else{
			if(this.velAtual - frenagem > 0) {
				velAtual -= frenagem;
				System.out.println("Carro Freou Velocidade atual do seu carro é de: " + velAtual);
				
			}else{
				velAtual = 0;
				System.out.println("Carro esta Parado acelere para poder frear");
			}
		}
	}
	
	public void AbastecerCarro(int abastecimento) {
		if(this.tanqueAtual > this.capacidadeTanque) {
			System.out.println("capacidade atual maior que a capacidade de tanque do carro");
		}else {
			if(this.tanqueAtual + abastecimento <= this.capacidadeTanque) {
				this.tanqueAtual += abastecimento;
				System.out.println("A quantidade de combustivel em litros atual é de: " + this.tanqueAtual);
				
				
			}
		}
	}
	
}
