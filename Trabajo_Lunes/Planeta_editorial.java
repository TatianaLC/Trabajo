
/**
 * Write a description of class Planeta_editorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Planeta_editorial
{
   public static void main(String[] args){
   Scanner sc = new Scanner (System.in);   
         String dis,dis2,dis3;
         int opc,cantidad,contenido, desea=0;
         int ref;
         double valorfinal,total;
         
         
         int[]precios= new int [5];
         precios[0]=50000;
         precios[1]=65000;
         precios[2]=48000;
         precios[3]=68000;
         precios[4]=80000;
         
         int[]cantidades= new int [5];
         cantidades[0]=100;
         cantidades[1]=100;
         cantidades[2]=100;
         cantidades[3]=100;
         cantidades[4]=100;
         
         int[]unidades= new int [5];
         unidades[0]=0;
         unidades[1]=0;
         unidades[2]=0;
         unidades[3]=0;
         unidades[4]=0;
        
         
         do{
             System.out.println("Bienvenido a Planeta editorial");
             System.out.println("Digitar si usted es usuario individual o distribuidora");
             System.out.println("1-Distribuidora....2-Usuario individual");
             opc=sc.nextInt();
             
                 if(opc>2 || opc<1 ){
                 System.out.println("----------------------------------------------------");
                 System.out.println("Por digitar un usuario valido ");
                 System.out.println("----------------------------------------------------");
                 }
                 if (opc==1)
                 {
                 System.out.println("Nombre de la distribuidora");
                 dis=sc.next();
                 System.out.println("Nùmero contacto de la distribuidora");
                 dis2=sc.next();
                 System.out.println("Direcciòn de la distribuidora");
                 dis3=sc.next();
                 System.out.println("-------------------------------------------------");
                 System.out.println("     LIBROS DISPONIBLES EN PLANETA EDITORIAL");
                 System.out.println("-------------------------------------------------");
                 System.out.println("REF     NOMBRE               PRECIO     CANTIDAD");
                 System.out.println("1       Matemáticas II"+"        $"+ precios[0]+"         "+cantidades[0]);
                 System.out.println("2       Sociales  IV"+"          $"+ precios[1]+"         "+cantidades[1]);
                 System.out.println("3       Civismo  XI"+"           $"+ precios[2]+"         "+cantidades[2]);
                 System.out.println("4       Biología X"+"            $"+ precios[3]+"         "+cantidades[3]);
                 System.out.println("5       Ética  VII"+"            $"+ precios[4]+"         "+cantidades[4]);
                 System.out.println("-------------------------------------------------");
                 System.out.println("Seleccione referencia del libro que desea adquirir");
                 ref=sc.nextInt();
                 
                 switch(ref)
                 {
                     case 1: 
                         System.out.println("-------------------------------------------------");
                         System.out.println("Ingresar cantida de libros que desea comprar de la referencia asignada");
                         cantidad=sc.nextInt();
                         if(cantidad>100)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("No hay inventario suficiente para cubrir pedido");
                             System.out.println("-------------------------------------------------");
                             
                            }
                         if(cantidad<=100)
                         {
                          cantidades[0]=cantidades[0]-cantidad;
                          unidades[0]=unidades[0]+cantidad;
                         
                         
                          System.out.println("-------------------------------------------------");
                          System.out.println("             GENERACIÒN DE FACTURA");
                          System.out.println("-------------------------------------------------");
                          System.out.println("-------------------------------------------------");
                          System.out.println("LIBRO    Matemáticas II");
                          System.out.println("PRECIO UNIDAD"+"     "+ precios[0]);
                          System.out.println("CANTIDAD DE INVENTARIO RESTANTE"+"   "+cantidades[0]);
                          total=(precios[0]*cantidad);
                          System.out.println("Precio total:"+"    "+ total);
                          System.out.println("-------------------------------------------------");
                         }
                         if (cantidad>29)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted tendra un descuento del 40% en su compra");
                             total=(precios[0]*cantidad);
                             valorfinal=(total *40)/100;
                             System.out.println("Su valor final de compra sera"+ "   "+valorfinal);
                             System.out.println("-------------------------------------------------");
                            }
                         if (cantidad>19 && cantidad<21)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted tendra un descuento del 30% en su compra");
                             total=(precios[0]*cantidad);
                             valorfinal=(total *30)/100;
                             System.out.println("Su valor final de compra sera"+ "   "+valorfinal);
                             System.out.println("-------------------------------------------------");
                            }
                         if (cantidad<20)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted no tendra un descuento  en su compra");
                             total=(precios[0]*cantidad);
                             System.out.println("Su valor final de compra sera"+ "   "+total);
                             System.out.println("-------------------------------------------------");
                            }

                     break;
                      
                      
                     case 2:
                         System.out.println("-------------------------------------------------");
                         System.out.println("Ingresar cantida de libros que desea comprar de la referencia asignada");
                         cantidad=sc.nextInt();
                         if(cantidad>100)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("No hay inventario suficiente para cubrir pedido");
                             System.out.println("-------------------------------------------------");
                             
                         }
                         if(cantidad<=100)
                         {
                          cantidades[1]=cantidades[1]-cantidad;
                          unidades[1]=unidades[1]+cantidad;
                         
                         
                          System.out.println("-------------------------------------------------");
                          System.out.println("             GENERACIÒN DE FACTURA");
                          System.out.println("-------------------------------------------------");
                          System.out.println("-------------------------------------------------");
                          System.out.println("LIBRO    Sociales  IV");
                          System.out.println("PRECIO UNIDAD"+"     "+ precios[1]);
                          System.out.println("CANTIDAD DE INVENTARIO RESTANTE"+"   "+cantidades[1]);
                          total=(precios[1]*cantidad);
                          System.out.println("Precio total:"+"    "+ total);
                          System.out.println("-------------------------------------------------");
                         }
                         if (cantidad>29)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted tendra un descuento del 40% en su compra");
                             total=(precios[1]*cantidad);
                             valorfinal=(total *40)/100;
                             System.out.println("Su valor final de compra sera"+ "   "+valorfinal);
                             System.out.println("-------------------------------------------------");
                            }
                         if (cantidad>19 && cantidad<21)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted tendra un descuento del 30% en su compra");
                             total=(precios[1]*cantidad);
                             valorfinal=(total *30)/100;
                             System.out.println("Su valor final de compra sera"+ "   "+valorfinal);
                             System.out.println("-------------------------------------------------");
                            }
                         if (cantidad<20)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted no tendra un descuento  en su compra");
                             total=(precios[1]*cantidad);
                             System.out.println("Su valor final de compra sera"+ "   "+total);
                             System.out.println("-------------------------------------------------");
                            }

                     break;
                      
                     case 3:
                         System.out.println("-------------------------------------------------");
                         System.out.println("Ingresar cantida de libros que desea comprar de la referencia asignada");
                         cantidad=sc.nextInt();
                         if(cantidad>100)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("No hay inventario suficiente para cubrir pedido");
                             System.out.println("-------------------------------------------------");
                             
                            }
                         if(cantidad<=100)
                         {
                             cantidades[2]=cantidades[2]-cantidad;
                             unidades[2]=unidades[2]+cantidad;
                             
                             
                             System.out.println("-------------------------------------------------");
                             System.out.println("             GENERACIÒN DE FACTURA");
                             System.out.println("-------------------------------------------------");
                             System.out.println("-------------------------------------------------");
                             System.out.println("LIBRO   Civismo  XI");
                             System.out.println("PRECIO UNIDAD"+"     "+ precios[2]);
                             System.out.println("CANTIDAD DE INVENTARIO RESTANTE"+"   "+cantidades[2]);
                             total=(precios[2]*cantidad);
                             System.out.println("Precio total:"+"    "+ total);
                             System.out.println("-------------------------------------------------");
                         }
                         if (cantidad>29)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted tendra un descuento del 40% en su compra");
                             total=(precios[2]*cantidad);
                             valorfinal=(total *40)/100;
                             System.out.println("Su valor final de compra sera"+ "   "+valorfinal);
                             System.out.println("-------------------------------------------------");
                            }
                         if (cantidad>19 && cantidad<21)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted tendra un descuento del 30% en su compra");
                             total=(precios[2]*cantidad);
                             valorfinal=(total *30)/100;
                             System.out.println("Su valor final de compra sera"+ "   "+valorfinal);
                             System.out.println("-------------------------------------------------");
                            }
                         if (cantidad<20)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted no tendra un descuento  en su compra");
                             total=(precios[2]*cantidad);
                             System.out.println("Su valor final de compra sera"+ "   "+total);
                             System.out.println("-------------------------------------------------");
                            }

                     break;
                      
                     case 4:
                         System.out.println("-------------------------------------------------");
                         System.out.println("Ingresar cantida de libros que desea comprar de la referencia asignada");
                         cantidad=sc.nextInt();
                         if(cantidad>100)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("No hay inventario suficiente para cubrir pedido");
                             System.out.println("-------------------------------------------------");
                             
                            }
                         if(cantidad<=100)
                         {
                          cantidades[3]=cantidades[3]-cantidad;
                          unidades[3]=unidades[3]+cantidad;
                         
                         
                          System.out.println("-------------------------------------------------");
                          System.out.println("             GENERACIÒN DE FACTURA");
                          System.out.println("-------------------------------------------------");
                          System.out.println("-------------------------------------------------");
                          System.out.println("LIBRO    Biología X");
                          System.out.println("PRECIO UNIDAD"+"     "+ precios[3]);
                          System.out.println("CANTIDAD DE INVENTARIO RESTANTE"+"   "+cantidades[3]);
                          total=(precios[3]*cantidad);
                          System.out.println("Precio total:"+"    "+ total);
                          System.out.println("-------------------------------------------------");
                         }
                         if (cantidad>29)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted tendra un descuento del 40% en su compra");
                             total=(precios[3]*cantidad);
                             valorfinal=(total *40)/100;
                             System.out.println("Su valor final de compra sera"+ "   "+valorfinal);
                             System.out.println("-------------------------------------------------");
                            }
                         if (cantidad>19 && cantidad<21)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted tendra un descuento del 30% en su compra");
                             total=(precios[3]*cantidad);
                             valorfinal=(total *30)/100;
                             System.out.println("Su valor final de compra sera"+ "   "+valorfinal);
                             System.out.println("-------------------------------------------------");
                            }
                         if (cantidad<20)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted no tendra un descuento  en su compra");
                             total=(precios[3]*cantidad);
                             System.out.println("Su valor final de compra sera"+ "   "+total);
                             System.out.println("-------------------------------------------------");
                            }

                     break;
                      
                     case 5:
                          System.out.println("-------------------------------------------------");
                         System.out.println("Ingresar cantida de libros que desea comprar de la referencia asignada");
                         cantidad=sc.nextInt();
                         if(cantidad>100)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("No hay inventario suficiente para cubrir pedido");
                             System.out.println("-------------------------------------------------");
                             
                            }
                         if(cantidad<=100)
                         {
                          cantidades[4]=cantidades[4]-cantidad;
                          unidades[4]=unidades[4]+cantidad;
                         
                         
                          System.out.println("-------------------------------------------------");
                          System.out.println("             GENERACIÒN DE FACTURA");
                          System.out.println("-------------------------------------------------");
                          System.out.println("-------------------------------------------------");
                          System.out.println("LIBRO     Ética  VII");
                          System.out.println("PRECIO UNIDAD"+"     "+ precios[4]);
                          System.out.println("CANTIDAD DE INVENTARIO RESTANTE"+"   "+cantidades[4]);
                          total=(precios[4]*cantidad);
                          System.out.println("Precio total:"+"    "+ total);
                          System.out.println("-------------------------------------------------");
                         }
                         if (cantidad>29)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted tendra un descuento del 40% en su compra");
                             total=(precios[4]*cantidad);
                             valorfinal=(total *40)/100;
                             System.out.println("Su valor final de compra sera"+ "   "+valorfinal);
                             System.out.println("-------------------------------------------------");
                            }
                         if (cantidad>19 && cantidad<21)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted tendra un descuento del 30% en su compra");
                             total=(precios[4]*cantidad);
                             valorfinal=(total *30)/100;
                             System.out.println("Su valor final de compra sera"+ "   "+valorfinal);
                             System.out.println("-------------------------------------------------");
                            }
                         if (cantidad<20)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted no tendra un descuento  en su compra");
                             total=(precios[4]*cantidad);
                             System.out.println("Su valor final de compra sera"+ "   "+total);
                             System.out.println("-------------------------------------------------");
                            }
                   break;
                }//cierre menu
                if (ref<1  || ref>5){
                     System.out.println("-------------------------------------------------");   
                     System.out.println("Referencia no existente---INTENTE DE NUEVO");
                     System.out.println("-------------------------------------------------");
                    }
            }//cierre segundo if
                
                
                
                
                
                
                
                
                
                
                /////////////////////////////////////////////////////////
                if (opc==2)
                {
                 System.out.println("Digite su nombre");
                 dis=sc.next();
                 System.out.println("Nùmero contacto");
                 dis2=sc.next();
                 System.out.println("Direcciòn");
                 dis3=sc.next();
                
                 
                 System.out.println("-------------------------------------------------");
                 System.out.println("     LIBROS DISPONIBLES EN PLANETA EDITORIAL");
                 System.out.println("-------------------------------------------------");
                 System.out.println("REF     NOMBRE               PRECIO     CANTIDAD");
                 System.out.println("1       Matemáticas II"+"        $"+ precios[0]+"         "+cantidades[0]);
                 System.out.println("2       Sociales  IV"+"          $"+ precios[1]+"         "+cantidades[1]);
                 System.out.println("3       Civismo  XI"+"           $"+ precios[2]+"         "+cantidades[2]);
                 System.out.println("4       Biología X"+"            $"+ precios[3]+"         "+cantidades[3]);
                 System.out.println("5       Ética  VII"+"            $"+ precios[4]+"         "+cantidades[4]);
                 System.out.println("-------------------------------------------------");
                 System.out.println("Seleccione referencia del libro que desea adquirir");
                 ref=sc.nextInt();
                 
                 switch(ref)
                 {
                     case 1: 
                         System.out.println("-------------------------------------------------");
                         System.out.println("Ingresar cantida de libros que desea comprar de la referencia asignada");
                         cantidad=sc.nextInt();
                         if(cantidad>100)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("No hay inventario suficiente para cubrir pedido");
                             System.out.println("-------------------------------------------------");
                             
                            }
                         if(cantidad<=100)
                         {
                          cantidades[0]=cantidades[0]-cantidad;
                          unidades[0]=unidades[0]+cantidad;
                         
                         
                          System.out.println("-------------------------------------------------");
                          System.out.println("             GENERACIÒN DE FACTURA");
                          System.out.println("-------------------------------------------------");
                          System.out.println("-------------------------------------------------");
                          System.out.println("LIBRO    Matemáticas II");
                          System.out.println("PRECIO UNIDAD"+"     "+ precios[0]);
                          System.out.println("CANTIDAD DE INVENTARIO RESTANTE"+"   "+cantidades[0]);
                          total=(precios[0]*cantidad);
                          System.out.println("Precio total:"+"    "+ total);
                          System.out.println("-------------------------------------------------");
                         }
                         if (cantidad>29)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted tendra un descuento del 40% en su compra");
                             total=(precios[0]*cantidad);
                             valorfinal=(total *40)/100;
                             System.out.println("Su valor final de compra sera"+ "   "+valorfinal);
                             System.out.println("-------------------------------------------------");
                            }
                         if (cantidad>19 && cantidad<21)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted tendra un descuento del 30% en su compra");
                             total=(precios[0]*cantidad);
                             valorfinal=(total *30)/100;
                             System.out.println("Su valor final de compra sera"+ "   "+valorfinal);
                             System.out.println("-------------------------------------------------");
                            }
                         if (cantidad<20)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted no tendra un descuento  en su compra");
                             total=(precios[0]*cantidad);
                             System.out.println("Su valor final de compra sera"+ "   "+total);
                             System.out.println("-------------------------------------------------");
                            }

                     break;
                      
                      
                     case 2:
                         System.out.println("-------------------------------------------------");
                         System.out.println("Ingresar cantida de libros que desea comprar de la referencia asignada");
                         cantidad=sc.nextInt();
                         if(cantidad>100)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("No hay inventario suficiente para cubrir pedido");
                             System.out.println("-------------------------------------------------");
                             
                         }
                         if(cantidad<=100)
                         {
                          cantidades[1]=cantidades[1]-cantidad;
                          unidades[1]=unidades[1]+cantidad;
                         
                         
                          System.out.println("-------------------------------------------------");
                          System.out.println("             GENERACIÒN DE FACTURA");
                          System.out.println("-------------------------------------------------");
                          System.out.println("-------------------------------------------------");
                          System.out.println("LIBRO    Sociales  IV");
                          System.out.println("PRECIO UNIDAD"+"     "+ precios[1]);
                          System.out.println("CANTIDAD DE INVENTARIO RESTANTE"+"   "+cantidades[1]);
                          total=(precios[1]*cantidad);
                          System.out.println("Precio total:"+"    "+ total);
                          System.out.println("-------------------------------------------------");
                         }
                         if (cantidad>29)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted tendra un descuento del 40% en su compra");
                             total=(precios[1]*cantidad);
                             valorfinal=(total *40)/100;
                             System.out.println("Su valor final de compra sera"+ "   "+valorfinal);
                             System.out.println("-------------------------------------------------");
                            }
                         if (cantidad>19 && cantidad<21)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted tendra un descuento del 30% en su compra");
                             total=(precios[1]*cantidad);
                             valorfinal=(total *30)/100;
                             System.out.println("Su valor final de compra sera"+ "   "+valorfinal);
                             System.out.println("-------------------------------------------------");
                            }
                         if (cantidad<20)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted no tendra un descuento  en su compra");
                             total=(precios[1]*cantidad);
                             System.out.println("Su valor final de compra sera"+ "   "+total);
                             System.out.println("-------------------------------------------------");
                            }

                     break;
                      
                     case 3:
                         System.out.println("-------------------------------------------------");
                         System.out.println("Ingresar cantida de libros que desea comprar de la referencia asignada");
                         cantidad=sc.nextInt();
                         if(cantidad>100)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("No hay inventario suficiente para cubrir pedido");
                             System.out.println("-------------------------------------------------");
                             
                            }
                         if(cantidad<=100)
                         {
                             cantidades[2]=cantidades[2]-cantidad;
                             unidades[2]=unidades[2]+cantidad;
                             
                             
                             System.out.println("-------------------------------------------------");
                             System.out.println("             GENERACIÒN DE FACTURA");
                             System.out.println("-------------------------------------------------");
                             System.out.println("-------------------------------------------------");
                             System.out.println("LIBRO     Civismo  XI");
                             System.out.println("PRECIO UNIDAD"+"     "+ precios[2]);
                             System.out.println("CANTIDAD DE INVENTARIO RESTANTE"+"   "+cantidades[2]);
                             total=(precios[2]*cantidad);
                             System.out.println("Precio total:"+"    "+ total);
                             System.out.println("-------------------------------------------------");
                         }
                         if (cantidad>29)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted tendra un descuento del 40% en su compra");
                             total=(precios[2]*cantidad);
                             valorfinal=(total *40)/100;
                             System.out.println("Su valor final de compra sera"+ "   "+valorfinal);
                             System.out.println("-------------------------------------------------");
                            }
                         if (cantidad>19 && cantidad<21)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted tendra un descuento del 30% en su compra");
                             total=(precios[2]*cantidad);
                             valorfinal=(total *30)/100;
                             System.out.println("Su valor final de compra sera"+ "   "+valorfinal);
                             System.out.println("-------------------------------------------------");
                            }
                         if (cantidad<20)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted no tendra un descuento  en su compra");
                             total=(precios[2]*cantidad);
                             System.out.println("Su valor final de compra sera"+ "   "+total);
                             System.out.println("-------------------------------------------------");
                            }

                     break;
                      
                     case 4:
                         System.out.println("-------------------------------------------------");
                         System.out.println("Ingresar cantida de libros que desea comprar de la referencia asignada");
                         cantidad=sc.nextInt();
                         if(cantidad>100)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("No hay inventario suficiente para cubrir pedido");
                             System.out.println("-------------------------------------------------");
                             
                            }
                         if(cantidad<=100)
                         {
                          cantidades[3]=cantidades[3]-cantidad;
                          unidades[3]=unidades[3]+cantidad;
                         
                         
                          System.out.println("-------------------------------------------------");
                          System.out.println("             GENERACIÒN DE FACTURA");
                          System.out.println("-------------------------------------------------");
                          System.out.println("-------------------------------------------------");
                          System.out.println("LIBRO    Biología X");
                          System.out.println("PRECIO UNIDAD"+"     "+ precios[3]);
                          System.out.println("CANTIDAD DE INVENTARIO RESTANTE"+"   "+cantidades[3]);
                          total=(precios[3]*cantidad);
                          System.out.println("Precio total:"+"    "+ total);
                          System.out.println("-------------------------------------------------");
                         }
                         if (cantidad>29)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted tendra un descuento del 40% en su compra");
                             total=(precios[3]*cantidad);
                             valorfinal=(total *40)/100;
                             System.out.println("Su valor final de compra sera"+ "   "+valorfinal);
                             System.out.println("-------------------------------------------------");
                            }
                         if (cantidad>19 && cantidad<21)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted tendra un descuento del 30% en su compra");
                             total=(precios[3]*cantidad);
                             valorfinal=(total *30)/100;
                             System.out.println("Su valor final de compra sera"+ "   "+valorfinal);
                             System.out.println("-------------------------------------------------");
                            }
                         if (cantidad<20)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted no tendra un descuento  en su compra");
                             total=(precios[3]*cantidad);
                             System.out.println("Su valor final de compra sera"+ "   "+total);
                             System.out.println("-------------------------------------------------");
                            }

                     break;
                      
                     case 5:
                          System.out.println("-------------------------------------------------");
                         System.out.println("Ingresar cantida de libros que desea comprar de la referencia asignada");
                         cantidad=sc.nextInt();
                         if(cantidad>100)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("No hay inventario suficiente para cubrir pedido");
                             System.out.println("-------------------------------------------------");
                             
                            }
                         if(cantidad<=100)
                         {
                          cantidades[4]=cantidades[4]-cantidad;
                          unidades[4]=unidades[4]+cantidad;
                         
                         
                          System.out.println("-------------------------------------------------");
                          System.out.println("             GENERACIÒN DE FACTURA");
                          System.out.println("-------------------------------------------------");
                          System.out.println("-------------------------------------------------");
                          System.out.println("LIBRO    Ética  VII");
                          System.out.println("PRECIO UNIDAD"+"     "+ precios[4]);
                          System.out.println("CANTIDAD DE INVENTARIO RESTANTE"+"   "+cantidades[4]);
                          total=(precios[4]*cantidad);
                          System.out.println("Precio total:"+"    "+ total);
                          System.out.println("-------------------------------------------------");
                         }
                         if (cantidad>29)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted tendra un descuento del 40% en su compra");
                             total=(precios[4]*cantidad);
                             valorfinal=(total *40)/100;
                             System.out.println("Su valor final de compra sera"+ "   "+valorfinal);
                             System.out.println("-------------------------------------------------");
                            }
                         if (cantidad>19 && cantidad<21)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted tendra un descuento del 30% en su compra");
                             total=(precios[4]*cantidad);
                             valorfinal=(total *30)/100;
                             System.out.println("Su valor final de compra sera"+ "   "+valorfinal);
                             System.out.println("-------------------------------------------------");
                            }
                         if (cantidad<20)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted no tendra un descuento  en su compra");
                             total=(precios[4]*cantidad);
                             System.out.println("Su valor final de compra sera"+ "   "+total);
                             System.out.println("-------------------------------------------------");
                            }
                   break;
                 }//cierre de menu
                    if (ref<1  || ref>5){
                     System.out.println("-------------------------------------------------");   
                     System.out.println("Referencia no existente---INTENTE DE NUEVO");
                     System.out.println("-------------------------------------------------");
                    }
          
                } //cierre de segundo if
                
                System.out.println("-------------------------------------------------");   
                System.out.println("¿DESEA COMPRAR LIBRO?");   
                System.out.println("-------------------------------------------------");   
                System.out.println("1-SI");   
                System.out.println("2-NO");   
                System.out.println("-------------------------------------------------");   
                desea=sc.nextInt();
                
                if(desea==2){
                    System.out.println("-------------------------------------------------");
                    System.out.println("Se ha finalizado la compra");
                    System.out.println("-------------------------------------------------");
                
                }
                
     }  while(desea==1);
 }

}