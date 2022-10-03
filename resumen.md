# Resumen

```java
//Declaras variables en objeto con:
private int[][] matriz;
private int[] totalXAlmacen, totalXTipoProd;
//Pero los inicializas en el constructor (vacio) con: 
matriz = new int[20][15];
totalXAlmacen = new int[20];
totalXTipoProd = new int[15];

//Capturas datos con scanner
Scanner sc = new Scanner(System.in);
nombresJug[i] = sc.next();

//Datos con random:
Random rand = new Random();
pesosJug[i] = rand.nextInt(mayor-menor+1)+menor;

//Reasignas valores en variables del objeto con this
this.cantTipoProd = sc.nextInt();
public void setNombresJug(String[] nombresJug) {
  this.nombresJug = nombresJug;
}

//En los for erecuerda jugar coni  y j para la matriz:
for (int i = 0; i < this.cantAlm; i++) {
  for (int j = 0; j < this.cantTipoProd; j++) {
      aux = aux + matriz[i][j];
  }
  this.totalXAlmacen[i] = aux;
  aux = 0;
}
for (int i = 0; i < this.cantTipoProd; i++) {
  for (int j = 0; j < this.cantAlm; j++) {
      aux = aux + matriz[j][i];
  }
  this.totalXTipoProd[i] = aux;
}

aux = aux + matriz[i][j]; //Para recorrer mas rapido hacia la derecha (horizontal)
aux = aux + matriz[j][i]; //Para recorrer mas rapido hacia abajo (verticalmente)

//Para ver info recuerda crear un String cad = "" para que se te haga mas facil imprimir una matriz
cad = cad + matriz[i][j] + "\t" //t es tab recuerds

//Creas nuevos objetos con:
NombreClase obj1 = new NombreClase();

//Arreglo de objetos
NombreClase[] NombreArreglo;
NombreClase[] nombreArreglo = new NombreClase[tamaño];

//los valores por default serán null
//los contadores te ayudaran recorrdio, posicion y cuantos objetos tienes en el arreglo
//para el gestor de objetos
private NombreClase[] nombreAtributo;

//los meteras con una funcion en la clase de gestion
cad = cad + arreglo[i].VerInfo()
//Como el arreglo es un obj, puedes usar sus funciones

//el truco esta en tener paquete.clases, .gestion, .prueba
//en gestion solo lo metes al arreglo
```
