package Deque;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DequeDuplamenteEncadeado<Integer> n = new DequeDuplamenteEncadeado<Integer>();
			
			n.add(8);
			n.add(88);
			n.add(888);
			n.add(8999);
			
			n.list();
		}
		catch (Exception ex) {
			
		}
	}

}
