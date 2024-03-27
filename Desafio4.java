package atividades2703;
import java.util.Scanner;
public class Desafio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner ler = new Scanner (System.in);
		int tri1,tri2,tri3;
		
		System.out.println("Digite a medida do triangulo: ");
		tri1 = ler.nextInt();
		
		System.out.println("Digite a medida do triangulo: ");
		tri2 = ler.nextInt();
		
		System.out.println("Digite a medida do triangulo: ");
		tri3 = ler.nextInt();
		
		if (tri1 == tri2 && tri2 == tri3) {
	    System.out.println("Triangulo equilatero");
		}
		else if (tri1 == tri2 || tri2 == tri3 || tri3 == tri1) {
			 System.out.println("Triangulo isóceles");
		}
		else
		System.out.println("Triangulo escaleno");
	
	    ler.close();
	}
}
