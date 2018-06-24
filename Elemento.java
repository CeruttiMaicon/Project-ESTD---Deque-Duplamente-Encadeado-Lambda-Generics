package Deque;

public class Elemento<T> {
	//Elemento<T>
	private Elemento<T> proximo,anterior;
	private T valor;

	public Elemento(T valor) {
		this.valor = valor;
	}

	public void setProximo(Elemento<T> e) { 
		proximo = e; 
	}
	
	public void setAnterior(Elemento<T> e) { 
		anterior = e; 
	}

	public Elemento<T> getProximo() { 
		return proximo; 
	}
	
	public Elemento<T> getAnterior() { 
		return anterior; 
	}
	
	public T getValor() { 
		return valor;
	}
}