package epn;

public class Aplicacion {
	public static void main(String[] args) throws Exception{
		ListaCirDoblEnlazada listaCircular = new ListaCirDoblEnlazada();

		System.out.println("LISTA CIRCULAR DOBLE ENLAZADA");

		// Agregar al final de la lista circular
		listaCircular.agregarAlFinal(1);
		listaCircular.agregarAlFinal(25);
		listaCircular.agregarAlFinal(9);
		// Agregar in inicio de la lista circular
		listaCircular.agregarAlInicio(70);
		listaCircular.agregarAlInicio(33);
		listaCircular.agregarAlInicio(568);

		System.out.println("LISTA CIRCULAR DESDE EL INICIO AL FIN\n");
		listaCircular.listar();
		System.out.println("\nTOMAR EL VALOR DE LA POSICION 2");
		System.out.println(listaCircular.getValor(2));
		System.out.println("LISTA CIRCULAR DESDE EL FIN A INICIO\n");
		listaCircular.listarIN();
		
		System.out.print("\nTAMAÑO DE LA LISTA ANTERIOR ");
		System.out.println(listaCircular.getTamanio());
	
		System.out.println("\nVER SI EL VALOR 568 EXISITE EN LA LISTA");
		System.out.println(listaCircular.buscar(568));
		System.out.println("\nELIMINAR EL NODO CON EL VALOR DE 568");
		listaCircular.removerPorReferencia(568);      
		listaCircular.listar();
	

		System.out.print(" TAMAÑO DE LA LISTA ANTERIOR ");
		System.out.println(listaCircular.getTamanio());        
		System.out.println("\nInsrta un nodo con valor 43 despues del 9");
		listaCircular.insertarPorReferencia(9, 43);
		listaCircular.listar();
		System.out.print(" TAMAÑO DE LA LISTA ANTERIOR ");
		System.out.println(listaCircular.getTamanio()); 
		System.out.println("\nDEJAR VACIA LA LISTA");
		listaCircular.eliminar();        
		listaCircular.esVacia();
	}
}
