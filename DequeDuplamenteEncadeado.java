package Deque;

import java.util.function.Function;

public class DequeDuplamenteEncadeado<T> {

	private Elemento<T> cabeca;
	private Elemento<T> cauda;

	public DequeDuplamenteEncadeado() {
		cabeca = cauda = null;
	}

	// Adiciona como o ultimo
	public void add(T valor) throws Exception {
		System.out.println("Adicionando " + valor);
		Elemento<T> e = new Elemento<T>(valor);
		if (cauda != null) {
			cauda.setProximo(e);
			e.setAnterior(cauda);
			cauda = e;
		}
		if (cabeca == null) {
			cabeca = cauda;
		}
		// O Elemento<T> anterior a cabeça aponta para a cauda
		// O Elemento<T> posterior a cauda aponta para a cabeca
		cauda.setProximo(cabeca);
		cabeca.setAnterior(cauda);
	}

	// Adiciona como primeiro
	public void addFirst(T valor) throws Exception {
		System.out.println("Adicionando " + valor);
		Elemento<T> e = new Elemento<T>(valor);
		if (cabeca != null) {
			cabeca.setAnterior(e);
			e.setProximo(cabeca);
			cabeca = e;
		}
		if (cauda == null) {
			cauda = cabeca;
		}
		// O Elemento<T> anterior a cabeça aponta para a cauda
		// O Elemento<T> posterior a cauda aponta para a cabeca
		cauda.setProximo(cabeca);
		cabeca.setAnterior(cauda);
	}

	// Remove o primeiro (ver no trabson de Gina)
	public T remove() throws Exception {
		if (this.isEmpty()) {
			T o = cabeca.getValor();
			cabeca = cabeca.getProximo();
			if (cabeca == null) {
				cauda = null;
			} else {
				cabeca.setAnterior(null);
			}
			System.out.println("Removendo " + o);
			return o;
		}
		return null;
	}

	// Remove o ultimo (ver no trabson de Gina)
	public T removeLast() throws Exception {
		if (this.isEmpty()) {
			T o = cauda.getValor();
			cauda = cauda.getAnterior();
			if (cauda == null) {
				cabeca = null;
			} else {
				cauda.setProximo(null);
				System.out.println("Removendo " + o);
				return o;
			}
		}
		return null;
	}

	// se está vazio
	public boolean isEmpty() {
		return cabeca == null && cauda == null;
	}

	// limpa o deque
	public void clear() {
		while (!this.isEmpty()) {
			try {
				this.remove();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// lista os objetos do deque
	public void list(Function<T, T> lambda) {

		lambda = (x) -> {
			System.out.println(x);
			return x;
		};

		Elemento<T> e = cabeca;
		while (e != null) {
			lambda.apply(e.getValor());
			e = e.getProximo();
			if (e == cabeca) {
				break;
			}
		}
	}
}

