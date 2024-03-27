package atividades2703;
import java.util.Scanner;
public class CaixaEletronico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		String cpf,senha;
		double valor,sf,saldo=3000;

		System.out.println("Digite seu CPF: ");
		cpf = ler.nextLine();

		if (cpf.equals("47807378859")) {
			System.out.println("Digite sua senha");
			senha = ler.nextLine();
			if (senha.equals("091722")) {
				System.out.println("Saldo atual é correspondente a " + saldo);
				System.out.println("Que valor você deseja sacar?");
				valor = ler.nextDouble();
				if (valor <=saldo) {
					sf= saldo - valor;
					System.out.println("Seu saldo foi atualizado, valor correspondete é " + sf);
				}else {
					System.out.println("Saldo insuficiente");
				}
			}else {
				System.err.println("Senha incorreta");
			}
		}else {
			System.out.println("CPF inválido");
		}ler.close();
	} 
}