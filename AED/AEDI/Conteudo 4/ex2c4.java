import java.util.Scanner;

public class ex2c4 {

	public static void main(String[] args) {
		String nome, cpf, identidade, tEleitor, cMotorista, nomeEmpresa;
		double salario;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		nome = teclado.nextLine();
		System.out.println("Digite o seu CPF: ");
		cpf = teclado.nextLine();
		System.out.println("Digite a sua identidade: ");
		identidade = teclado.nextLine();
		System.out.println("Digite o seu t�tulo de eleitor: ");
		tEleitor = teclado.nextLine();
		System.out.println("Digite o n�mero da sua carteira de motorista: ");
		cMotorista = teclado.nextLine();
		System.out.println("Digite o nome da empresa em que trabalha: ");
		nomeEmpresa = teclado.nextLine();
		System.out.println("Digite o seu sal�rio: ");
		salario = teclado.nextDouble();

		System.out.println();
		System.out.println();
		System.out.println("FICHA FUNCIONAL DE: " + nome);
		System.out.println();
		System.out.println("Documentos:");
		System.out.println("CPF ..................... " + cpf);
		System.out.println("C.I. .................... " + identidade);
		System.out.println("T�tulo de Eleitor ....... " + tEleitor);
		System.out.println("Carteira de Motorista ... " + cMotorista);
		System.out.println();
		System.out.println("Empresa:" + nomeEmpresa);
		System.out.println("Sal�rio: R$" + salario);

		teclado.close();
	}

}
