/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenascirdobleenlazada;

/**
 *
 * @author USRKAP
 */
public class Mainlistacirculardoble {
    {
     listacirculardoble x=new listacirculardoble();
     int a=5;
     int b=10;
     int c=15;
     int d=20;
     int e=25;
     int f=30;
     x.alta(a);
     x.alta(b);
     x.alta(c);
     x.alta(d);
     x.alta(e);
     x.alta(f);
     System.out.println("Valores iniciales:\n");
     x.imprimir();
     x.bajaxposicion(0);
     System.out.println("\nDespues de borrar la Posicion 3:\n");
     x.imprimir();
    }
}
