
package pkgfinal;

import java.util.Scanner;

public class Final {

   
    public static void main(String[] args) {
      
       String principal="";
              
       //MENU 
       while (principal!="4"){
            limpiarpantalla(); 
            Scanner opcion = new Scanner(System.in);
            System.out.println();
            System.out.println("                                 Menú Principal                               ");
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            System.out.println();
            System.out.println("==============================");
            System.out.println("| 1. Ejercicio 1             |");
            System.out.println("| 2. Ejercicio 2             |");
            System.out.println("| 3. Ejercicio 3             |");
            System.out.println("| 4. Salir                   |");
            System.out.println("==============================");
            System.out.print("Ingrese la opción: ");
            principal=opcion.nextLine(); 
            
                switch (principal){
                    case "1" :
                       
                        Ejercicio1();
                        break;
                    case "2" :
                        
                        Ejercicio2();
                        break;
                    case "3" : 
                           System.out.println("No realizado");
                           System.out.println();
                            System.out.println("Para volver al Menu presione Enter");
                            new Scanner(System.in).nextLine();
                            limpiarpantalla();    
                        break;    
                    case "4" : 
                        limpiarpantalla();
                        System.exit(0);
                        break;       
                    default:
                        System.out.println("PORFAVOR INGRESE UNA OPCIÓN VALIDA");
                        System.out.println();
                        System.out.println("Para volver a seleccionar una opcion presione Enter");
                        new Scanner(System.in).nextLine();
                               
                }  
        } 
    }
     //LIMPIAR PANTALLA EN WINDOWS, MAC Y LINUX
    public static void limpiarpantalla() {
       try{
            String sistemaOperativo = System.getProperty("os.name");
            if(sistemaOperativo.contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            }else{
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
         
        }  catch(Exception  e){
            System.err.println("Error al limpiar la pantalla" + e.getMessage());
        }         
    }   
    public static void Ejercicio1(){
        limpiarpantalla();
        int numero1;
        int numero2;
        System.out.println("Ingrese dos numeros:");
        Scanner dato1 = new Scanner(System.in);
        numero1 = dato1.nextInt();
          Scanner dato2 = new Scanner(System.in);
        numero2=dato2.nextInt();
        
        if(numero1> numero2){
              System.out.println("El numero mayor es el "+numero1);

            }else if(numero1<numero2){
              System.out.println("El numero mayor es el "+numero2);  
            }
         System.out.println();
        System.out.println("Para volver al Menu presione Enter");
        new Scanner(System.in).nextLine();
        limpiarpantalla();    
    }
     public static void Ejercicio2(){
         limpiarpantalla();
      int espacio;
		int f;
		int i;
		int j;
		int k;
		int num;
		System.out.println("ingrese un numero: ");
                Scanner dato1 = new Scanner(System.in);
		num = dato1.nextInt();
		do {
			if (num%2==0) {
				System.out.println("ingrese un numero: ");
				
		                num = dato1.nextInt();
			}
		} while (num%2==0);
		i = 0;
		j = 0;
		k = 0;
		f = (num+1)/2;
		do {
			i = i+1;
			espacio = num-i;
			do {
				j = j+1;
				if (espacio>0) {
					do {
						System.out.print(" ");
						espacio = espacio-1;
					} while (espacio!=0);
				}
				System.out.print("*");
				if (i==1) {
					k = 0;
				} else {
					k = i-1;
				}
			} while (j!=i+k);
			System.out.println(" ");
			j = 0;
		} while (i!=f);

         System.out.println();
        System.out.println("Para volver al Menu presione Enter");
        new Scanner(System.in).nextLine();
        limpiarpantalla();    
    }
}
