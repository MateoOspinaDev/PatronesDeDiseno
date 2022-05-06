# Patrones de diseño
El único objetivo de este repositorio es ser una herramienta de estudio y de trabajo propia en la cual se va a ir agregando la definicion y ejemplo de los patrones de diseño más usados en el mundo del desarrollo. 

Al ser los patrones de diseño una plantilla o una forma de resolver problemas con caracteristicas en común, y no  un trozo de codigo que copiamos y pegamos para resolver nuestra dificultad, los ejemplos no se extenderán más allá de lo necesario para comprender su concepto y forma de uso.

## Patrones creacionales
#### Factory
"Define un método que debe utilizarse para crear objetos, en lugar de una llamada directa al constructor (operador new). Las subclases pueden sobrescribir este método para cambiar las clases de los objetos que se crearán" (Refactoring Guru).
También, describe un enfoque de programación que sirve para crear objetos sin tener que especificar su clase exacta. Esto quiere decir que el objeto creado puede intercambiarse con flexibilidad y facilidad.
Es útil cuando los objetos concretos que se crean o se van a crear se desconocen o no se definen con antelación.
##### Su forma de operar es básicamente:
- Creacion de una interfaz que declare los métodos que tienen en común las clases necesarias
- Creación de las clases que implementen los metodos de l interfaz dependiendo sus caracteristicas.
- Creación de una "fábrica" para generar objetos de clase concreta en función de la información dada.
- Usar la fabrica para generar objetos dependiento la información dada.


#### Abstract Factory
#### Singleton
Su objetivo es que solo exista una instancia de una clase especifica y que tenga un acceso global desde el resto de la aplicación. En este sentido es útil cuando queremos o necesitamos cumplir con esas dos condiciones.
Para que un patrón de diseño sea declarado singleton deberá cumplir con las condicines anteriores, de lo contrario no lo será. En este es útil aclarar que existe una controversia respecto a si es necesario usar singletons y si uso es una buena practica, ya que la creacion de estos trae desventajas como vulnerar los principios SOLID, problemas para ser testeado, etc. 
##### Se crea de la siguiente forma :
- Crear la case que queremos que cumpla con tales caracteristicas.
- Volver privado su método constructo para que no puede ser instanciada desde fuera de si misma
- Crear un metodo estático que sea el encargado de crear la unica instancia que tendrá la clase, su lógica deberá crear una instancia si no ha sido creada y de lo contrario devolver la instancia ya creada.

## Patrones comportamentales
#### Strategy

## Patrones estructurales
#### Composite
#### Decorator
