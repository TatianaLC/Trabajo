Algoritmo Planeta_editorial
	Definir ref Como Real
	Definir opc,c1,c2,c3,c4,c5,cantidad,contenido,total, desea Como Entero
	Definir unt1,unt2,unt3,unt4,unt5 Como Entero
	Definir dis,dis2,dis3 Como Caracter
	Definir p1,p2,p3,p4,p5,Valorfinal Como Real
	p1 <- 50000
	p2 <- 65000
	p3 <- 48000
	p4 <- 68000
	p5 <- 80000
	c1 <- 100
	c2 <- 100
	c3 <- 100
	c4 <- 100
	c5 <- 100
	unt1 <- 0
	unt2 <- 0
	unt3 <- 0
	unt4 <- 0
	unt5 <- 0
	repetir
		 Escribir 'Bienvenido a Planeta editorial'
		 Escribir 'Digitar si usted es usuario individual o distribuidora'
		 Escribir '1-Distribuidora....2-Usuario individual'
		 Leer opc;
		 Si opc>2 o opc<1 Entonces
			Escribir "----------------------------------------------------";
			Escribir"Por digitar un usuario valido ";
			Escribir "----------------------------------------------------";
				
		 FinSi
	
		 Si opc=1 Entonces
			Escribir 'Nombre de la distribuidora'
			Leer dis
			Escribir 'Nùmero contacto de la distribuidora'
			Leer dis2
			Escribir 'Direcciòn de la distribuidora'
			Leer dis3
			
			Escribir '-------------------------------------------------'
			Escribir '      LIBROS DISPONIBLES EN PLANETA EDITORIAL'
			Escribir '-------------------------------------------------'
			Escribir 'REF     NOMBRE               PRECIO     CANTIDAD'
			Escribir '1       Matemáticas II','        ',p1,'      ',c1
			Escribir '2       Sociales  IV','          ',p2,'      ',c2
			Escribir '3       Civismo  XI','           ',p3,'      ',c3
			Escribir '4       Biología X','            ',p4,'      ',c4
			Escribir '5       Ética  VII','            ',p5,'      ',c5
			Escribir 'Seleccione referencia del libro que desea adquirir'
			Leer ref
			
			Segun ref  Hacer
				1:
					Escribir "-----------------------------------------------------------------------";
					Escribir 'Ingresar cantida de libros que desea comprar de la referencia asignada'
					Leer cantidad
					si cantidad>c1 Entonces
						Escribir "----------------------------------------------------";
						Escribir "No hay inventario suficiente para cubrir pedido";
						Escribir "----------------------------------------------------";
					FinSi
					Si cantidad<=100 Entonces
						c1 <- c1-cantidad
						unt1 <- unt1+cantidad
						total <- total+(p1*cantidad)
						Escribir "--------------------------------------------------";
						Escribir "            GENERACIÒN DE FACTURA";
						Escribir "--------------------------------------------------";
						Escribir "----------------------------------------------------";
						Escribir 'LIBRO    Matemáticas II'
						Escribir 'PRECIO UNIDAD','     ',p1
						Escribir 'CANTIDAD DE INVENTARIO RESTANTE','     ',c1
						Escribir 'Precio total: ','     ',total
						Escribir "----------------------------------------------------";
						
						
						si cantidad>29 entonces
							Escribir "---------------------------------------------------------------";
							Escribir "Señor usuario usted tendra un descuento del 40% en su compra"; 
							valorfinal=total*40/100;
							Escribir "Su valor final de compra sera", "   ",valorfinal;
							Escribir "---------------------------------------------------------------";
						FinSi
						
						si cantidad>19 y cantidad<21 entonces
							Escribir "--------------------------------------------------------------";
							Escribir "Señor usuario usted tendra un descuento del 30% en su compra"; 
							valorfinal=(total*30)/100;
							Escribir "Su valor final de compra sera", " $  ",valorfinal;
							Escribir "--------------------------------------------------------------";
						FinSi
						
						si cantidad<20 entonces
							Escribir "---------------------------------------------------------------";
							Escribir "Señor usuario usted no tendra un descuento en su compra"; 
							Escribir "Su valor final de compra sera", " $  ",total;
							Escribir "---------------------------------------------------------------";
						FinSi
		
					FinSi
				2:
					Escribir "-----------------------------------------------------------------------";
					Escribir 'Ingresar cantida de libros que desea comprar de la referencia asignada'
					Leer cantidad
					si cantidad>c2 Entonces
						Escribir "No hay inventario suficiente para cubrir pedido";
						Escribir "-------------------------------------------------------------------";
					FinSi
					Si cantidad<=100 Entonces
						c2 <- c2-cantidad
						unt1 <- unt1+cantidad
						total <- total+(p2*cantidad)
						Escribir "--------------------------------------------------";
						Escribir "            GENERACIÒN DE FACTURA";
						Escribir "--------------------------------------------------";
						Escribir "--------------------------------------------------";
						Escribir 'LIBRO    Sociales  IV'
						Escribir 'PRECIO UNIDAD','     ',p2
						Escribir 'CANTIDAD DE INVENTARIO RESTANTE','     ',c2
						Escribir 'Precio total: ','     ',total
						Escribir "---------------------------------------------------------------";
						
						si cantidad>29 entonces
							Escribir "---------------------------------------------------------------";
							Escribir "Señor usuario usted tendra un descuento del 40% en su compra"; 
							valorfinal=(total*40)/100;
							Escribir "Su valor final de compra sera", "   ",valorfinal;
							Escribir "---------------------------------------------------------------";
						FinSi
						
						si cantidad>19 y cantidad<21 entonces
							Escribir "---------------------------------------------------------------";
							Escribir "Señor usuario usted tendra un descuento del 30% en su compra"; 
							valorfinal=(total*30)/100;
							Escribir "Su valor final de compra sera", " $  ",valorfinal;
							Escribir "---------------------------------------------------------------";
						FinSi
						
						si cantidad<20 entonces
							Escribir "---------------------------------------------------------------";
							Escribir "Señor usuario usted no tendra un descuento en su compra"; 
							Escribir "Su valor final de compra sera", " $  ",total;
							Escribir "---------------------------------------------------------------";
						FinSi
					FinSi
				3:
					Escribir "----------------------------------------------------------------------";
					Escribir 'Ingresar cantida de libros que desea comprar de la referencia asignada'
					Leer cantidad
					si cantidad>c3 Entonces
						Escribir "No hay inventario suficiente para cubrir pedido";
						Escribir "------------------------------------------------------------------";
					FinSi
					Si cantidad<=100 Entonces
						c3 <- c3-cantidad
						unt1 <- unt1+cantidad
						total <- total+(p3*cantidad)
						Escribir "--------------------------------------------------";
						Escribir "            GENERACIÒN DE FACTURA";
						Escribir "--------------------------------------------------";
						Escribir "--------------------------------------------------";
						Escribir 'LIBRO    Civismo  XI'
						Escribir 'PRECIO UNIDAD','     ',p3
						Escribir 'CANTIDAD DE INVENTARIO RESTANTE','     ',c3
						Escribir 'Precio total: ','     ',total
						Escribir "---------------------------------------------------------------";
						si cantidad>29 entonces
							Escribir "---------------------------------------------------------------";
							Escribir "Señor usuario usted tendra un descuento del 40% en su compra"; 
							valorfinal=(total*40)/100;
							Escribir "Su valor final de compra sera", "   ",valorfinal;
							Escribir "---------------------------------------------------------------";
						FinSi
						
						si cantidad>19 y cantidad<21 entonces
							Escribir "---------------------------------------------------------------";
							Escribir "Señor usuario usted tendra un descuento del 30% en su compra"; 
							valorfinal=(total*30)/100;
							Escribir "Su valor final de compra sera", " $  ",valorfinal;
							Escribir "---------------------------------------------------------------";
						FinSi
						
						si cantidad<20 entonces
							Escribir "---------------------------------------------------------------";
							Escribir "Señor usuario usted no tendra un descuento en su compra"; 
							Escribir "Su valor final de compra sera", " $  ",total;
							Escribir "---------------------------------------------------------------";
						FinSi
					FinSi
				4:
					Escribir "---------------------------------------------------------------";
					Escribir 'Ingresar cantida de libros que desea comprar de la referencia asignada'
					Leer cantidad
					si cantidad>c4 Entonces
						Escribir "No hay inventario suficiente para cubrir pedido";
						Escribir "---------------------------------------------------------------";
					FinSi
					Si cantidad<=100 Entonces
						c4 <- c4-cantidad
						unt1 <- unt1+cantidad
						total <- total+(p4*cantidad)
						Escribir "--------------------------------------------------";
						Escribir "            GENERACIÒN DE FACTURA";
						Escribir "--------------------------------------------------";
						Escribir "--------------------------------------------------";
						Escribir 'LIBRO    Biología X'
						Escribir 'PRECIO UNIDAD','     ',p4
						Escribir 'CANTIDAD DE INVENTARIO RESTANTE','     ',c4
						Escribir 'Precio total: ','     ',total
						Escribir "---------------------------------------------------";
						
						si cantidad>29 entonces
							Escribir "---------------------------------------------------------------";
							Escribir "Señor usuario usted tendra un descuento del 40% en su compra"; 
							valorfinal=(total*40)/100;
							Escribir "Su valor final de compra sera", "   ",valorfinal;
							Escribir "---------------------------------------------------------------";
						FinSi
						
						si cantidad>19 y cantidad<21 entonces
							Escribir "---------------------------------------------------------------";
							Escribir "Señor usuario usted tendra un descuento del 30% en su compra"; 
							valorfinal=(total*30)/100;
							Escribir "Su valor final de compra sera", " $  ",valorfinal;
							Escribir "---------------------------------------------------------------";
						FinSi
						
						si cantidad<20 entonces
							Escribir "---------------------------------------------------------------";
							Escribir "Señor usuario usted no tendra un descuento en su compra"; 
							Escribir "Su valor final de compra sera", " $  ",total;
							Escribir "---------------------------------------------------------------";
						FinSi
					FinSi
				5:
					Escribir "-----------------------------------------------------------------------";
					Escribir 'Ingresar cantida de libros que desea comprar de la referencia asignada'
					Leer cantidad
					si cantidad>c5 Entonces
						Escribir "No hay inventario suficiente para cubrir pedido";
						Escribir "-------------------------------------------------------------------";
					FinSi
					Si cantidad<=100 Entonces
						c5 <- c5-cantidad
						unt1 <- unt1+cantidad
						total <- total+(p5*cantidad)
						Escribir "--------------------------------------------------";
						Escribir "            GENERACIÒN DE FACTURA";
						Escribir "--------------------------------------------------";
						Escribir "--------------------------------------------------";
						Escribir 'LIBRO   Ética  VII'
						Escribir 'PRECIO UNIDAD','     ',p5
						Escribir 'CANTIDAD DE INVENTARIO RESTANTE','     ',c5
						Escribir 'Precio total: ','     ',total
						Escribir "---------------------------------------------------";
						
						si cantidad>29 entonces
							Escribir "---------------------------------------------------------------";
							Escribir "Señor usuario usted tendra un descuento del 40% en su compra"; 
							valorfinal=(total*40)/100;
							Escribir "Su valor final de compra sera", "   ",valorfinal;
							Escribir "---------------------------------------------------------------";
						FinSi
						
						si cantidad>19 y cantidad<21 entonces
							Escribir "---------------------------------------------------------------";
							Escribir "Señor usuario usted tendra un descuento del 30% en su compra"; 
							valorfinal=(total*30)/100;
							Escribir "Su valor final de compra sera", " $  ",valorfinal;
							Escribir "---------------------------------------------------------------";
						FinSi
						
						si cantidad<20 entonces
							Escribir "---------------------------------------------------------------";
							Escribir "Señor usuario usted no tendra un descuento en su compra"; 
							Escribir "Su valor final de compra sera", " $  ",total;
							Escribir "---------------------------------------------------------------";
						FinSi
					FinSi
					
			FinSegun
			Si ref<1 o ref>5 Entonces
				Escribir "---------------------------------------------------------------";
				Escribir 'Referencia no existente---INTENTE DE NUEVO'
				Escribir "---------------------------------------------------------------";
			FinSi
			
			
			
			
			
		 FinSi
		
		
		
		
		
		
		
		 Si opc=2 Entonces
			Escribir 'Digite su nombre'
			Leer dis
			Escribir 'Nùmero contacto '
			Leer dis2
			Escribir 'Direcciòn'
			Leer dis3
			
			Escribir '-------------------------------------------------'
			Escribir '      LIBROS DISPONIBLES EN PLANETA EDITORIAL'
			Escribir '-------------------------------------------------'
			Escribir 'REF     NOMBRE               PRECIO     CANTIDAD'
			Escribir '1       Matemáticas II','        ',p1,'      ',c1
			Escribir '2       Sociales  IV','          ',p2,'      ',c2
			Escribir '3       Civismo  XI','           ',p3,'      ',c3
			Escribir '4       Biología X','            ',p4,'      ',c4
			Escribir '5       Ética  VII','            ',p5,'      ',c5
			Escribir 'Seleccione referencia del libro que desea adquirir'
			Leer ref
			
			Segun ref  Hacer
				1:
					Escribir "---------------------------------------------------------------";
					Escribir 'Ingresar cantida de libros que desea comprar de la referencia asignada'
					Leer cantidad
					si cantidad>c1 Entonces
						Escribir "No hay inventario suficiente para cubrir pedido";
						Escribir "---------------------------------------------------------------";
					FinSi
					Si cantidad<=100 Entonces
						c1 <- c1-cantidad
						unt1 <- unt1+cantidad
						total <- total+(p1*cantidad)
						Escribir "--------------------------------------------------";
						Escribir "            GENERACIÒN DE FACTURA";
						Escribir "--------------------------------------------------";
						Escribir "--------------------------------------------------";
						Escribir 'LIBRO    Matemáticas II'
						Escribir 'PRECIO UNIDAD','     ',p1
						Escribir 'CANTIDAD DE INVENTARIO RESTANTE','     ',c1
						Escribir 'Precio total: ','     ',total
						Escribir "---------------------------------------------------";
						
						si cantidad>-5 y cantidad<15 entonces
							Escribir "---------------------------------------------------------------";
							Escribir "Señor usuario usted tendra un descuento del 5% en su compra"; 
							valorfinal=(total*5)/100;
							Escribir "Su valor final de compra sera", "   ",valorfinal;
							Escribir "---------------------------------------------------------------";
						FinSi
						
						si cantidad>14 entonces
							Escribir "---------------------------------------------------------------";
							Escribir "Señor usuario usted tendra un descuento del 15% en su compra"; 
							valorfinal=(total*15)/100;
							Escribir "Su valor final de compra sera", " $  ",valorfinal;
							Escribir "---------------------------------------------------------------";
						FinSi
						
						si cantidad<5 entonces
							Escribir "---------------------------------------------------------------";
							Escribir "Señor usuario usted no tendra un descuento en su compra"; 
							Escribir "Su valor final de compra sera", " $  ",total;
							Escribir "---------------------------------------------------------------";
						FinSi
					FinSi
				2:
					Escribir "---------------------------------------------------------------";
					Escribir 'Ingresar cantida de libros que desea comprar de la referencia asignada'
					Leer cantidad
					si cantidad>c2 Entonces
						Escribir "No hay inventario suficiente para cubrir pedido";
						Escribir "---------------------------------------------------------------";
					FinSi
					Si cantidad<=100 Entonces
						c2 <- c2-cantidad
						unt1 <- unt1+cantidad
						total <- total+(p2*cantidad)
						Escribir "--------------------------------------------------";
						Escribir "            GENERACIÒN DE FACTURA";
						Escribir "--------------------------------------------------";
						Escribir "---------------------------------------------------";
						Escribir 'LIBRO    Sociales  IV'
						Escribir 'PRECIO UNIDAD','     ',p2
						Escribir 'CANTIDAD DE INVENTARIO RESTANTE','     ',c2
						Escribir 'Precio total: ','     ',total
						Escribir "---------------------------------------------------";
						
						si cantidad>-5 y cantidad<15 entonces
							Escribir "---------------------------------------------------------------";
							Escribir "Señor usuario usted tendra un descuento del 5% en su compra"; 
							valorfinal=(total*5)/100
							Escribir "Su valor final de compra sera", "   ",valorfinal;
							Escribir "---------------------------------------------------------------";
						FinSi
						
						si cantidad>14 entonces
							Escribir "---------------------------------------------------------------";
							Escribir "Señor usuario usted tendra un descuento del 15% en su compra"; 
							valorfinal=(total*15)/100;
							Escribir "Su valor final de compra sera", " $  ",valorfinal;
							Escribir "---------------------------------------------------------------";
						FinSi
						
						si cantidad<5 entonces
							Escribir "---------------------------------------------------------------";
							Escribir "Señor usuario usted no tendra un descuento en su compra"; 
							Escribir "Su valor final de compra sera", " $  ",total;
							Escribir "---------------------------------------------------------------";
						FinSi
					FinSi
				3:
					Escribir "---------------------------------------------------------------";
					Escribir 'Ingresar cantida de libros que desea comprar de la referencia asignada'
					Leer cantidad
					si cantidad>c3 Entonces
						Escribir "No hay inventario suficiente para cubrir pedido";
						Escribir "---------------------------------------------------------------";
					FinSi
					Si cantidad<=100 Entonces
						c3 <- c3-cantidad
						unt1 <- unt1+cantidad
						total <- total+(p3*cantidad)
						Escribir "--------------------------------------------------";
						Escribir "            GENERACIÒN DE FACTURA";
						Escribir "--------------------------------------------------";
						Escribir "--------------------------------------------------";
						Escribir 'LIBRO    Civismo  XI'
						Escribir 'PRECIO UNIDAD','     ',p3
						Escribir 'CANTIDAD DE INVENTARIO RESTANTE','     ',c3
						Escribir 'Precio total: ','     ',total
						Escribir "---------------------------------------------------";
						
						si cantidad>-5 y cantidad<15 entonces
							Escribir "---------------------------------------------------------------";
							Escribir "Señor usuario usted tendra un descuento del 5% en su compra"; 
							valorfinal=(total*5)/100
							Escribir "Su valor final de compra sera", "   ",valorfinal;
							Escribir "---------------------------------------------------------------";
						FinSi
						
						si cantidad>14 entonces
							Escribir "---------------------------------------------------------------";
							Escribir "Señor usuario usted tendra un descuento del 15% en su compra"; 
							valorfinal=(total*15)/100;
							Escribir "Su valor final de compra sera", " $  ",valorfinal;
							Escribir "---------------------------------------------------------------";
						FinSi
						
						si cantidad<5 entonces
							Escribir "---------------------------------------------------------------";
							Escribir "Señor usuario usted no tendra un descuento en su compra"; 
							Escribir "Su valor final de compra sera", " $  ",total;
							Escribir "---------------------------------------------------------------";
						FinSi
					FinSi
				4:
					Escribir "---------------------------------------------------------------";
					Escribir 'Ingresar cantida de libros que desea comprar de la referencia asignada'
					Leer cantidad
					si cantidad>c4 Entonces
						Escribir "No hay inventario suficiente para cubrir pedido";
						Escribir "---------------------------------------------------------------";
					FinSi
					Si cantidad<=100 Entonces
						c4 <- c4-cantidad
						unt1 <- unt1+cantidad
						total <- total+(p4*cantidad)
						Escribir "--------------------------------------------------";
						Escribir "            GENERACIÒN DE FACTURA";
						Escribir "--------------------------------------------------";
						Escribir "---------------------------------------------------";
						Escribir 'LIBRO    Biología X'
						Escribir 'PRECIO UNIDAD','     ',p4
						Escribir 'CANTIDAD DE INVENTARIO RESTANTE','     ',c4
						Escribir 'Precio total: ','     ',total
						Escribir "----------------------------------------------------";
						
						si cantidad>-5 y cantidad<15 entonces
							Escribir "---------------------------------------------------------------";
							Escribir "Señor usuario usted tendra un descuento del 5% en su compra"; 
							valorfinal=(total*5)/100;
							Escribir "Su valor final de compra sera", "   ",valorfinal;
							Escribir "---------------------------------------------------------------";
						FinSi
						
						si cantidad>14 entonces
							Escribir "---------------------------------------------------------------";
							Escribir "Señor usuario usted tendra un descuento del 15% en su compra"; 
							valorfinal=(total*15)/100;
							Escribir "Su valor final de compra sera", " $  ",valorfinal;
							Escribir "---------------------------------------------------------------";
						FinSi
						
						si cantidad<5 entonces
							Escribir "---------------------------------------------------------------";
							Escribir "Señor usuario usted no tendra un descuento en su compra"; 
							Escribir "Su valor final de compra sera", " $  ",total;
							Escribir "---------------------------------------------------------------";
						FinSi
					FinSi
				5:
					Escribir "-----------------------------------------------------------------------";
					Escribir 'Ingresar cantida de libros que desea comprar de la referencia asignada'
					Leer cantidad
					si cantidad>c5 Entonces
						Escribir "No hay inventario suficiente para cubrir pedido";
						Escribir "------------------------------------------------------------------";
					FinSi
					Si cantidad<=100 Entonces
						c5 <- c5-cantidad
						unt1 <- unt1+cantidad
						total <- total+(p5*cantidad)
						Escribir "--------------------------------------------------";
						Escribir "            GENERACIÒN DE FACTURA";
						Escribir "--------------------------------------------------";
						Escribir "--------------------------------------------------";
						Escribir 'LIBRO    Ética  VII'
						Escribir 'PRECIO UNIDAD','     ',p5
						Escribir 'CANTIDAD DE INVENTARIO RESTANTE','     ',c5
						Escribir 'Precio total: ','     ',total
						Escribir "---------------------------------------------------";
						
						si cantidad>-5 y cantidad<15 entonces
							Escribir "---------------------------------------------------------------";
							Escribir "Señor usuario usted tendra un descuento del 5% en su compra"; 
							valorfinal=(total*5)/100;
							Escribir "Su valor final de compra sera", "   ",valorfinal;
							Escribir "---------------------------------------------------------------";
						FinSi
						
						si cantidad>-15 entonces
							Escribir "---------------------------------------------------------------";
							Escribir "Señor usuario usted tendra un descuento del 15% en su compra"; 
							valorfinal=(total*15)/100;
							Escribir "Su valor final de compra sera", " $  ",valorfinal;
							Escribir "---------------------------------------------------------------";
						FinSi
						
						si cantidad<5 entonces
							Escribir "---------------------------------------------------------------";
							Escribir "Señor usuario usted no tendra un descuento en su compra"; 
							Escribir "Su valor final de compra sera", " $  ",total;
							Escribir "---------------------------------------------------------------";
						FinSi
						
						
						
					FinSi
					
			FinSegun
			Si ref<1 o ref>5 Entonces
				Escribir "---------------------------------------------------------------";
				Escribir 'Referencia no existente---INTENTE DE NUEVO'
				Escribir "---------------------------------------------------------------";
			FinSi
			
		FinSi
		
	  	
		 Escribir "---------------------------------------------------------------";
		 Escribir "¿DESEA COMPRAR OTRO LIBRO?";
		 Escribir "---------------------------------------------------------------";
		 Escribir "1-SI";
		 Escribir "2-NO";
		 Escribir "---------------------------------------------------------------";
		 leer desea;
	 
	hasta que desea==2; 
   

	 

FinAlgoritmo