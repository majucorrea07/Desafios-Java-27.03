package atividades2703;
import java.util.Scanner;
public class Desafio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int num;
		
		System.out.println("Informe o numero: ");
		num = ler.nextInt();
		
		if (num % 2 == 0)
		System.out.println("Esse numero é par");

		else 
			System.out.println("Esse numero é impar");
	}

}
