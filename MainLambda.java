package Deque;

import java.util.function.Function;

public class MainLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Parametro de entrada e Parametro de Saida 
		//Function uma classe de função para usar o aply
		//
		//Basicamente o lambda serve para se criar funcoes dentro de funcoes

		Function< Integer, Integer > lambda = (x) -> 
		{
			System.out.println(x); 
			return x + 1;
		};
		
		System.out.print( lambda.apply(10) );

	}

}
