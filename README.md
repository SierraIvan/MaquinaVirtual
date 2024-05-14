# MaquinaVirtual

Descripción:

Este proyecto consiste en la implementación de una versión básica de una máquina virtual en Java, como ejercicio introductorio a la orientación a objetos y al lenguaje Java. La máquina virtual simula un entorno donde se pueden ejecutar programas mediante una serie de comandos introducidos por el usuario. Estos programas están compuestos por una lista de instrucciones bytecode y pueden interactuar con una memoria y una pila de operandos.

Funcionalidades:

Ayuda (HELP): Muestra información sobre los distintos comandos disponibles.
Salir (QUIT): Cierra la aplicación.
Nueva Instrucción (NEWINST BC): Introduce una instrucción bytecode al programa actual.
Ejecutar Programa (RUN): Ejecuta el programa actual.
Reiniciar Programa (RESET): Inicializa el programa actual eliminando todas las instrucciones almacenadas.
Reemplazar Instrucción (REPLACE N): Reemplaza la instrucción bytecode número N del programa.

Instrucciones Bytecode admitidas:

PUSH n: Apila en la pila de operandos el entero n.
LOAD pos: Lee de la memoria el valor almacenado en pos y lo apila en la pila de operandos.
STORE pos: Escribe en la posición pos de la memoria el contenido de la cima de la pila de operandos, y lo elimina de ella.
ADD, SUB, MUL, DIV: Operaciones aritméticas de suma, resta, multiplicación y división.
OUT: Escribe el entero almacenado en la cima de la pila.
HALT: Detiene la ejecución de la máquina.

Ejemplos de Ejecución:

El proyecto incluye ejemplos de ejecución que ilustran el funcionamiento de la máquina virtual, así como casos de error y su manejo.

Implementación:

El proyecto se implementa mediante diversas clases:

Engine: Representa el bucle de control de la aplicación.
Command: Representa los distintos comandos que puede utilizar un usuario.
CommandParser: Parsea los comandos introducidos por el usuario.
ByteCodeProgram: Representa el programa actual.
Memory: Representa la memoria de la máquina.
OperandStack: Implementa la pila de operandos.
ByteCode: Implementa las distintas instrucciones bytecode.
CPU: Es la unidad de procesamiento de la máquina virtual.
ByteCodeParser: Parsea los bytecodes introducidos por el usuario.
Main: Clase principal que contiene el método main de la aplicación.

Instrucciones para Ejecutar:

Para ejecutar la aplicación, simplemente compila el código Java y ejecuta la clase Main.
Este proyecto proporciona una introducción práctica a los conceptos básicos de la programación orientada a objetos y al lenguaje Java, a través de la implementación de una máquina virtual simple pero funcional.
