package Atividadade5.Model;

public class Moto extends Veiculo{

	private boolean sidecar;

	public Moto(String placa, String marca, String modelo, String fabricante, int ano, boolean sidecar) {
		super(placa, marca, modelo, fabricante, ano);
		this.sidecar = sidecar;
		
	}
	
	
	
		public boolean getSidecar() {
		return sidecar;
	}

	public void setSidecar(boolean sidecar) {
		this.sidecar = sidecar;
	}



		public void Empinar() {
			System.out.println("Empinou a Moto");
		}
		
		public void Caiu() {
			System.out.println("Caiu e bateu a cara no chão");
		}
		
		public String toString3() {
		return "Moto: \n"
			+ "Placa: "+ this.getPlaca() +"\n"
			+ "Marca: "+ this.getMarca() +"\n"
			+ "Modelo: "+ this.getModelo() +"\n"
			+ "Ano: " + this.getAno() + "\n"
			+ "Fabricante: " + this.getFabricante() + "\n"
			+ (this.sidecar == true ? " Possui" : "Nao Possui");
		
		}


		
	}
	
