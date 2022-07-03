package classesLab3;

public class FuncionarioComissionadoBaseSalario extends FuncionarioComissionado{
	private double salario;
	
	public FuncionarioComissionadoBaseSalario(String nome, String cpf, double taxaComissao, double vendasBrutas, double salario) {
		super(nome, cpf, taxaComissao, vendasBrutas);
		if (taxaComissao<0 || vendasBrutas<0 || salario<=0) {
			throw new RuntimeException("Funcion�rio comissionado com sal�rio base com valor(es) inv�lido(s)");
		}
		else {
			this.salario = salario;
		}
		
	}
	
	@Override
	public double getRendimento() {
		return taxaComissao*vendasBrutas + salario;
		
	}
	@Override
	public String toString() {
		return super.toString();
	}

}
