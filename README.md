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

## Interfaces, herencia, clases abstractas y polimofismo
### Interfaces
Contiene métodos abstractos que las clases implementadoras deben definir. Las interfaces pueden contener métodos por defecto con implementación y métodos estáticos.
```java
interface Animal {
    void makeSound();
    void move();
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    @Override
    public void move() {
        System.out.println("Run");
    }

    public class InterfaceExample {
        public static void main(String[] args) {
            Animal dog = new Dog();
            dog.makeSound();  // Output: Woof
            dog.move();       // Output: Run
        }
    }
}
```

### Herencia ('extends')
La herencia permite crear una nueva clase basada en una clase existente. La nueva clase hereda los campos y métodos de la clase base.

```java
    class Animal {
        void eat() {
            System.out.println("Eating...");
        }
    }
    
    class Dog extends Animal {
        void bark() {
            System.out.println("Woof");
        }
    }
    
    public class InheritanceExample {
        public static void main(String[] args) {
            Dog dog = new Dog();
            dog.eat();  // Output: Eating...
            dog.bark(); // Output: Woof
        }
    }
```

### Clases abstractas
Una clase abstracta es similar a una interfaz, pero puede tener métodos con implementaciones completas y también puede contener campos. No se puede instanciar directamente.

```java
    abstract class Animal {
        abstract void makeSound();
    
        void sleep() {
            System.out.println("Sleeping...");
        }
    }
    
    class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Woof");
        }
    }
    
    public class AbstractClassExample {
        public static void main(String[] args) {
            Dog dog = new Dog();
            dog.makeSound();  // Output: Woof
            dog.sleep();      // Output: Sleeping...
        }
    }
```

### Implementación múltiple con interfaces
Una clase en Java puede implementar múltiples interfaces, lo que permite la herencia múltiple en términos de comportamiento.

```java
    interface Animal {
        void makeSound();
    }
    
    interface Movable {
        void move();
    }
    
    class Dog implements Animal, Movable {
        @Override
        public void makeSound() {
            System.out.println("Woof");
        }
    
        @Override
        public void move() {
            System.out.println("Run");
        }
    }
    
    public class MultipleInterfacesExample {
        public static void main(String[] args) {
            Dog dog = new Dog();
            dog.makeSound();  // Output: Woof
            dog.move();       // Output: Run
        }
    }
```

### super Keyword
La palabra clave super se usa para referirse a la clase base inmediata de la clase derivada. Se puede usar para llamar a métodos y constructores de la clase base.
```java
    class Animal {
        void makeSound() {
            System.out.println("Some sound");
        }
    }
    
    class Dog extends Animal {
        @Override
        void makeSound() {
            super.makeSound(); // Llama al método makeSound() de la clase base
            System.out.println("Woof");
        }
    }
    
    public class SuperKeywordExample {
        public static void main(String[] args) {
            Dog dog = new Dog();
            dog.makeSound();  // Output: Some sound \n Woof
        }
    }
```

## Patrones de diseño
### Patrón Singleton
El patrón Singleton asegura que una clase tenga una única instancia y proporciona un punto de acceso global a esta instancia.
```java
    public class Singleton {
        private static Singleton instance;
    
        // Constructor privado para evitar la instanciación directa
        private Singleton() {}
    
        // Método estático para obtener la instancia única
        public static Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }
    
        // Método de prueba para el singleton
        public void showMessage() {
            System.out.println("¡Hola! Soy un singleton.");
        }
    }
    
    // Main class para probar el Singleton
    public class SingletonMain {
        public static void main(String[] args) {
            // Obtener la instancia del Singleton
            Singleton singleton = Singleton.getInstance();
    
            // Llamar a un método de prueba
            singleton.showMessage();
        }
    }
```

### Patrón Factory Method
El patrón Factory Method define una interfaz para crear objetos en una superclase, pero permite a las subclases alterar el tipo de objetos que se crearán.
```java
//FILE1
// Interfaz para los productos (Vehículos)
interface Vehicle {
    void manufacture();
}

// Clases concretas de productos (Automóvil y Motocicleta)
class Car implements Vehicle {
    @Override
    public void manufacture() {
        System.out.println("Fabricando un automóvil");
    }
}

class Motorcycle implements Vehicle {
    @Override
    public void manufacture() {
        System.out.println("Fabricando una motocicleta");
    }
}

//FILE2
// Interfaz para la fábrica de productos (Vehículos)
interface VehicleFactory {
    Vehicle createVehicle();
}

// Fábrica para crear automóviles
class CarFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}

// Fábrica para crear motocicletas
class MotorcycleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Motorcycle();
    }
}

///FILE3
//Ejemplo de uso en main
public class FactoryMethodExample {
    public static void main(String[] args) {
        // Crear una fábrica de automóviles
        VehicleFactory carFactory = new CarFactory();

        // Utilizar la fábrica de automóviles para crear un automóvil
        Vehicle car = carFactory.createVehicle();
        car.manufacture();  // Output: Fabricando un automóvil

        // Crear una fábrica de motocicletas
        VehicleFactory motorcycleFactory = new MotorcycleFactory();

        // Utilizar la fábrica de motocicletas para crear una motocicleta
        Vehicle motorcycle = motorcycleFactory.createVehicle();
        motorcycle.manufacture();  // Output: Fabricando una motocicleta
    }
}
```

### Decorator
El patrón Decorator permite añadir comportamiento a objetos individuales de forma dinámica y flexible, sin afectar a otros objetos de la misma clase.
```java
//FILE1
// Interfaz para la pizza
interface Pizza {
    String getDescription();
    double getCost();
}

// Clase base de la pizza
class PlainPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Pizza";
    }

    @Override
    public double getCost() {
        return 5.0; // Costo base de la pizza
    }
}

//FILE2
// Decorador abstracto
abstract class PizzaDecorator implements Pizza {
    protected Pizza decoratedPizza;

    public PizzaDecorator(Pizza decoratedPizza) {
        this.decoratedPizza = decoratedPizza;
    }

    public String getDescription() {
        return decoratedPizza.getDescription();
    }

    public double getCost() {
        return decoratedPizza.getCost();
    }
}

// Decorador concreto para queso extra
class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", Queso extra";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 1.5; // Costo adicional por queso
    }
}

// Decorador concreto para pepperoni
class PepperoniDecorator extends PizzaDecorator {
    public PepperoniDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", Pepperoni";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 2.0; // Costo adicional por pepperoni
    }
}

//FILE3
public class DecoratorPatternExample {
    public static void main(String[] args) {
        // Crear una pizza básica
        Pizza pizza = new PlainPizza();
        System.out.println("Descripción: " + pizza.getDescription());
        System.out.println("Costo: $" + pizza.getCost());

        // Decorar la pizza con queso extra
        pizza = new CheeseDecorator(pizza);
        System.out.println("Descripción: " + pizza.getDescription());
        System.out.println("Costo: $" + pizza.getCost());

        // Decorar la pizza con pepperoni además del queso extra
        pizza = new PepperoniDecorator(pizza);
        System.out.println("Descripción: " + pizza.getDescription());
        System.out.println("Costo: $" + pizza.getCost());
    }
}
```

Mas información:
https://www.geeksforgeeks.org/java-developer-learning-path-a-complete-roadmap/