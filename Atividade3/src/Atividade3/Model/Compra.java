package Atividade3.Model;

// Compra e Cupom (dependencia)

public class Compra {
	
	private double valorTotal;
		private Cupom cupom;
		
		public Compra(double valorTotal, Cupom cupom) {
			this.valorTotal = valorTotal;
			this.cupom = cupom;
		}

		public double getValorTotal() {
			return valorTotal;
		}

		public void setValorTotal(double valorTotal) {
			this.valorTotal = valorTotal;
		}

		
		public Cupom getCupom() {
			return cupom;
		}

		public void setCupom(Cupom cupom) {
			this.cupom = cupom;
		}
		
		
		public double aplicarDesconto() {
			if(cupom != null) {
				return valorTotal * (1 - cupom.getDesconto() / 100);
				
			}else {
				return valorTotal;
			}
		}
		
		@Override
		public String toString() {
	        return "Compra: " + valorTotal + " \nCupom: " + (cupom != null ? cupom.toString() : "Sem cupom") + 
	               " \nTotal com desconto: " + aplicarDesconto();
	    }

}
