package Atividadade5.Model;

public class Caminhao extends Veiculo{
	
	private int capacidadeCargaCaminhao;
	private boolean CabineParaDormir;
	public Caminhao(String placa, String marca, String modelo, String fabricante, int ano, int capacidadeCargaCaminhao, boolean CabineParaDormir) {
		super(placa, marca, modelo, fabricante, ano);
		this.capacidadeCargaCaminhao = capacidadeCargaCaminhao;
		this.CabineParaDormir = CabineParaDormir;
	}
	
	
	public int getCapacidadeCargaCaminhao() {
		return capacidadeCargaCaminhao;
	}
	public void setCapacidadeCargaCaminhao(int capacidadeCargaCaminhao) {
		this.capacidadeCargaCaminhao = capacidadeCargaCaminhao;
	}
	
	
	public boolean getCabineParaDormir() {
		return CabineParaDormir;
	}
	public void setCabineParaDormir(boolean cabineParaDormir) {
		CabineParaDormir = cabineParaDormir;
	}
	
	public void CaminhaoSemCombustivel() {
		System.out.println("Caminhão sem Combustivel");
	}
	
	public void AbastecerCaminhao() {
		System.out.println("Abastecendo o Caminhão Aguarde...");
	}
	
	public void CaminhaoCheio() {
		System.out.println("Caminhão Cheio");
	}
	
	public void Dormir() {
		System.out.println("Motorista dormindo na cabine");
	}
	
	public String String2() {
		return "Caminhao: \n"
				+ "Placa Caminhão: " + this.getPlaca() + "\n"
				+ "Marca Caminhão: "+ this.getMarca() +"\n"
				+ "Modelo Caminhão: "+ this.getModelo() + "\n" 
				+ "Ano de fabricação: " +this.getAno() + "\n"
				+ "Fabricante: " +this.getFabricante() + "\n"
				+ "Capacidade da Carga do Caminhão em toneladas: " + this.capacidadeCargaCaminhao + "\n"
				+ "Cabine para dormir? " + (this.CabineParaDormir == true ? "Tem" : "não tem");
	}
	

}
