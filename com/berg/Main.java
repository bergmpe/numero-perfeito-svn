package com.berg;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		
		System.out.println("N�mero Perfeito");
		while(num != -1){
			System.out.print("Digite um n�mero (-1 p/ sair): ");
			num = scanner.nextInt();
			
			if(NumeroPerfeito.Eperfeito(num))
				System.out.println(num + " � perfeito");
			else
				System.out.println(num + " N�o � perfeito");
		}
		scanner.close();
	}
}
