# Resumen

## Para ev 3

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
    para j = i+1 hasta n con j++
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

## Para ev4

```md
Ok, aqui va!

Acordate de graficar bien el UMl, para e larraylist es supervisores: Supervisor[] <ArrayList> 

La interfaz lo pones con <int>

Los metodos abstractos los pones con <abs>

Y acordate bien el tipo de variables, si es float o int, LA HERENCIA ES CON PROTECTED

Tambine acuerdate del metodo abstracto en la clase padre con public abstract void NombreMetodo();
Esto hará a toda la clase abstract

extends Padre implements Interfaz

Los floats son 0.05f

El random es:
Random rand = new Random();
this.variable = rand.nextInt(mayor-menor+1)+menor;

Acuerdate de poner el random afuera de los ciclos if, osea antes, la asignacion del next int va dentro de los if

El arrayList, dentro de la clase como atributo es private Arraylist<nombreClaseArreglo> arreglo;

El nombre de la clase dentro de los <> debe ser del tipo de objeto que será el arrayList

El arrayList se inicializará en el constructor como ():
arreglo = new ArrayList<nombreClaseArreglo>();

Agregar la sabes , es el metodo Agregar(Clase ref); arreglo.add(ref)

Para mostrar la cosa cambia, vas a necesitar del Iterator

Lo usarás de esta forma:
Iterator<NombreClaseDelArrayList> puntero = arreglo.iterator()

luego usarás un while inmediatamente evaluando puntero.hasNext()
Adentro pondrás:
Supervisor aux = puntero.next();

Y mostrarás inmediatemnte (todavia dentro del while) un alert con:
JOptionPane.showMessageDialog(null, "Mensaje" o aux.VerInfo())

Ahi acaba el while

Acuerdate del equalsIgnoreCase para comparar strings

En la interfaz acuerdate de los metodos solo ser: void NombreMetodo();

Las variables en las interfaces pones su tipo y su nombnre y lo asignas tipo: double VALOR_MAXIMO = 100;
Y nada mas 

Ahora toca gestion, agarrate
En gestion inicializas con private, el arreglo y conta, el arreglo será private TipoDeObjArreglo[] arreglo, y el conta solo será un int

Pero aguantaa, ahora en el constructor inicializas el arreglo de objetos con arreglo = new TipoDeObjArreglo[numMax]; conta = 0;
Osea asignamos el numero maximo de elementos del arreglo de objetos y asignamos conta a 0;

Ahora toca Ingresar
Mira causa, si te piden try/catch aqui, asi es la jugada, imagina ingresar:

Funcion Ingresar(Clase ref)
  Try
    //Puedes verificar si hay espacio, mas arriba esta el algoritmo, pero recemos que sea opcional
    Si ref instanceof ClaseAComparar
      arreglo[conta] es ref
      conta++;
    Sino
      JOptionPane.showMessageDialog(null, "Bug, algo salio mal")
  Catch(Exception error)
    JOptionPane.showMessageDialog(null, "Error papito")
Fin Ingrsar

Pudes poner multiples catch, normalmnete si el arreglo se excede, pones IndexOutOfBoundsException, o sino por defecto pon Exception, pero el mas especifico arriba del mas general, ahora las variables que van en el catch como ex o error, no se pueden repetir, asi que nombres distintos por favor

El ordenar esta mas arriba

El eliminar bueno, casi nos sorprende el anteriro examen, mira ahora

Funcion Eliminar(segun que, int numero o String variable idk)
  Para i = 0 hasta i < conta , i++
    Si arreglo[i] coincide con Numero o Variable
      Para j = i, j < conta -1, j++
        arreglo[j] = arreglo[j+1];
      Fin Para
      arreglo[conta-1] = nulo
      conta--
    Fin si
  Fin para
Fin Eliminar

Acordate que nulo es null

Ahora que no te sorprenda que vengau n Inggresar de acuerdo a posicion, la jugada es: 

Funcion IngresarPos(variablePos, ref)
  Si conta < arreglo.length
    Si pos < conta
      Para i = conta -1 hasta i >= pos, con i--
        arreglo[i+1] = arreglo[i]
      Fin Para
      arreglo[variablePos] = ref
      conta++
    Sino
      Alerta con JOptionPane de que la pos no es autorizada
  Sino
    Alerta con JOptionPane de que no hay espacio
Fin IngresarPos


AHORA VIENE LA PARTE MAS YUCA DE TODAS, LA VENTANA, DE ESTO DEPENDE TU EXAMEN CSM, ASI QUE VAMOS A DARLE

Ya mira, manya la jugada en ventana

ACUERDATE DE ANTES ELIMINAR LO QUE VIENE EN LA TABLA POR DEFECTO EN TABLE CONTENTS

Declaras los atributos modelo y gestionTipo (osea de que queres gestionar), el primero es privado del tipo DefaultTableModel y el segundo es del tipo Gestion (por la clase Gestion)

Ahora el **constructor** loco, ya contarás con el initComponents(); asegurate que esté

De ahi iniciarás el modelo de DegaultTableModel() con: modelo = new DefaultTableModel();

Ahora ya cuentas con el modelo, asi que encargate ahora de añadir las columnas de acuerdo al numero que necesites, podes hacerlo 5 u 8 veces o cuanto necesites, pero cada columna lo harás de la sgte manera: modelo.addColumn("Nombre Columna");

Acuerdate que hasta aqui **seguimos en el contructor**, luego con this,JTable1.setModel(modelo); asignarás el modelo de tablas que elaboramos en el panel

siguiendo en el constructor con el modelo ya listo, iniciaremos gestion, la variable que creamos anteriormente en la clase, ahora la inicializaremos con nombreGestion = new  Gestion();

Ya acabamos el constructor, yey, ahora con el panel fijate bien el group con buttonGroup

AHORA CON EL BOTON CARGAR, AQUI VAMOS
Le darás click al boton en la ventnaa, te llevará a la funcion donde trabajar

Obtendras los datos de los TextFields con this.jTextField1.getText();

Ahora causa, como sabes, obtendras texto simepre, será STRING, pero a veces lo vas a querer transformar en int o float, lo harás con: Integer.parseInt(codigo de arriba del textfield);
Con float cambias dinde diga Integer e Int por Float

Acuerdate que si fuera al reves y quisieras de int o lo que sea a String lo harás con un: String.valueOf(codigo a pasar con un getter);

Ahoraa, que pasa con los bototnes redondos a verificar si uno es seleccionado?
Aqui va hijo:
Si jRadioButton1.isSelected()
  Clase var = new Clase(constructor variables bla, bla, bla);
  var.MetodosAEjecutar();
  gestionVariable.Ingresar(var)
Fin si
Poblar()

El metodo Poblar viene en un rato

Si te piden ordenar solo llama a gestionVar.Ordenar(); Poblar(); y listo

Con eliminar será lo mismo, gestionVar.Eliminar(Transformar a int o lo que sea la respuesta del textField); Poblar(); listo


Ahora la funcion Poblar, que se encargará de llenar los datos
Funcion Poblar()
  filas es modelo.getRowCount();
  Para i = 0 hasta i < filas, i++
    modelo.removeRow(0)
  Fin Para
  //Ahora inicia lo bravo
  String[] datos = new String[numero de Columnas];
  Objeto[] tipoDeObjetos = gestion.getArreglo()
  //Por ejm Alumno y alumnos 
  Para i = 0 hasta i < gestion.Conta
    //Ahora llenaras los datos del arreglo con
    datos[0] = tipoDeObjetos[i].getAlgo();
    datos[1...(Y asi harás con el resto de elmentos del array)] = "Algo"
    
    modelo.addRow(datos)
  Fin Para
Fin Poblar()

Acuerdate de tmb transformarlo a String cuando sea necesario, tmb de usar el instanceof

Puede que algun momento tengas que usar un metodo de algun hijo como un getter, pero el arreglo datos es del padre, encontes usarás un aux dentro del if del instanceof:

datos[3] = "Bla"
Clase aux = (Clase)datos[i]
datos[9] = String.valueof(aux.GetAlgo());

```
## ev4.1

Ok, aqui va!

Acordate de graficar bien el UMl, para e larraylist es supervisores: Supervisor[] <ArrayList> 

La interfaz lo pones con <int>

Los metodos abstractos los pones con <abs>

Y acordate bien el tipo de variables, si es float o int, LA HERENCIA ES CON PROTECTED

Tambine acuerdate del metodo abstracto en la clase padre con public abstract void NombreMetodo();
Esto hará a toda la clase abstract

extends Padre implements Interfaz

Los floats son 0.05f

El random es:
Random rand = new Random();
this.variable = rand.nextInt(mayor-menor+1)+menor;

Acuerdate de poner el random afuera de los ciclos if, osea antes, la asignacion del next int va dentro de los if

El arrayList, dentro de la clase como atributo es private Arraylist<nombreClaseArreglo> arreglo;

El nombre de la clase dentro de los <> debe ser del tipo de objeto que será el arrayList

El arrayList se inicializará en el constructor como ():
arreglo = new ArrayList<nombreClaseArreglo>();

Agregar la sabes , es el metodo Agregar(Clase ref); arreglo.add(ref)

Para mostrar la cosa cambia, vas a necesitar del Iterator

Lo usarás de esta forma:
Iterator<NombreClaseDelArrayList> puntero = arreglo.iterator()

luego usarás un while inmediatamente evaluando puntero.hasNext()
Adentro pondrás:
Supervisor aux = puntero.next();

Y mostrarás inmediatemnte (todavia dentro del while) un alert con:
JOptionPane.showMessageDialog(null, "Mensaje" o aux.VerInfo())

Ahi acaba el while

Acuerdate del equalsIgnoreCase para comparar strings

En la interfaz acuerdate de los metodos solo ser: void NombreMetodo();

Las variables en las interfaces pones su tipo y su nombnre y lo asignas tipo: double VALOR_MAXIMO = 100;
Y nada mas 

Ahora toca gestion, agarrate
En gestion inicializas con private, el arreglo y conta, el arreglo será private TipoDeObjArreglo[] arreglo, y el conta solo será un int

Pero aguantaa, ahora en el constructor inicializas el arreglo de objetos con arreglo = new TipoDeObjArreglo[numMax]; conta = 0;
Osea asignamos el numero maximo de elementos del arreglo de objetos y asignamos conta a 0;

Ahora toca Ingresar
Mira causa, si te piden try/catch aqui, asi es la jugada, imagina ingresar:

Funcion Ingresar(Clase ref)
  Try
    //Puedes verificar si hay espacio, mas arriba esta el algoritmo, pero recemos que sea opcional
    Si ref instanceof ClaseAComparar
      arreglo[conta] es ref
      conta++;
    Sino
      JOptionPane.showMessageDialog(null, "Bug, algo salio mal")
  Catch(Exception error)
    JOptionPane.showMessageDialog(null, "Error papito")
Fin Ingrsar

Pudes poner multiples catch, normalmnete si el arreglo se excede, pones IndexOutOfBoundsException, o sino por defecto pon Exception, pero el mas especifico arriba del mas general, ahora las variables que van en el catch como ex o error, no se pueden repetir, asi que nombres distintos por favor

El ordenar esta mas arriba

El eliminar bueno, casi nos sorprende el anteriro examen, mira ahora

Funcion Eliminar(segun que, int numero o String variable idk)
  Para i = 0 hasta i < conta , i++
    Si arreglo[i] coincide con Numero o Variable
      Para j = i, j < conta -1, j++
        arreglo[j] = arreglo[j+1];
      Fin Para
      arreglo[conta-1] = nulo
      conta--
    Fin si
  Fin para
Fin Eliminar

Acordate que nulo es null

Ahora que no te sorprenda que vengau n Inggresar de acuerdo a posicion, la jugada es: 

Funcion IngresarPos(variablePos, ref)
  Si conta < arreglo.length
    Si pos < conta
      Para i = conta -1 hasta i >= pos, con i--
        arreglo[i+1] = arreglo[i]
      Fin Para
      arreglo[variablePos] = ref
      conta++
    Sino
      Alerta con JOptionPane de que la pos no es autorizada
  Sino
    Alerta con JOptionPane de que no hay espacio
Fin IngresarPos


AHORA VIENE LA PARTE MAS YUCA DE TODAS, LA VENTANA, DE ESTO DEPENDE TU EXAMEN CSM, ASI QUE VAMOS A DARLE

Ya mira, manya la jugada en ventana

ACUERDATE DE ANTES ELIMINAR LO QUE VIENE EN LA TABLA POR DEFECTO EN TABLE CONTENTS

Declaras los atributos modelo y gestionTipo (osea de que queres gestionar), el primero es privado del tipo DefaultTableModel y el segundo es del tipo Gestion (por la clase Gestion)

Ahora el **constructor** loco, ya contarás con el initComponents(); asegurate que esté

De ahi iniciarás el modelo de DegaultTableModel() con: modelo = new DefaultTableModel();

Ahora ya cuentas con el modelo, asi que encargate ahora de añadir las columnas de acuerdo al numero que necesites, podes hacerlo 5 u 8 veces o cuanto necesites, pero cada columna lo harás de la sgte manera: modelo.addColumn("Nombre Columna");

Acuerdate que hasta aqui **seguimos en el contructor**, luego con this,JTable1.setModel(modelo); asignarás el modelo de tablas que elaboramos en el panel

siguiendo en el constructor con el modelo ya listo, iniciaremos gestion, la variable que creamos anteriormente en la clase, ahora la inicializaremos con nombreGestion = new  Gestion();

Ya acabamos el constructor, yey, ahora con el panel fijate bien el group con buttonGroup

AHORA CON EL BOTON CARGAR, AQUI VAMOS
Le darás click al boton en la ventnaa, te llevará a la funcion donde trabajar

Obtendras los datos de los TextFields con this.jTextField1.getText();

Ahora causa, como sabes, obtendras texto simepre, será STRING, pero a veces lo vas a querer transformar en int o float, lo harás con: Integer.parseInt(codigo de arriba del textfield);
Con float cambias dinde diga Integer e Int por Float

Acuerdate que si fuera al reves y quisieras de int o lo que sea a String lo harás con un: String.valueOf(codigo a pasar con un getter);

Ahoraa, que pasa con los bototnes redondos a verificar si uno es seleccionado?
Aqui va hijo:
Si jRadioButton1.isSelected()
  Clase var = new Clase(constructor variables bla, bla, bla);
  var.MetodosAEjecutar();
  gestionVariable.Ingresar(var)
Fin si
Poblar()

El metodo Poblar viene en un rato

Si te piden ordenar solo llama a gestionVar.Ordenar(); Poblar(); y listo

Con eliminar será lo mismo, gestionVar.Eliminar(Transformar a int o lo que sea la respuesta del textField); Poblar(); listo


Ahora la funcion Poblar, que se encargará de llenar los datos
Funcion Poblar()
  filas es modelo.getRowCount();
  Para i = 0 hasta i < filas, i++
    modelo.removeRow(0)
  Fin Para
  //Ahora inicia lo bravo
  String[] datos = new String[numero de Columnas];
  Objeto[] tipoDeObjetos = gestion.getArreglo()
  //Por ejm Alumno y alumnos 
  Para i = 0 hasta i < gestion.Conta
    //Ahora llenaras los datos del arreglo con
    datos[0] = tipoDeObjetos[i].getAlgo();
    datos[1...(Y asi harás con el resto de elmentos del array)] = "Algo"
    
    modelo.addRow(datos)
  Fin Para
Fin Poblar()

Acuerdate de tmb transformarlo a String cuando sea necesario, tmb de usar el instanceof

Puede que algun momento tengas que usar un metodo de algun hijo como un getter, pero el arreglo datos es del padre, encontes usarás un aux dentro del if del instanceof:

datos[3] = "Bla"
Clase aux = (Clase)datos[i]
datos[9] = String.valueof(aux.GetAlgo());

<https://youtube.com/shorts/DsUr9-lMPSk?feature=share>
