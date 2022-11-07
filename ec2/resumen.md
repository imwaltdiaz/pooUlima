# Resumen

```md
Algoritmo burbuja:
  Inicio
    Hacer
      para i = 0 hasta n -1
        si (datos[i] > datos[i+1])
          Inicio
            auxiliar = datos[i]
            datos[i] = datos[i+1]
            datos[i+1] = auxiliar
          Fin
        Fin si
      Fin para
  Fin

Acuerdate del burbuja que no es hasta el n de length sino hasta el conta, xq no sabes si necesariamente habrán 300 o 1000 objetos

El algoritmo de arriba es ascendente, cambia el signo para descendente

El auxiliar debe ser de la clase que quieres ordenar, xq tmb es un objeto recuerda


Algoritmo Burbuja segun profe
Inicio
  Obj aux
  Para i = 0 hasta n-1
    para j = i+1 hasta n
      Si (datos[i]> datos[j])
        aux = datos[i]
        arreglo[i] = arreglo[j]
        arreglo[j] = aux
    fin para
  fin para
Fin


Para crear un arreglo de objetos
  Tipo Clase[] nombreArreglo
  contador

Y en el constructor:
  nombreArreglo = nuevo Clase[num]
  contador es 0



Algoritmo ingresar
Para ingresar(Clase ref)
  Verificar si hay espacio, conta < al largo del arreglo
    array[conta] es ref
    conta++

El random acuerdate que es .nextInt(mayor-menos+1)+menor

Alg para mover a la derecha
Inicio
  int pos
  para i es n hasta i >= pos y i --
    arreglo[i+1] = arrego[i]
  fin para
  arreglo[pos] = ref
  n++
Fin

n es el contador recuerda, no trabajamos con el maximo absoluto

Y ahora para la prueba
Creas los objetos con 
  NombreClase var = new NombreClase(Constructor)
  Luego debes aplicar sobre el objeto almacenado en la variable las funciones como
  var.GenerarQR()

Algoritmo VerInfo en Gestion con ArregloDeObjetos
Inicio
  cad = ""
  Para i hasta n
    cad = cad + arreglo[i].VerInfo + "\n"
  fin para
  retornar cad
Fin

Algoritmo ingresarObjs en arreglo
ClaseGestion varG = new ClaseGestion();
varG.Ingresar(obj1);

sout(varG.VerInfo())

Porsi a una var a verificar si cambiar v o f, asignale falso por default

Acuerdate del import static paquete.clases.NombreInteraz.Variable;

Herencia es con extends e interfaces con implements

Primero es normalmente el extends luego el implements

Usa el override method para escribir en una funcion hija sobre el metodo que ya le trae su padre como verInfo

Random rand = new Random()

Acuerdate de los getters and setters

Juega con el modulo para hallar cuando no es par con %2 !=

```

## Clases Genéricas

No necesitamos castear en las clases genéricas. Contarmeos ocn un arreglo genérico o clase genérica con sus métodos.

Convención de Parametrizacion

T: Parametro generico, clase de objetos que opera ClaseGenerica

E: tipo de elemento en una lista, cola, etc

N: Numero

```java
public class GenericaClase <T> {

}

```

## Interfaces gráficas y manejo de excepciones

Usaremos el AWT abstract windowing toolkin, es decir de la libreria swing

Trabajaremos con un contenedor o ventan principal donde pondremos los componentes o elementos gráficos

Escribiremos el codigo de los componentes y su apariencia en la interfaz, aplicando atributos a traves d ela presentacion, color, tamaño, etc

Programar los eventos en la interfaz gráfica

Ahora en paquete.ventana le daremos crear nuevo JFrame From

En diseño añadimos los controles, en Source vmeos el códiigo

buttongroup hará que solo podamos marcar 1 de los dos botones

En table con model eliminaremos el contenido y para que nosotros controlemos el table

Entonces necesitas un objeto de la clase model y gestionarlo así

```java

```

jbutotn action o doble click vemos como trabajar con la accion

Necesitamos un arreglo que represente la fila

```java
private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
  // TODO add your handling code here:
    String[] arreglo = new String[4];
  //Necesitas 4 espacios xq tienes 4 elementos, es decir cada espacio, cada columna
  //No necesitas una rreglo bidimensional xq solo estas creando uno a la vez
  arreglo[0] = this.jTextField1.getText();
  arreglo[1] = this.jTextField2.getText();
  //Para capturar un button round, necesitas saber cual esta seleccionado
  if (this.jRadioButton1.isSelected()) {
      arreglo[2] = "Mayor";
  }
  else if(this.jRadioButton2.isSelected()){
      arreglo[2] = "Menor";
  }
  String cad = "";
  if (this.jCheckBox1.isSelected()) {
      arreglo[3] = cad + "Java";
  }
  if(this.jCheckBox2.isSelected()){
      cad = cad + " Python";
  }
  if(this.jCheckBox3.isSelected()){
      cad = cad + " C++";
  }
  arreglo[3] = cad;
  
  //Ahora falta adicionar a table
  modelo.addRow(arreglo);
}           
```
