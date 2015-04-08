package com.berg;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		
		System.out.println("Número Perfeito");
		while(num != -1){
			System.out.print("Digite um número (-1 p/ sair): ");
			num = scanner.nextInt();
			
			if(NumeroPerfeito.Eperfeito(num))
				System.out.println(num + " É perfeito");
			else
				System.out.println(num + " Não é perfeito");
		}
		scanner.close();
	}
}
