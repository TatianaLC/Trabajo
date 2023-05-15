
/**
 * Write a description of class editorial_POO here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class editorial_POO
{
    public static void main(String[] args){
   Scanner sc = new Scanner (System.in);   
         String dis,dis2,dis3;
         int opc,cantidad,contenido, desea=0;
         int ref;
         double valorfinal,total;
         
         
         
         Libros [] libro = new Libros[5];
         
         libro[0]= new Libros (50000, 100,0);
         libro[1]= new Libros (65000, 100,0);
         libro[2]= new Libros (48000, 100,0);
         libro[3]= new Libros (68000, 100,0);
         libro[4]= new Libros (80000, 100,0);
         
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
                 System.out.println("1       Matemáticas II"+"        $"+ libro[0].precios+"         "+libro[0].cantidades);
                 System.out.println("2       Sociales  IV"+"          $"+ libro[1].precios+"         "+libro[1].cantidades);
                 System.out.println("3       Civismo  XI"+"           $"+ libro[2].precios+"         "+libro[2].cantidades);
                 System.out.println("4       Biología X"+"            $"+ libro[3].precios+"         "+libro[3].cantidades);
                 System.out.println("5       Ética  VII"+"            $"+ libro[4].precios+"         "+libro[4].cantidades);
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
                          libro[0].cantidades=libro[0].cantidades-cantidad;
                          libro[0].unidades=libro[0].unidades+cantidad;
                         
                         
                          System.out.println("-------------------------------------------------");
                          System.out.println("             GENERACIÒN DE FACTURA");
                          System.out.println("-------------------------------------------------");
                          System.out.println("-------------------------------------------------");
                          System.out.println("LIBRO    Matemáticas II");
                          System.out.println("PRECIO UNIDAD"+"     "+ libro[0].precios);
                          System.out.println("CANTIDAD DE INVENTARIO RESTANTE"+"   "+libro[0].cantidades);
                          total=(libro[0].precios*cantidad);
                          System.out.println("Precio total:"+"    "+ total);
                          System.out.println("-------------------------------------------------");
                         }
                         if (cantidad>29)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted tendra un descuento del 40% en su compra");
                             total=(libro[0].precios*cantidad);
                             valorfinal=(total *40)/100;
                             System.out.println("Su valor final de compra sera"+ "   "+valorfinal);
                             System.out.println("-------------------------------------------------");
                            }
                         if (cantidad>19 && cantidad<21)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted tendra un descuento del 30% en su compra");
                             total=(libro[0].precios*cantidad);
                             valorfinal=(total *30)/100;
                             System.out.println("Su valor final de compra sera"+ "   "+valorfinal);
                             System.out.println("-------------------------------------------------");
                            }
                         if (cantidad<20)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted no tendra un descuento  en su compra");
                             total=(libro[0].precios*cantidad);
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
                          libro[1].cantidades=libro[1].cantidades-cantidad;
                          libro[1].unidades=libro[1].unidades+cantidad;
                         
                         
                          System.out.println("-------------------------------------------------");
                          System.out.println("             GENERACIÒN DE FACTURA");
                          System.out.println("-------------------------------------------------");
                          System.out.println("-------------------------------------------------");
                          System.out.println("LIBRO    Sociales  IV");
                          System.out.println("PRECIO UNIDAD"+"     "+ libro[1].precios);
                          System.out.println("CANTIDAD DE INVENTARIO RESTANTE"+"   "+libro[1].cantidades);
                          total=(libro[1].precios*cantidad);
                          System.out.println("Precio total:"+"    "+ total);
                          System.out.println("-------------------------------------------------");
                         }
                         if (cantidad>29)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted tendra un descuento del 40% en su compra");
                             total=(libro[1].precios*cantidad);
                             valorfinal=(total *40)/100;
                             System.out.println("Su valor final de compra sera"+ "   "+valorfinal);
                             System.out.println("-------------------------------------------------");
                            }
                         if (cantidad>19 && cantidad<21)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted tendra un descuento del 30% en su compra");
                             total=(libro[1].precios*cantidad);
                             valorfinal=(total *30)/100;
                             System.out.println("Su valor final de compra sera"+ "   "+valorfinal);
                             System.out.println("-------------------------------------------------");
                            }
                         if (cantidad<20)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted no tendra un descuento  en su compra");
                             total=(libro[1].precios*cantidad);
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
                             libro[2].cantidades=libro[2].cantidades-cantidad;
                             libro[2].unidades=libro[2].unidades+cantidad;
                             
                             
                             System.out.println("-------------------------------------------------");
                             System.out.println("             GENERACIÒN DE FACTURA");
                             System.out.println("-------------------------------------------------");
                             System.out.println("-------------------------------------------------");
                             System.out.println("LIBRO   Civismo  XI");
                             System.out.println("PRECIO UNIDAD"+"     "+ libro[2].precios);
                             System.out.println("CANTIDAD DE INVENTARIO RESTANTE"+"   "+libro[2].cantidades);
                             total=(libro[2].precios*cantidad);
                             System.out.println("Precio total:"+"    "+ total);
                             System.out.println("-------------------------------------------------");
                         }
                         if (cantidad>29)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted tendra un descuento del 40% en su compra");
                             total=(libro[2].precios*cantidad);
                             valorfinal=(total *40)/100;
                             System.out.println("Su valor final de compra sera"+ "   "+valorfinal);
                             System.out.println("-------------------------------------------------");
                            }
                         if (cantidad>19 && cantidad<21)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted tendra un descuento del 30% en su compra");
                             total=(libro[2].precios*cantidad);
                             valorfinal=(total *30)/100;
                             System.out.println("Su valor final de compra sera"+ "   "+valorfinal);
                             System.out.println("-------------------------------------------------");
                            }
                         if (cantidad<20)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted no tendra un descuento  en su compra");
                             total=(libro[2].precios*cantidad);
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
                          libro[3].cantidades=libro[3].cantidades-cantidad;
                          libro[3].unidades=libro[3].unidades+cantidad;
                         
                         
                          System.out.println("-------------------------------------------------");
                          System.out.println("             GENERACIÒN DE FACTURA");
                          System.out.println("-------------------------------------------------");
                          System.out.println("-------------------------------------------------");
                          System.out.println("LIBRO    Biología X");
                          System.out.println("PRECIO UNIDAD"+"     "+ libro[3].precios);
                          System.out.println("CANTIDAD DE INVENTARIO RESTANTE"+"   "+libro[3].cantidades);
                          total=(libro[3].precios*cantidad);
                          System.out.println("Precio total:"+"    "+ total);
                          System.out.println("-------------------------------------------------");
                         }
                         if (cantidad>29)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted tendra un descuento del 40% en su compra");
                             total=(libro[3].precios*cantidad);
                             valorfinal=(total *40)/100;
                             System.out.println("Su valor final de compra sera"+ "   "+valorfinal);
                             System.out.println("-------------------------------------------------");
                            }
                         if (cantidad>19 && cantidad<21)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted tendra un descuento del 30% en su compra");
                             total=(libro[3].precios*cantidad);
                             valorfinal=(total *30)/100;
                             System.out.println("Su valor final de compra sera"+ "   "+valorfinal);
                             System.out.println("-------------------------------------------------");
                            }
                         if (cantidad<20)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted no tendra un descuento  en su compra");
                             total=(libro[3].precios*cantidad);
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
                          libro[4].cantidades=libro[4].cantidades-cantidad;
                          libro[4].unidades=libro[4].unidades+cantidad;
                         
                         
                          System.out.println("-------------------------------------------------");
                          System.out.println("             GENERACIÒN DE FACTURA");
                          System.out.println("-------------------------------------------------");
                          System.out.println("-------------------------------------------------");
                          System.out.println("LIBRO     Ética  VII");
                          System.out.println("PRECIO UNIDAD"+"     "+ libro[4].precios);
                          System.out.println("CANTIDAD DE INVENTARIO RESTANTE"+"   "+libro[4].cantidades);
                          total=(libro[4].precios*cantidad);
                          System.out.println("Precio total:"+"    "+ total);
                          System.out.println("-------------------------------------------------");
                         }
                         if (cantidad>29)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted tendra un descuento del 40% en su compra");
                             total=(libro[4].precios*cantidad);
                             valorfinal=(total *40)/100;
                             System.out.println("Su valor final de compra sera"+ "   "+valorfinal);
                             System.out.println("-------------------------------------------------");
                            }
                         if (cantidad>19 && cantidad<21)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted tendra un descuento del 30% en su compra");
                             total=(libro[4].precios*cantidad);
                             valorfinal=(total *30)/100;
                             System.out.println("Su valor final de compra sera"+ "   "+valorfinal);
                             System.out.println("-------------------------------------------------");
                            }
                         if (cantidad<20)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted no tendra un descuento  en su compra");
                             total=(libro[4].precios*cantidad);
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
                 System.out.println("1       Matemáticas II"+"        $"+ libro[0].precios+"         "+libro[0].cantidades);
                 System.out.println("2       Sociales  IV"+"          $"+ libro[1].precios+"         "+libro[1].cantidades);
                 System.out.println("3       Civismo  XI"+"           $"+ libro[2].precios+"         "+libro[2].cantidades);
                 System.out.println("4       Biología X"+"            $"+ libro[3].precios+"         "+libro[3].cantidades);
                 System.out.println("5       Ética  VII"+"            $"+ libro[4].precios+"         "+libro[4].cantidades);
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
                          libro[0].cantidades=libro[0].cantidades-cantidad;
                          libro[0].unidades=libro[0].unidades+cantidad;
                         
                         
                          System.out.println("-------------------------------------------------");
                          System.out.println("             GENERACIÒN DE FACTURA");
                          System.out.println("-------------------------------------------------");
                          System.out.println("-------------------------------------------------");
                          System.out.println("LIBRO    Matemáticas II");
                          System.out.println("PRECIO UNIDAD"+"     "+ libro[0].precios);
                          System.out.println("CANTIDAD DE INVENTARIO RESTANTE"+"   "+libro[0].cantidades);
                          total=(libro[0].precios*cantidad);
                          System.out.println("Precio total:"+"    "+ total);
                          System.out.println("-------------------------------------------------");
                         }
                         if (cantidad>29)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted tendra un descuento del 40% en su compra");
                             total=(libro[0].precios*cantidad);
                             valorfinal=(total *40)/100;
                             System.out.println("Su valor final de compra sera"+ "   "+valorfinal);
                             System.out.println("-------------------------------------------------");
                            }
                         if (cantidad>19 && cantidad<21)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted tendra un descuento del 30% en su compra");
                             total=(libro[0].precios*cantidad);
                             valorfinal=(total *30)/100;
                             System.out.println("Su valor final de compra sera"+ "   "+valorfinal);
                             System.out.println("-------------------------------------------------");
                            }
                         if (cantidad<20)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted no tendra un descuento  en su compra");
                             total=(libro[0].precios*cantidad);
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
                          libro[1].cantidades=libro[1].cantidades-cantidad;
                          libro[1].unidades=libro[1].unidades+cantidad;
                         
                         
                          System.out.println("-------------------------------------------------");
                          System.out.println("             GENERACIÒN DE FACTURA");
                          System.out.println("-------------------------------------------------");
                          System.out.println("-------------------------------------------------");
                          System.out.println("LIBRO    Sociales  IV");
                          System.out.println("PRECIO UNIDAD"+"     "+ libro[1].precios);
                          System.out.println("CANTIDAD DE INVENTARIO RESTANTE"+"   "+libro[1].cantidades);
                          total=(libro[1].precios*cantidad);
                          System.out.println("Precio total:"+"    "+ total);
                          System.out.println("-------------------------------------------------");
                         }
                         if (cantidad>29)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted tendra un descuento del 40% en su compra");
                             total=(libro[1].precios*cantidad);
                             valorfinal=(total *40)/100;
                             System.out.println("Su valor final de compra sera"+ "   "+valorfinal);
                             System.out.println("-------------------------------------------------");
                            }
                         if (cantidad>19 && cantidad<21)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted tendra un descuento del 30% en su compra");
                             total=(libro[1].precios*cantidad);
                             valorfinal=(total *30)/100;
                             System.out.println("Su valor final de compra sera"+ "   "+valorfinal);
                             System.out.println("-------------------------------------------------");
                            }
                         if (cantidad<20)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted no tendra un descuento  en su compra");
                             total=(libro[1].precios*cantidad);
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
                             libro[2].cantidades=libro[2].cantidades-cantidad;
                             libro[2].unidades=libro[2].unidades+cantidad;
                             
                             
                             System.out.println("-------------------------------------------------");
                             System.out.println("             GENERACIÒN DE FACTURA");
                             System.out.println("-------------------------------------------------");
                             System.out.println("-------------------------------------------------");
                             System.out.println("LIBRO     Civismo  XI");
                             System.out.println("PRECIO UNIDAD"+"     "+ libro[2].precios);
                             System.out.println("CANTIDAD DE INVENTARIO RESTANTE"+"   "+libro[2].cantidades);
                             total=(libro[2].precios*cantidad);
                             System.out.println("Precio total:"+"    "+ total);
                             System.out.println("-------------------------------------------------");
                         }
                         if (cantidad>29)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted tendra un descuento del 40% en su compra");
                             total=(libro[2].precios*cantidad);
                             valorfinal=(total *40)/100;
                             System.out.println("Su valor final de compra sera"+ "   "+valorfinal);
                             System.out.println("-------------------------------------------------");
                            }
                         if (cantidad>19 && cantidad<21)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted tendra un descuento del 30% en su compra");
                             total=(libro[2].precios*cantidad);
                             valorfinal=(total *30)/100;
                             System.out.println("Su valor final de compra sera"+ "   "+valorfinal);
                             System.out.println("-------------------------------------------------");
                            }
                         if (cantidad<20)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted no tendra un descuento  en su compra");
                             total=(libro[2].precios*cantidad);
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
                          libro[3].cantidades=libro[3].cantidades-cantidad;
                          libro[3].unidades=libro[3].unidades+cantidad;
                         
                         
                          System.out.println("-------------------------------------------------");
                          System.out.println("             GENERACIÒN DE FACTURA");
                          System.out.println("-------------------------------------------------");
                          System.out.println("-------------------------------------------------");
                          System.out.println("LIBRO    Biología X");
                          System.out.println("PRECIO UNIDAD"+"     "+ libro[3].precios);
                          System.out.println("CANTIDAD DE INVENTARIO RESTANTE"+"   "+libro[3].cantidades);
                          total=(libro[3].precios*cantidad);
                          System.out.println("Precio total:"+"    "+ total);
                          System.out.println("-------------------------------------------------");
                         }
                         if (cantidad>29)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted tendra un descuento del 40% en su compra");
                             total=(libro[3].precios*cantidad);
                             valorfinal=(total *40)/100;
                             System.out.println("Su valor final de compra sera"+ "   "+valorfinal);
                             System.out.println("-------------------------------------------------");
                            }
                         if (cantidad>19 && cantidad<21)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted tendra un descuento del 30% en su compra");
                             total=(libro[3].precios*cantidad);
                             valorfinal=(total *30)/100;
                             System.out.println("Su valor final de compra sera"+ "   "+valorfinal);
                             System.out.println("-------------------------------------------------");
                            }
                         if (cantidad<20)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted no tendra un descuento  en su compra");
                             total=(libro[3].precios*cantidad);
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
                          libro[4].cantidades=libro[4].cantidades-cantidad;
                          libro[4].unidades=libro[4].unidades+cantidad;
                         
                         
                          System.out.println("-------------------------------------------------");
                          System.out.println("             GENERACIÒN DE FACTURA");
                          System.out.println("-------------------------------------------------");
                          System.out.println("-------------------------------------------------");
                          System.out.println("LIBRO    Ética  VII");
                          System.out.println("PRECIO UNIDAD"+"     "+ libro[4].precios);
                          System.out.println("CANTIDAD DE INVENTARIO RESTANTE"+"   "+libro[4].cantidades);
                          total=(libro[4].precios*cantidad);
                          System.out.println("Precio total:"+"    "+ total);
                          System.out.println("-------------------------------------------------");
                         }
                         if (cantidad>29)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted tendra un descuento del 40% en su compra");
                             total=(libro[4].precios*cantidad);
                             valorfinal=(total *40)/100;
                             System.out.println("Su valor final de compra sera"+ "   "+valorfinal);
                             System.out.println("-------------------------------------------------");
                            }
                         if (cantidad>19 && cantidad<21)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted tendra un descuento del 30% en su compra");
                             total=(libro[4].precios*cantidad);
                             valorfinal=(total *30)/100;
                             System.out.println("Su valor final de compra sera"+ "   "+valorfinal);
                             System.out.println("-------------------------------------------------");
                            }
                         if (cantidad<20)
                         {
                             System.out.println("-------------------------------------------------");
                             System.out.println("Señor usuario usted no tendra un descuento  en su compra");
                             total=(libro[4].precios*cantidad);
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
