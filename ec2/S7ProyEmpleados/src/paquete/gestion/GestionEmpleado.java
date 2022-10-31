package paquete.gestion;

import paquete.clases.*;

/**
 *
 * @author wadia
 */
public class GestionEmpleado {
  private Empleado[] arreglo;
  private int conta;

  public GestionEmpleado() {
      //El constructor lo utilizas para inicializar el arreglo
      arreglo = new Empleado[100];
      conta = 0;
  }

  public Empleado[] getArreglo() {
      return arreglo;
  }

  public void setArreglo(Empleado[] arreglo) {
      this.arreglo = arreglo;
  }

  public int getConta() {
      return conta;
  }

  public void setConta(int conta) {
      this.conta = conta;
  }
  //Aqui no vas ac rear objetos, eso será en prueba
  public void Ingresar(Empleado emp){
      if (conta < arreglo.length) {
          arreglo[conta] = emp;
          conta++;
      }
      else {
          System.out.println("No entra");
      }
  }
  //Metodo para buscar empleado
  //Busqueda secuencial y ordenamiento
  public void Buscar(String nombreBuscado){
      for (int i = 0; i < arreglo.length; i++) {
          if (arreglo[i].getNombre().equalsIgnoreCase(nombreBuscado)) {
              System.out.println(arreglo[i].VerInfo());
          }
      }
  }
  //Actualizar la cantidad de vales de consumo de todos los gerentes que se llamen pedro
  //Recorrer el arreglo, no importa que sea directivo ni ejecutivo, pero si gerente, y de ahi actualizarlos
  //Eres gerente? Te llamas Pedro? Actualizar
  public void BuscarActualizar(String nombre, int vales){
      nombre = "Pedro";
      for (int i = 0; i < arreglo.length; i++) {
          if (arreglo[i] instanceof Gerente) {
              if (arreglo[i].getNombre().equalsIgnoreCase(nombre)) {
                  //Necesitas hacer un casteo, decirle que se comporte como la clase que es
                  //arreglo[i].set??? No te funciona, solo te salen los metodos de empleado
                Gerente obj = (Gerente)arreglo[i];
                obj.setValesConsumo(vales);
              }
          }
      }
  }
  /***
  * Ahora eliminemos
  * Tienes que mover todo lo que esta despues de cierta posicion, un ciclo hacia la izquierda, si del espacio 3 se va, el 4 toma la posicion del 3 y 5 del 4 y así 
  * Y el ulitmo objeto debe volverse null sino se copiaría dos veces
  * Y tambine hay que reducir el contador
  * Tenemos un conta que nos va a ayudar a controlar las posiciones y va a ir avanzando ayudar a poner cada objeto en su posiucion
  * 
  * Es decir, iniciamos con esto [null, null, null] conta=0
  * El conta al ser 0, añade un objeto en la posicion 0 creado y tenemos [obj1, null, null]
  * Se vuelve a llamar el ingresar() y ahora conta siendo 1 añade en la pos 1 [obj1, obj2, null] conta = 2
  * Y así sigue con las demás posiciones
  * Pero el contador sigue en la ultima posiicon, 
  ***/
  public void Eliminar(String buscar){
      for (int i = 0; i < conta; i++) {
          //Conta es la referencia de la ultima posicion del arrreglo, i sirve para ubicar los elementos, j sirve para convertir el siguiente elmento y asiignarlo al anterior
          if (arreglo[i].getNombre().equalsIgnoreCase(buscar)) {
              for (int j = i; j < conta-1; j++) {
                  arreglo[j] = arreglo[j+1];
              }
              arreglo[conta-1] = null;
              conta--;
          }
      }
  }
  //Ahora para añadir un objeto en cualquier posicion, tendriamos que copiar elementos de la posicion que deseamos a la derecha y luego copiar el objeto nuevo en la posicion deseada
  //Pero aqui el conta se tiene que sumar
  //luego tendriamos que verificar si hay espacio para añadir un nuevo elemento
  //pero si nos pide añadir digamos en pos 6, habiendo en pos 5 un null, tendríamos que decir que no es correcto poner el obj en una posición mas allá del contador, asi que tenemos que verificar esto
  public void IngresarPos(Empleado obj, int pos){
      if (conta<arreglo.length) {
          if (pos<conta) {
              //Copiar elementos a la derecha
              for (int i = conta-1; i <= pos; i++) {
                  arreglo[i+1] = arreglo[i];
              }
          }
          else {
              System.out.println("La posicion no puede ser mayor al total de empleados ingresados");
          }
      }
      else {
          System.out.println("No hay espacio");
      }
  }
}
