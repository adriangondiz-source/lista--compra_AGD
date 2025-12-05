Memoria Técnica – GestorListaCompra
1. Relación entre programa Java, RAM, procesador y periféricos

Cuando ejecutamos nuestro programa GestorListaCompra.java pasa esto:

Código fuente: es el .java que escribimos y que podemos leer y modificar.

Bytecode: al compilarlo con javac, se crea el .class que entiende la JVM.

Memoria RAM: aquí se guardan las variables del programa mientras se ejecuta, como el array lista y la variable contador.

Procesador: la CPU ejecuta las instrucciones del bytecode a través de la JVM.

Periféricos: el teclado se usa para introducir datos (Scanner) y la pantalla muestra la información (System.out.println()).

2. Diferencia entre código fuente, objeto y ejecutable
Concepto	Qué es en nuestro proyecto
Código fuente	GestorListaCompra.java y GestorListaCompraTest.java
Objeto / Bytecode	GestorListaCompra.class, generado al compilar
Ejecutable	Archivo .jar que se puede ejecutar con java -jar GestorListaCompra.jar

En resumen: escribimos el código, lo compilamos a bytecode y luego podemos generar un ejecutable para usarlo sin necesidad de abrir Eclipse.

3. Funcionalidad de Eclipse como IDE

Eclipse nos ha ayudado en varias cosas:

Organiza el proyecto en carpetas /src, /test y facilita añadir librerías.

Compila automáticamente y avisa de errores de sintaxis.

Permite ejecutar y depurar el programa paso a paso.

Aunque hemos usado Git en terminal, Eclipse también facilita hacer commits y merges.

En cuanto al flujo de trabajo, seguimos un método parecido a Kanban: cada funcionalidad se desarrolla en su propia rama (feature/*) y luego se integra en develop. Esto nos permitió ir avanzando paso a paso, probar y corregir errores antes de pasar todo a main.

4. Generar ejecutables

Desde Eclipse: File → Export → Runnable JAR file → Seleccionar proyecto → Guardar. Luego se ejecuta con:

java -jar GestorListaCompra.jar


Desde terminal:

javac -d bin src/gestion/*.java
jar cvfe GestorListaCompra.jar gestion.GestorListaCompra -C bin .
java -jar GestorListaCompra.jar


Desde otros IDEs (por ejemplo IntelliJ): Build → Artifacts → Build JAR → ejecutar con java -jar.

5. Conclusión

El programa GestorListaCompra usa la memoria RAM, el procesador y los periféricos de manera eficiente para gestionar la lista de compras.
El flujo de trabajo con Git y ramas por funcionalidad nos permitió desarrollar siguiendo un método ágil, haciendo commits frecuentes y probando cada parte antes de integrarla.
Eclipse nos ha facilitado la organización del proyecto, la compilación y la depuración, aunque el control de versiones lo hicimos en terminal, como en proyectos reales.