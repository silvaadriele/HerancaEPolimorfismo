package classesLab3;

public class FuncionarioComissionado extends Funcionario{
	protected double taxaComissao;
	protected double vendasBrutas;
	
	public FuncionarioComissionado(String nome, String cpf, double taxaComissao, double vendasBrutas) {
		super(nome, cpf);
		if (taxaComissao<0 || vendasBrutas<0) {
			throw new RuntimeException("Funcion�rio comissionado com valor(es) inv�lido(s)");
		}
		else{
			this.taxaComissao = taxaComissao;
			this.vendasBrutas = vendasBrutas;
		}
	}
	
	public double getRendimento() {
		return taxaComissao*vendasBrutas;
		
	}
	
	@Override
	public String toString() {
		return super.toString()+ " || Valor a ser recebido: R$" + getRendimento();
	}

}
