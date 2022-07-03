package classesLab3;

public class FuncionarioTeste {
	
	public static void main (String[] args) {
		String[] nomes = {"Ana","Cesar", "Maria", "Jorge", "Guilherme", "Rosi", "Carolina", "Alexandra", "Mateus", "Julia", "Marcia", "André", "Pedro", "Sandra", "Camila", "Carlos","Gabriel","João", "Gabriela", "Amanda", "Sabrina", "Bianca", "Marcos", "Antony", "Vicente"};
		String[] cpfs = {"0000000000", "1111111111","22222222222","33333333333", "44444444444", "55555555555", "66666666666", "77777777777", "88888888888", "99999999999"};
		
		int numeroFuncionarios = (int)(Math.random()*80+1);
		System.out.println("Número total de funcionários gerados pelo sorteio: " + numeroFuncionarios + "\n\n");
		
		for(int x=0; x<numeroFuncionarios; x++) {
			Funcionario f;
			String nome = nomes[(int)(Math.random()*nomes.length)]; 
			String cpf = cpfs[(int) (Math.random()*cpfs.length)];		
			int categoria = (int)(Math.random()*4+1);
			
			if (categoria==1) {
				try{
					f = new FuncionarioAssalariado(nome, cpf, (Math.random()*2000+500), (Math.random()*5+1));
					System.out.println("FUNCIONÁRIO ASSALARIADO:\n"+ f + "\n");
				} 
				catch(RuntimeException e) {
					System.out.println(e.getMessage());
				}
			}
			
			else if (categoria==2) {
				try {
					f = new FuncionarioComissionado (nome, cpf, (Math.random()),(Math.random()*2000+100));
					System.out.println("FUNCIONÁRIO COMISSIONADO:\n" + f + "\n");
				}
				catch(RuntimeException e){
					System.out.println(e.getMessage());
				}
			}
			
			else if(categoria==3) {
				try {
					f = new FuncionarioComissionadoBaseSalario (nome, cpf, (Math.random()),(Math.random()*2000+100),(Math.random()*2000+500));
					System.out.println("FUNCIONÁRIO COMISSIONADO COM SALÁRIO BASE:\n" + f + "\n");
				}
				catch(RuntimeException e) {
					System.out.println(e.getMessage());
				}
			}
			else{
				try {
					f = new FuncionarioHorista(nome,cpf,(Math.random()*300+50),(Math.random()*60+1));
					System.out.println("FUNCIONÁRIO HORISTA:\n" + f + "\n");
				}
				catch(RuntimeException e){
					System.out.println(e.getMessage());
				}
			}
		}
		System.out.println("\nFuncionários adicionados manualmente:\n\n");
		
		Funcionario adicionado = new FuncionarioHorista ("Joana", "12345678912", 15.8, 40);
		System.out.println("FUNCIONÁRIO HORISTA:\n"+adicionado+ "\n");
		
		Funcionario adicionado1 = new FuncionarioComissionado("Mateus", "11223311223", 0.5, 400);
		System.out.println("FUNCIONÁRIO COMISSIONADO:\n"+adicionado1+ "\n");
		
		Funcionario adicionado2 = new FuncionarioComissionadoBaseSalario("Joaquina", "55667788995", 0.5, 1400, 560.75);
		System.out.println("FUNCIONÁRIO COMISSIONADO COM SALÁRIO BASE:\n"+adicionado2+ "\n");
		
		Funcionario adicionado3 = new FuncionarioAssalariado("Joaquina", "55667788995", 1900, 1.4);
		System.out.println("FUNCIONÁRIO ASSALARIADO:\n"+adicionado3+ "\n");
		
		try{
			Funcionario g = new FuncionarioAssalariado("Roberta", "98765432109", 500, 0);
		System.out.println("FUNCIONÁRIO ASSALARIADO:\n"+ g + "\n");
		} 
		catch(RuntimeException e) {
			System.out.println(e.getMessage()+"\n");
		}
		
		try{
			Funcionario h = new FuncionarioComissionadoBaseSalario("Caio", "11121314157", 0.7, 400, -2);
		System.out.println("FUNCIONÁRIO ASSALARIADO:\n"+ h + "\n");
		} 
		catch(RuntimeException e) {
			System.out.println(e.getMessage()+"\n");
		}
		
		try{
			Funcionario i = new FuncionarioComissionado("Macarena", "19191919191", -8, 500);
		System.out.println("FUNCIONÁRIO ASSALARIADO:\n"+ i + "\n");
		} 
		catch(RuntimeException e) {
			System.out.println(e.getMessage()+"\n");
		}
		
		try{
			Funcionario j = new FuncionarioHorista("Joca", "36363642424", 0, 5);
		System.out.println("FUNCIONÁRIO ASSALARIADO:\n"+ j + "\n");
		} 
		catch(RuntimeException e) {
			System.out.println(e.getMessage()+"\n");
		}
		
	}
}