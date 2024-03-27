package atividades2703;
import java.util.Scanner;
public class Desafio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in); 
		int num;
		
		System.out.println("Informe o numero: ");
		num = ler.nextInt();
		
		if (num >1){
			System.out.println("O numero é positivo");
		}	
		else if (num == 0){
	    System.out.println("O numero é zero");
	    }
		if (num <0){
		    System.out.println("O numero é negativo");
	   }


	}
	}
