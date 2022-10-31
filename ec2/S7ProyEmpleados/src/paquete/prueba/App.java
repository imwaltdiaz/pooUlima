package paquete.prueba;

import paquete.clases.*;

public class App {
  public static void main(String[] args) 
  {
      Director refD1 = new Director(333,"nombre 1","M","Director de Ventas",5,15,6500);
      refD1.CalcularBonificacion();
      refD1.CalcularSueldoTotal();
      refD1.IngresarAsistencia();
      System.out.println(refD1.VerInfo());
      
      System.out.println("\n");
      
      Ejecutivo refE1 = new Ejecutivo(10,"nombre 2","F","Ejecutivo de Cuentas",10,3,4500);
      refE1.CalcularBonificacion();
      refE1.CalcularSueldoTotal();
      System.out.println(refE1.VerInfo());
      
      System.out.println("\n");
      
      Gerente refG1 = new Gerente(100,"nombre 3","F","Gerente General",15,22,10500);
      refG1.CalcularBonificacion();
      refG1.CalcularSueldoTotal();
      System.out.println(refG1.VerInfo());
      
      // no se puede crear objetos de una clase abstracta - Error
      //Empleado refEE1 = new Empleado("nombre 4","M","Empleado general",18,12,7500);
      
  }
}