package Copia;

public class ListaCirDoblEnlazada {

	// Puntero que indica el inicio de la lista o conocida tambien
	// como cabeza de la lista.
	NodoCircular inicio;
	NodoCircular ultimo;

	// Variable para registrar el tamaño de la lista.
	public int tamanio;


	public void Lista(){
		inicio = null;
		ultimo= null;
		tamanio = 0;
	}

	public boolean esVacia(){
		if(inicio==null){
			System.out.println("sip");
			return true;
		}

		else 

			return false;
	}

	public int getTamanio(){
		int cant = 0;
		if (!esVacia()) {
			NodoCircular reco=inicio;
			do {
				cant++;
				reco = reco.siguiente;                
			} while (reco!=inicio);
		}  
		return tamanio;
	}

	public void agregarAlFinal(int valor){
		NodoCircular nuevo = new NodoCircular(valor);
		if(inicio==null)
			inicio=nuevo;
		else{
			NodoCircular aux=inicio;
			while(aux.getSiguiente()!=inicio)
				aux=aux.getSiguiente();
			aux.setSiguiente(nuevo);
			nuevo.setAnterior(aux);
			nuevo.setSiguiente(inicio);
			inicio.setAnterior(nuevo);
			ultimo=inicio.getAnterior();
		}
		tamanio ++;
	}
	public void agregarAlInicio(int valor){

		NodoCircular nuevo = new NodoCircular(valor);
		if(inicio==null)
			inicio=nuevo;
		else{
			NodoCircular aux=inicio;
			while(aux.getSiguiente()!=inicio)//null no esta definido 
				aux=aux.getSiguiente();
			aux.setSiguiente(nuevo);
			nuevo.setAnterior(aux);// u -><-54
			nuevo.setSiguiente(inicio);
			inicio.setAnterior(nuevo);
			inicio=nuevo;//el primr nodo
			ultimo=inicio.getAnterior();
		}

		tamanio++;
	}

	public void insertarPorReferencia(int referencia, int valor){
		NodoCircular nuevo = new NodoCircular(valor);
		nuevo.setValor(valor);
		if (!esVacia()) {
			if (buscar(referencia)) {
				NodoCircular aux = inicio;
				while (aux.getValor() != referencia) {
					aux = aux.getSiguiente();
				}	
				if (aux == ultimo) {		
					aux.setSiguiente(nuevo);	
					nuevo.setSiguiente(inicio);
					ultimo = nuevo;
				} 
				else {	
					NodoCircular siguiente = aux.getSiguiente();	
					aux.setSiguiente(nuevo);	
					nuevo.setSiguiente(siguiente);
				}
				tamanio++;
			}
		}      
	}


	public int getValor(int posicion) {

		if(posicion>=0 && posicion<tamanio){      
			if (posicion == 0) {
				return inicio.valor;
			}
			else{             
				NodoCircular aux = inicio;	         
				for (int i = 0; i < posicion; i++) {
					aux = aux.getSiguiente();
				}
				return aux.getValor(); 
			}
		}
		return posicion;
	}

	public boolean buscar(int referencia){

		NodoCircular aux = inicio;
		boolean encontrado = false;
		do{
			if (referencia == aux.getValor()){//dato de busqueda con el q lo contiene
				encontrado = true;
			}
			else{
				aux = aux.getSiguiente();
			}
		}while(aux != inicio && encontrado != true);
		return encontrado;
	}


	public void removerPorReferencia(int referencia){
		if (buscar(referencia)) {
			if (inicio.getValor() == referencia) {
				inicio = inicio.getSiguiente();
				ultimo.setSiguiente(inicio); 
			} else{
				// Crea ua copia de la lista.
				NodoCircular aux = inicio;
				while(aux.getSiguiente().getValor() != referencia){
					aux = aux.getSiguiente();
				}
				if (aux.getSiguiente() == ultimo) {
					aux.setSiguiente(inicio);
					ultimo = aux;
				} else {
					// Guarda el nodo siguiente del nodo a eliminar.
					NodoCircular siguiente = aux.getSiguiente();

					aux.setSiguiente(siguiente.getSiguiente());  
				}
			}
			tamanio--;
		}
	}

	public void eliminar(){

		inicio = null;
		ultimo = null;
		tamanio = 0;
	}  

	public void listar(){

		NodoCircular aux = inicio;
		int i = 0;
		do{
			System.out.print(i + ".[ " + aux.valor + " ]" + "\n");
			aux = aux.siguiente;
			i++;
		}while(aux != inicio);
	}


	public void listarIN(){
		NodoCircular aux = ultimo;
	
		if(!esVacia()){
			int i = 0;
			do{
			
				System.out.print(i + ".[ " + aux.valor + " ]" + "\n");
				aux = aux.anterior;
				i++;
			}	while(aux != ultimo);
		}
	}



}