package Copia;

public class Aplicacion {

	public static void main(String[] args) throws Exception{
		ListaCirDoblEnlazada listaCircular = new ListaCirDoblEnlazada();

		System.out.println("Lista circular doblemente enlazada");

		// Agregar al final de la lista circular
		listaCircular.agregarAlFinal(12);
		listaCircular.agregarAlFinal(15);
		listaCircular.agregarAlFinal(9);
		// Agregar in inicio de la lista circular
		listaCircular.agregarAlInicio(41);
		listaCircular.agregarAlInicio(6);
		listaCircular.agregarAlInicio(568);

		System.out.println("Lista Circular Inicio a Fin\n");
		listaCircular.listar();
		System.out.println("Lista Circular Fin a Inicio\n");
		listaCircular.listarIN();
		
		System.out.print("\nTamaño: ");
		System.out.println(listaCircular.getTamanio());
		System.out.println("\nObtener el valor del nodo en la posicion 3");
		System.out.println(listaCircular.getValor(3));
		System.out.println("\nConsulta si existe el valor 41");
		System.out.println(listaCircular.buscar(41));
		System.out.println("\nElimina el nodo con el valor 41");
		listaCircular.removerPorReferencia(41);      
		listaCircular.listar();
		System.out.println("\nElimina la lista");
		// listaCircular.eliminar();        
		listaCircular.esVacia();

		System.out.print(" | Tamaño: ");
		System.out.println(listaCircular.getTamanio());        
		System.out.println("\nInsrta un nodo con valor 16 despues del 15");
		listaCircular.insertarPorReferencia(15, 16);
		listaCircular.listar();

	}
}