package classesLab3;

public class FuncionarioHorista extends Funcionario{
	private double salarioHora;
	private double horas;
	
	public FuncionarioHorista(String nome, String cpf, double salarioHora, double horas) {
		super(nome, cpf);
		if (salarioHora<=0 || horas<=0) {
			throw new RuntimeException("Funcionário horista com valor(es) inválido(s)");
		}
		else {
			this.salarioHora=salarioHora;
			this.horas = horas;
		}
	}
	
	public double calculaSalario() {
		if (horas<40) {
			return salarioHora*horas;
		}
		return 40*salarioHora+(horas - 40)*salarioHora*1.5;
	}
	@Override
	public String toString() {
		return super.toString()+" || Valor a ser recebido na semana: R$ "+calculaSalario();
	}
	
}
