# Java Practice
## Primitive Data Types:
#### byte: 
The byte data type is an 8-bit signed two's complement integer. 
It has a minimum value of -128 and a maximum value of 127 (inclusive). 
The byte data type can be useful for saving memory in large arrays, where the memory savings actually matters.

#### short: 
The short data type is a 16-bit signed two's complement integer. 
It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive).

#### int: 
By default, the int data type is a 32-bit signed two's complement integer, which has a minimum value of -231 and a maximum value of 231-1. 
In Java SE 8 and later, you can use the int data type to represent an unsigned 32-bit integer, 
which has a minimum value of 0 and a maximum value of 232-1.

#### long: 
The long data type is a 64-bit two's complement integer. The signed long has a minimum value of -263 and a maximum value of 263-1.

#### float: 
The float data type is a single-precision 32-bit IEEE 754 floating point. 
Its range of values is beyond the scope of this discussion, but is specified in the Floating-Point Types, Formats, and 
Values section of the Java Language Specification.

#### double: 
The double data type is a double-precision 64-bit IEEE 754 floating point. Its range of values is beyond the scope of this discussion, 
but is specified in the Floating-Point Types, Formats, and Values section of the Java Language Specification. 
For decimal values, this data type is generally the default choice.

#### boolean: 
The boolean data type has only two possible values: true and false.

#### char: 
The char data type is a single 16-bit Unicode character. It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff'.

## Arithmetic Operations:
- *,/,%
- +,-
- ++, --
- +=, -=
- *=, /=

## Comparative Operations:
- < <= > >= == !=

## String operations:
- toUpperCase()
- toLowerCase()
- substring(index, index)
- isEmpty()
- isBlank()
- trim()

## Create Objects
- Object objectName = new Object();

## Objects vs Primitive
Primitives are saved on the stack memory.
Objects are created on runtime, saved on the Heap, having a reference on the Stack memory.

## Arrays
```java
    int[] numbers = new int[30];
    numbers[0] = 10;
    Arrays.toString(numbers);
    Arrays.fill(number, -1);
    
    int[] numbers = {1,2,3,4};
```
Default values for primitive values is 0
Default values for objects are null


## Switch Statement
```java
switch (day) {
    case 1:
        dayName = "Lunes";
        break;
    case 2:
        dayName = "Martes";
        break;
    default:
        dayName = "Día inválido";
        break;
}
```

## While statement
```java
    while (count < 5) {
        System.out.println("Contador: " + count);
        count++;
    }
```

## Input/Output

### Ejemplo usando scanner
```java
    import java.util.Scanner;
    Scanner scanner = new Scanner(System.in);
    
    // Leer una cadena
    System.out.print("Introduce tu nombre: ");
    String nombre = scanner.nextLine();
    System.out.println("Hola, " + nombre);
    
    // Leer un entero
    System.out.print("Introduce tu edad: ");
    int edad = scanner.nextInt();
    System.out.println("Tienes " + edad + " años.");
    
    // Leer un número de punto flotante
    System.out.print("Introduce tu altura en metros: ");
    double altura = scanner.nextDouble();
    System.out.println("Mides " + altura + " metros.");
    
    // Cerrar el scanner
    scanner.close();
```

### Ejemplo formateando salida estandar
```java
    // Formatear la salida
    int a = 10;
    double b = 3.14;
    String c = "Java";
    System.out.printf("Entero: %d, Decimal: %.2f, Cadena: %s%n", a, b, c);
```

### Ejemplo usando input estandar
```java
    System.out.print("Introduce tu nombre: ");
    String nombre = reader.readLine();
    System.out.println("Hola, " + nombre);
```


## Parsers
```java
    String str = "123";
    int number = Integer.parseInt(str);
    
    String str = "123456789";
    long number = Long.parseLong(str);
    
    String str = "123.45";
    float number = Float.parseFloat(str);
    
    String str = "123.456";
    double number = Double.parseDouble(str);
    
    String str = "true";
    boolean value = Boolean.parseBoolean(str);
    
    String str = "A";
    char ch = str.charAt(0);
```

## public/private/static
1. **public:** Permite acceso desde cualquier clase.
2. **private:** Permite acceso solo desde la misma clase.
3. **static:** Asocia un miembro a la clase en lugar de a instancias específicas. Los métodos y variables estáticas pueden ser accedidos sin crear instancias de la clase.

## Estructuras de datos
### List
Una List es una colección ordenada que permite elementos duplicados.
```java
    import java.util.ArrayList;
    import java.util.List;
    
    public class ArrayListExample {
    public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("Elemento 1");
    list.add("Elemento 2");
    list.add("Elemento 3");
    
            for (String element : list) {
                System.out.println(element);
            }
        }
    }
```

### Map (HashMap)
Un Map es una colección de pares clave-valor. HashMap es una implementación simple y eficiente para inserciones y búsquedas.
```java
    import java.util.HashMap;
    import java.util.Map;
    
    public class HashMapExample {
    public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();
    map.put("Uno", 1);
    map.put("Dos", 2);
    map.put("Tres", 3);
    
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
```

### Set (HashSet)
Un Set es una colección que no permite elementos duplicados. HashSet es una implementación simple y eficiente para operaciones de inserción y búsqueda.
```java
    import java.util.HashSet;
    import java.util.Set;
    
    public class HashSetExample {
    public static void main(String[] args) {
    Set<String> set = new HashSet<>();
    set.add("Elemento 1");
    set.add("Elemento 2");
    set.add("Elemento 3");
    set.add("Elemento 1"); // No se añadirá porque ya está en el conjunto
    
            for (String element : set) {
                System.out.println(element);
            }
        }
    }
```

### Queue (LinkedList)
Una Queue es una colección diseñada para mantener elementos antes de procesarlos. LinkedList es una implementación simple que puede ser usada como una cola.
```java
    import java.util.LinkedList;
    import java.util.Queue;
    
    public class QueueExample {
    public static void main(String[] args) {
    Queue<String> queue = new LinkedList<>();
    queue.add("Elemento 1");
    queue.add("Elemento 2");
    queue.add("Elemento 3");
    
            System.out.println("Elemento en la cabeza: " + queue.peek()); // Ver el elemento en la cabeza
    
            while (!queue.isEmpty()) {
                System.out.println("Eliminando: " + queue.poll()); // Eliminar el elemento en la cabeza
            }
        }
    }
```

### Stack (Stack)
Una Stack es una colección que sigue el principio LIFO (Last In, First Out). Stack es una implementación simple.
```java
    import java.util.Stack;
    
    public class StackExample {
    public static void main(String[] args) {
    Stack<String> stack = new Stack<>();
    stack.push("Elemento 1");
    stack.push("Elemento 2");
    stack.push("Elemento 3");
    
            while (!stack.isEmpty()) {
                System.out.println("Eliminando: " + stack.pop()); // Los elementos se eliminan en orden inverso al que fueron añadidos
            }
        }
    }
```


Review:
Interfaces
Extends
Base Class
List/Maps
Patrones de diseno

https://www.geeksforgeeks.org/java-developer-learning-path-a-complete-roadmap/