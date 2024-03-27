package atividades2703;
import java.util.Scanner;
public class Desafio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner ler = new Scanner(System.in); 
		int num;
		
		System.out.println("Infome o numero do mês ");
		num = ler.nextInt();
		
		if (num == 1) {
			System.out.println("O mês 1 é Janeiro");
		}
		if (num == 2) {
			System.out.println("O mês 2 é Fevereiro");
		}
		if (num == 3) {
			System.out.println("O mês 3 é Março");
		}
		if (num == 4) {
			System.out.println("O mês 4 é Abril");
		}
		if (num == 5) {
			System.out.println("O mês 5 é Maio");
		}
		if (num == 6) {
			System.out.println("O mês 6 é Junho");
		}
		if (num == 7) {
			System.out.println("O mês 7 é Julho");
			}
		if (num == 8) {
			System.out.println("O mês 8 é Agosto");
			}
		if (num == 9) {
			System.out.println("O mês 9 é Setembro");
			}
		if (num == 10) {
			System.out.println("O mês 10 é Outubro");
			}
		if (num == 11) {
			System.out.println("O mês 11 é Novembro");
			}	
		if (num == 12) {
			System.out.println("O mês 12 é Dezembro");
			}
		
		
		else if(num >12){
			System.out.println("Mês inexistente");
		}
		else if(num <1){
			System.out.println("Mês inexistente");
		}
	}


	}


