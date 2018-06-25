package Deque;

import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DequeDuplamenteEncadeado<String> n = new DequeDuplamenteEncadeado<String>();
			
			n.addFirst("8");
			n.addFirst("88");
			
			n.list((x) -> 
			{
				System.out.println(x); 
				return x + 1;
			});
			
			
			//Este não funciona pois a classe Generics impede que você
			//Coloque um tipo diferente do especificado entre os "diamantes"(<>)
//			n.list();
		}
		catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
