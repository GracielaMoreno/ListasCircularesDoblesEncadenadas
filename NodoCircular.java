package epn;

public class NodoCircular {
	int valor;

	NodoCircular siguiente;
	NodoCircular anterior;

 NodoCircular(int a){
		this.valor = a;
		this.siguiente = this;
		this.anterior = this;
	}

	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public NodoCircular getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(NodoCircular siguiente) {
		this.siguiente = siguiente;
	}
	public NodoCircular getAnterior() {
		return anterior;
	}
	public void setAnterior(NodoCircular anterior) {
		this.anterior = anterior;
	}


}
