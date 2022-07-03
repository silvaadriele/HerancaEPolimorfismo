package classesLab3;

public class FuncionarioAssalariado extends Funcionario{
	private double salario;
	private double qntSemana; //nao foi utilizado int visto que � possivel trabalhar semanas+alguns dias. Ex: 1 sem e 2 dias -> 1.3 sem
	
	
	public FuncionarioAssalariado(String nome, String cpf, double salario, double qntSemana) {
		super(nome, cpf);
		if (salario <=0 || qntSemana<=0) {
			throw new RuntimeException("Funcion�rio assalariado com valor(es) inv�lido(s)");
		}
		else {
			this.salario = salario;
			this.qntSemana = qntSemana;
		}
	}
	
	public double getSalario() {
		return salario*qntSemana;
	}
	@Override
	public String toString() {
		return super.toString()+ " || Sal�rio: R$ " + getSalario();
	}
	
}
