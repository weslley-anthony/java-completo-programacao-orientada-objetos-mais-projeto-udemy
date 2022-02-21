package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.print("Digite a largura: ");
		rectangle.width = sc.nextDouble();
		System.out.print("Digite a altura: ");
		rectangle.height = sc.nextDouble();
		
		System.out.println("Dados do retangulo: " + rectangle);
		
		
		sc.close();
		
	}

}
