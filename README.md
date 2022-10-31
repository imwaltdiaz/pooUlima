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
