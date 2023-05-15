# # indice

  - [1. EJERCICIO BASE](#1-EJERCICIO-BASE)
  - [2. HISTORIA DE USUARIO](#2-HISTORIA-DE-USUARIO)
  - [3. CASO DE USO](#3-CASO-DE-USO)
  - [4. DIAGRAMA DE FLUJO](#4-DIAGRAMA-DE-FLUJO)
  - [5. Pseudocódigo](#5-Pseudocódigo)


<br>
<br>
<br>
<br>
<br>
<br>

# 1.EJERCICIO BASE


Una editorial necesita un programa para llevar una logistica de los libros que se van vendiendo a las diferentes distribuidoras o usuarios individuales teniendo en cuenta que siempre el inventario esta con 100 unidades de cada referencia arrojar factura con cantidad que quedaria en el inventario.
para la logistica de la facturaciòn se tendra que mostra que descuento tendra el cliente teniendo los siguientes parametros:

Si es mayorista (distribuidora) entonces:
*Si la compra es mayor a 20 libros tendra un 30% de descuento.
*Si la compra es mayor a 30 libros tendra un 40% de descuento.

De lo contrario no tendria ningun descuento en la compra que realice la distribuidora, si es usuario individual se aplicaria:

*Si la compra es mayor a 5 libros tendra un 5% de descuento.
*Si la compra es mayor a 15 libros tendra un 15% de descuento.


<br>
<br>
<br>
<br>

## 2.HISTORIA DE USUARIO


![Historia de usuario](HISTORIAL_usuario.PNG)

![Historia de usuario](HISTORIAL_usuario2.PNG)

![Historia de usuario](HISTORIAL_usuario3.PNG)

<br>
<br>
<br>
<br>

## 3.CASO DE USO
![Caso de uso](Caso_de_uso.PNG)

<br>
<br>
<br>
<br>

## 4.DIAGRAMA DE FLUJO
![Diagrama de flujo](diagrama_flujo.png)
<br>
<br>
Definición de variables
<br>
Dar bienevenida y indicar si es usuario individual o distribuidora
![Diagrama de flujo](pseint1.png)
<br>
<br>
Si usuario es distribuidoar, digitar datos de la distribuidora, se muestra menú de invenario de libros
<br>
se pregunta ¿Qué referencia de libro desea y cuantos libros desea comprar de esa referencia?
<br>
se genera factura
![Diagrama de flujo](pseint2.png)
<br>
<br>
![Diagrama de flujo](pseint3.png)
<br>
<br>
Si es usuario individual, digitar datos de usuario, se muestra menú de invenario de libros
<br>
se pregunta ¿Qué referencia de libro desea y cuantos libros desea comprar de esa referencia?
<br>
se genera factura
![Diagrama de flujo](pseint4.png)
<br>
<br>
![Diagrama de flujo](pseint5.png)
<br>
<br>

Se pregunta si desea comprar otro libro si indica que si se devolvera a dar la bienvenida el programa y si no se cerrara
![Diagrama de flujo](pseint6.png)
<br>
<br>
<br>
<br>

## 5. SEUDOCÒDIGO

[Seudocodigo](Planeta_editoriapseint.psc)
