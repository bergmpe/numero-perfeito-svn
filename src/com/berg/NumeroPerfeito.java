package com.berg;

public class NumeroPerfeito {

	//testa se x é divisivel por y.
	public static boolean Edivisor(int x, int y){
		return (x % y) == 0;
	}
	
	//testa se o numero x é perfeito.
	public static boolean Eperfeito(int x){
		int aux = x/2;
		int somaDivisores = 0;
		
		while(aux > 0){
			if( Edivisor(x, aux) ){
				somaDivisores += aux;
			}
			aux--;
		}
		if(x != 0)
			return x == somaDivisores;
		else
			return false;
	}
}
