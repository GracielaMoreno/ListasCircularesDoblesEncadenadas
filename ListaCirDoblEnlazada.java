package epn;

public class ListaCirDoblEnlazada {
	
		NodoCircular primero;
		NodoCircular ultimo;

	
		public int tamanio;


		public void Lista(){
			primero = null;
			ultimo= null;
			tamanio = 0;
		}

		public boolean esVacia(){
			if(primero==null){
				System.out.println("sip");
				return true;
			}

			else 

				return false;
		}

		public int getTamanio(){
			int cant = 0;
			if (!esVacia()) {
				NodoCircular reco=primero;
				do {
					cant++;
					reco = reco.siguiente;                
				} while (reco!=primero);
			}  
			return tamanio;
		}

		public void agregarAlFinal(int valor){
			NodoCircular nuevo = new NodoCircular(valor);
			if(primero==null)
				primero=nuevo;
			else{
				NodoCircular aux=primero;
				while(aux.getSiguiente()!=primero)
					aux=aux.getSiguiente();
				aux.setSiguiente(nuevo);
				nuevo.setAnterior(aux);
				nuevo.setSiguiente(primero);
				primero.setAnterior(nuevo);
				ultimo=primero.getAnterior();
			}
			tamanio ++;
		}
		public void agregarAlInicio(int valor){

			NodoCircular nuevo = new NodoCircular(valor);
			if(primero==null)
				primero=nuevo;
			else{
				NodoCircular aux=primero;
				while(aux.getSiguiente()!=primero)//null no esta definido 
					aux=aux.getSiguiente();
				aux.setSiguiente(nuevo);
				nuevo.setAnterior(aux);// u -><-54
				nuevo.setSiguiente(primero);
				primero.setAnterior(nuevo);
				primero=nuevo;//el primr nodo
				ultimo=primero.getAnterior();
			}

			tamanio++;
		}

		public void insertarPorReferencia(int referencia, int valor){
			NodoCircular nuevo = new NodoCircular(valor);
			nuevo.setValor(valor);
			if (!esVacia()) {
				if (buscar(referencia)) {
					NodoCircular aux = primero;
					while (aux.getValor() != referencia) {
						aux = aux.getSiguiente();
					}	
					if (aux == ultimo) {		
						aux.setSiguiente(nuevo);	
						nuevo.setSiguiente(primero);
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
					return primero.valor;
				}
				else{             
					NodoCircular aux = primero;	         
					for (int i = 0; i < posicion; i++) {
						aux = aux.getSiguiente();
					}
					return aux.getValor(); 
				}
			}
			return posicion;
		}

		public boolean buscar(int referencia){

			NodoCircular aux = primero;
			boolean encontrado = false;
			do{
				if (referencia == aux.getValor()){//dato de busqueda con el q lo contiene
					encontrado = true;
				}
				else{
					aux = aux.getSiguiente();
				}
			}while(aux != primero && encontrado != true);
			return encontrado;
		}


		public void removerPorReferencia(int referencia){
			if (buscar(referencia)) {
				if (primero.getValor() == referencia) {
					primero = primero.getSiguiente();
					ultimo.setSiguiente(primero); 
				} else{
					// Crea ua copia de la lista.
					NodoCircular aux = primero;
					while(aux.getSiguiente().getValor() != referencia){
						aux = aux.getSiguiente();
					}
					if (aux.getSiguiente() == ultimo) {
						aux.setSiguiente(primero);
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

			primero = null;
			ultimo = null;
			tamanio = 0;
		}  

		public void listar(){

			NodoCircular aux = primero;
			int i = 0;
			do{
				System.out.print(i + ")" + aux.valor + "" + "\n");
				aux = aux.siguiente;
				i++;
			}while(aux != primero);
		}


		public void listarIN(){
			NodoCircular aux = ultimo;
		
			if(!esVacia()){
				int i = 0;
				do{
				
					System.out.print(i + ")" + aux.valor  + "\n");
					aux = aux.anterior;
					i++;
				}	while(aux != ultimo);
			}
		}

}
