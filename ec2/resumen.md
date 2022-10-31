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
