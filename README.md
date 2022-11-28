# pooUlima

## Concepto de Objeto

Un bjeto tiene un estado, que es el conjunto de atributos o caracteristicas. Los atributos son estaticos, solo cambian los valores. Los atributos son caracteristicas estaticas de un ojeto, solo cambian los valores asignados. La identidad es lo que hace unico al objeto. Aunque normalmente es el nombre del objeto.

Encapsulamiento: Un objeto debe ser considerado como un todo. Solicita, mas no ejecuta. La vista externa es ublica para todos los objetos, pueden ver el retorno de la funcion pero no de su ejecución. La parte privada es propai y no la puede ver otro ente. Los atributos solicitan servicios o metodos a otros objetos. Los metodos o Servicios responden servicios solicitados por otros objetos

La clase es la generalizacion de un conjunto de objetos. La manifestacion de una clase es una instancia. Acoplamiento, es la dependencia de funciones.

Shortcout es psvm : inicia funcion
nomenclatura sout : inicia print
Comentar:

```java
// Siuu
/*

*/
```

```java
int edad, nota, pan;
long edadMayor;
short edadPequeña;
float peso;
// Acepta decimal
double pesoMayor;
// Acepta decimal mas grande
boolean mayorEdad;
char unaLetra;
String nombre;
peso = 100.5f
//Aclaras que es un float

```

```java
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.prueba;

import java.util.Scanner;



/**
 *
 * @author wadia
 */
public class Prueba {
    public static void main(String[] args) {
       System.out.println("Hola Mundo en Java");      
       int edad;
       long edadMayor;
       String nombre;
       float peso;
       edad  = 20;
       edadMayor = edad;
       edad = (int)edadMayor;
       if(edad>20){
           System.out.println("Es cuando es mayor a 20");
           System.out.println("Es la 1era opcion");
       }else if(edad>10 && edad<=20) {
           System.out.println("No es mayor a  20");
           System.out.println("2da opcion");
       }else {
           System.out.println("Es la 3era opcion");
       }
       
       float suma = 0;
       for (int i=2; i<50; i++){
           suma = suma + (1/i);
       }
       System.out.println("La suma es " + suma);
       
       while (edad <=10){
           System.out.println("El valor de edad es: " + edad);
           edad++;
       }
       do{
           System.out.println("El valor de edad es:" + edad);
           edad++;
       }while(edad < 30);
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nota: ");
        int nota = sc.nextInt();
        System.out.println("La nota ingresada es: " + nota);
        System.out.println("Ingrese su peso:");
        peso = sc.nextFloat();
        System.out.println("El peso ingresado es: " + peso);
        System.out.println("Ingrese su nombre: ");
        nombre = sc.next();
        System.out.println("El nombre ingresado es: " + nombre);
        
    }
}

```

```java
public class Prueba {
    public static void main(String[] args) {
       float suma = 0;
       for (int i=2; i<50; i++){
           suma = suma + (1.0f/i);
       }
       System.out.println("La suma es " + suma);
    }
}
```

Un metodo sin especificar retorno se asume que es del tipo void, pero normlamente se hace asi:

El float es tipo de parametro y luego de los dos puntos es el tipo de retorno

```java
+ incrementaPrecio(float)
+ verDatos(): String
+ accesarNumSerie(): String
```

Cardinalidad de relaciones: indica el grado y nivel de dependencia

- Uno a muchos 1..* (1..n)
- Cero a muchos 0..* (0..n)
- Numero fijo n (n: Denota el numero)

Tipos de relacion sacado de platzi:

### Asociación

![alt text](https://static.platzi.com/media/user_upload/associacion-d2e1b691-b6e9-4854-85e2-d3ffdf0a9049.jpg)

Como su nombre lo dice, notarás que cada vez que esté referenciada este tipo de flecha significará que ese elemento contiene al otro en su definición. La flecha apuntará hacia la dependencia.

![alt text](https://static.platzi.com/media/user_upload/uml-relacion-asociacion-99b916c6-1f80-4b61-889a-ebf6e74f4f23.jpg)

Con esto vemos que la ClaseA está asociada y depende de la ClaseB.

### Herencia

![alt text](https://static.platzi.com/media/user_upload/herencia-2eb98d5e-bcad-4162-b236-aa87eba20e76.jpg)

Siempre que veamos este tipo de flecha se estará expresando la herencia.
La dirección de la flecha irá desde el hijo hasta el padre.

![alt text](https://static.platzi.com/media/user_upload/herencia-clases-53cb3117-def7-433f-adc5-4ad183d6b5e7.jpg)

Con esto vemos que la ClaseB hereda de la ClaseA

### Agregación

![alt text](https://static.platzi.com/media/user_upload/agregacion-6489d946-cc06-4e3c-a976-f6435531b4f2.jpg)

Este se parece a la asociación en que un elemento dependerá del otro, pero en este caso será: Un elemento dependerá de muchos otros. Aquí tomamos como referencia la multiplicidad del elemento. Lo que comúnmente conocerías en Bases de Datos como Relaciones uno a muchos.

![alt text](https://static.platzi.com/media/user_upload/uml-relacion-agregacion-adb20be8-d6c2-41d1-b002-2cfa37639240.jpg)

Con esto decimos que la ClaseA contiene varios elementos de la ClaseB. Estos últimos son comúnmente representados con listas o colecciones de datos.

### Composición

![alt text](https://static.platzi.com/media/user_upload/composicion-1da1dd19-6925-42d9-9727-7fd8cb031b0c.jpg)

Este es similar al anterior solo que su relación es totalmente compenetrada de tal modo que conceptualmente una de estas clases no podría vivir si no existiera la otra.

![alt text](https://static.platzi.com/media/user_upload/uml-relacion-composicion-2d4cb1fa-5422-44e3-849b-3a3e2d276733.jpg)

Con esto terminamos nuestro primer módulo. Vamos al siguiente para entender cómo podemos hacer un análisis y utilizar estos elementos para construir nuestro diagrama de clases de Uber.

![alt text](https://www.ionos.es/digitalguide/fileadmin/DigitalGuide/Screenshots_2019/klassendiagramme-uml-ES-9.png)

En la composición, el elemento Tree depende completamente del elemento Leaf, siendo el caso de que si el elemento Leaf desapareciera también lo haría el elemento Tree.

Mientras que en la agregación si el elemento Book desaparece, o se vuelve 0, (esto me imagino que lo explicarán más adelante) el elemento Book Shop no lo haría.

> Continuando con la clase

**Herencia:**

Responde a "es un". Todo lo común se va a la superclase. Para que un atributo se vea en la jerarquia, se vuelva protegida (#)

**Asociacion:**

Es una relación

**Composicion:**

Depende. "Tiene un". Si desaparece el padre, desaparece el hijo. Aclarar "utilicé composición porque..."

**Agregación:**

Ese todo parte no es tan fuerte. Desaparece lo superior pero lo inferior puede seguir exitiendo.

En una misma relacion se puede tener composicion/agregacion

Un almacen tiene una cuente y una cliente. Sin cuenta desaparece o sin almacen desaparece ambos, pero el cliente puede existir independientemente.

app: <https://app.diagrams.net/>

Veamos un llenado por aleatorio

```java
//Para arreglos: 
int[] edad;
edad = new int[10];

//Para usar random
Random randNum = new Random();
edad[i] = randNum.nextInt(22-18+1)+18;

//edad[i] = randNum.nextInt(mayor-menor+1)+menor;


// create instance of Random class
Random rand = new Random();

// Generate random integers in range 0 to 999
int rand_int1 = rand.nextInt(1000);
int rand_int2 = rand.nextInt(1000);

```

Generas constructor con ctrl y .

Trabajando un arreglo de dos dimensiones:

```java
int[][] edad;
edad = new int[3][4];

int[][] edad2 = new int[4][5];
```

Practicar:

- Llenado aleatorio
- Llenado uno por uno

```java
//Para entrada
Scanner sc = new Scanner(System.in);

Random rand = new Random();
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 4; j++) {
        edad[i][j] = rand.nextInt(10-1+1)+1;
    }
}
String cad = "";
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 4; j++) {
        cad = cad + edad[i][j] + "\t";
    }
    System.out.println(cad);
    cad = "";
}
```

Cuando creas el objeto mediante el constructor es cuando dimensionas a los arreglos

En paquete gestion:

```java
private Alumno[] arreglo;
private int conta;

public GestionAlumno() {
    arreglo = new Alumno[10];
    conta = 0;
}
public void Ingresar(Alumno ref){
  if (conta < arreglo.length) {
      arreglo[conta] = ref;
      conta++;
  }
  else {
      System.out.println("No entra");
  }
}
```

En el Prueba:

```java
public static void main(String[] args) {
    Alumno obj1 = new Alumno(37218, "Juan");
    Alumno obj2 = new Alumno(123312, "Pepe");
    Alumno obj3 = new Alumno(23344, "Mario");
    Alumno obj4 = new Alumno(434123, "Lucho");
    
    GestionAlumno objGA = new GestionAlumno();
    objGA.Ingresar(obj1);
    objGA.Ingresar(obj2);
    objGA.Ingresar(obj3);
    objGA.Ingresar(obj4);
    System.out.println(objGA.VerInfo());
}
```

## Clases abstractas

Abstraco es que esta solo su nombramiento pero no la implementacion

Un metodo abstracto solo es declarado, la implementación va dentro de las subclases

Ante un metodo abstracto todas las subclases la deben implementar

La clase abstracta es una clase que no se puede instanciar objetos

Es decir no puedes hacerle new

Un metood abstracto en una clase la vuelve abstracta, pero una clase abstracta puede tener metodos no abstractos

Recierda implementar metodo y de ahi el override

### Clases Genericas

Almacen:

```java
package paquete.clases;

/**
 *
 * @author wadia
 */
public class Almacen <T> {
    //Le decimos que es clase generica, se va a comportar como tal de acuerdo quien lo utilice
    private T contenido;
    //Ese T depende del tipo de clase que le vas a enviar
    public void Asignar(T ref){
        contenido = ref;
    }
    public T Retornar(){
        return contenido;
    }
    
}

```

Almacen2:

```java
package paquete.clases;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author wadia
 */
public class Almacen2 {
    //La desventaja de un arreglo de objs es que hay un limite, si no sabemos la cantidad de objetos o no se puede estimar, entonces estaría dificil trabajar con un arreglo de objetos
    //Podemos trabajr en su lugar una clase genérica de tipo arreglo
    private ArrayList<Coche> arreglo;
    //ArrayList esta en otro paquete como Scanner

    public Almacen2() {
        arreglo = new ArrayList<Coche>();
        //Llamas al constructor de Coche
    }
    //Y contaremos con un método para añadir al arreglo y otro método que se vaya mostrando lo que ya tengo ingresado
    public void Ingresar(Coche ref){
        arreglo.add(ref);
        //Esto es método propio del Coche, lo añadirá automáticamente
    }
    //Un arreglo genérico solo cuneta con los métodos por default, puedes aplicar una herencia de la arrayList, si solamente necesitas trabjar con los métodos por definidos, es mejor arrayList
    //si tienes funciones muy especificas, es mejor arreglo de objetos, puedes añadir todos los métodos que necesitias, un arreglo de objetos es mas personalizable
    public String Mostrar(){
        //Como es un arreglo genérico, necesitas un indicador de los objetos que estan dentro para ir sacandolos uno a uno como conta, aquí tmb es un puntero genérico
        String cad = "";
        //La cadena para concatenar xq no sabes cuantos elementos tienes
        Iterator<Coche> puntero = arreglo.iterator();
        //El puntero es un iterator del arreglo que acabas de mostrar del tipo ArrayList
        //Necesitias un while para saber cuantos objetos has ingresado
        while(puntero.hasNext()){
            //Mientras el puntero encuentre objetos, osea tiene o no tiene elementos el arreglo
            Coche aux = puntero.next();
            //El next saca del arreglo y lo asigna a coche
            cad = cad + aux.VerInfo();
            //saca y verInfo
        }
        return cad;
    }
}

```

Coche:

```java
package paquete.clases;

/**
 *
 * @author wadia
 */
public class Coche {
    private String marca, color;

    public Coche(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String VerInfo() {
        return "marca= " + marca + "\ncolor= " + color;
    }

    
}

```

CocheLujo:

```java
package paquete.clases;

/**
 *
 * @author wadia
 */
public class CocheLujo extends Coche{
    private int motor;

    public CocheLujo(int motor, String marca, String color) {
        super(marca, color);
        this.motor = motor;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    @Override
    public String VerInfo() {
        return super.VerInfo() + "\nmotor= " + motor; 
    }
    
}

```

Prueba:

```java
package paquete.prueba;

import paquete.clases.*;

/**
 *
 * @author wadia
 */
public class Prueba {
    public static void main(String[] args) {
        Coche objC = new Coche("Toyota", "Verde");
        //Tmb tenemos un objeto de ese tipo primitivo. Podriamos crear una clase con todos sus atributos llamando a un objeto de una clase de tipo primitivo.
        //Podriamos tener mas funciones asociadas a ese dato, desventaja es de que siempre se esta creando obj
        //EL dato primitivo es mas rápidoo, solo guardas un dato
        //Crearemos un obj de tipo primitivo
        Double objD = new Double(100.5);
        //Double es una clase asociada a un atributo primitivo, no necesita importarse
        //Es lo mismo que objD = 100.5
        //Y ahora contamos con funciones con las que podriamos trabajar con el objeto de la clase doble
        
        //No puedes crear dorectamente clases genericas, debes decirle antes como quieres que se comporte, su tipo
        Almacen<Coche> objA1 = new Almacen<Coche>();
        //Has creado un objeto de la clase Almacen y que se comporte como Coche
        objA1.Asignar(objC);
        System.out.println(objA1.Retornar().VerInfo());
        
        Almacen<Double> objA2 = new Almacen<Double>();
        objA2.Asignar(objD);
        System.out.println(objA2.Retornar().toString());
        //El toStirng muestra el dato en String
        
        //Almacen A1 se comportó como String y el A2 como Double. Solo le indicas como se debe comportar
        
        //Las reglas de herencia siguen funcionando aquí
        CocheLujo objCL = new CocheLujo(2500, "Honda", "Rojo");
       //El Almacen A1 es del padre Coche, podrías enviarle 
       //objA1.Asignar(objCL);
       //Puedes trabajar con normalidad con un hijo de la superclase con una abstracta
       

        //Almacen<CocheLujo> objA3 = new Almacen<CocheLujo>();
       //objA3.Asignar(objA3);
       //Te va a dar error xq solo puedes trabjar de padres a hijos, no de hijos a padres
       
       //La clase genérica puede participar en la herencia como :
       //public class Almacen <T extends Coche>
       //es una genérica de la jerarquía Coche
       //Entonces no podrias trabjaar ya con Double xq ya no puede comportarse así
       
       
    }
}

```

### Try catch

```java
public class Prueba {
    public static void main(String[] args) {
        //El orden deberia ser de mas detallado al mas general en los catch
        try{
         int[] numeros = new int[5];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        int division = 150/0;
        numeros[5] = 50;
        
        
        System.out.println("El valor de la primera posición es: " + numeros[0]);
        }
        catch(ArrayIndexOutOfBoundsException e1){
            System.out.println("Este es un error del arreglo " + e1.getMessage());
        }
        
        
        catch(Exception error){
            System.out.println("Se presentó un error, lo vamos a trabajar " + error.getMessage());
        }
        System.out.println("Continua el programa");
    }
}

```

Java siempre va a capturar el primer erro, por ejemplo en el caso dea rriba será en el de división

La excepcion siempre se correrá

```java
package paquete.prueba;

/**
 * 
 * @author wadia
 */
public class Prueba {
    public static void main(String[] args) {
        try{
         int[] numeros = new int[5];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        int division = 150/0;
        numeros[5] = 50;
        
        
        System.out.println("El valor de la primera posición es: " + numeros[0]);
        }
        catch(ArrayIndexOutOfBoundsException e1){
            System.out.println("Este es un error del arreglo " + e1.getMessage());
        }
        catch(ArithmeticException e2){
            System.out.println("Erorr aritmetico " + e2.getMessage());
        }
        
        catch(Exception error){
            System.out.println("Se presentó un error, lo vamos a trabajar " + error.getMessage());
        }
        finally{
            System.out.println("Esto se ejecuta si o si");
        }
        
        System.out.println("Continua el programa");
    }
}

```

Creando nuestros propias excepciones:

```java
public class NuevaExcepcion extends Exception{
private int codErr;

public NuevaExcepcion(int codErr) {
this.codErr = codErr;
}

@Override
public String getMessage() {
  String msg = "";
switch(codErr){
  case(111):
    msg = "Este es un error de nivel 1";
    break;
  case(222):
    msg = "Este es un error de nivel 2";
    break;
  case(333):
    msg = "Este es un error de nivel 3";
    break;
}
return msg;
}

}

```

```java
try {
  int valor = 123;
  if(valor>100){
    throw new NuevaExcepcion(111);
  }
}
catch(NuevaExcepcion e1) {
  System.out.println(e1.getMessage());
}
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

### Interfaces gráficas y manejo de excepciones

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