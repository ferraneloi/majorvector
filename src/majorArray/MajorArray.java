package majorArray;
import java.util.Scanner;

public class MajorArray {
 public static void main(String args[]){
	   int MaximArray=-9999;
	 
	int a[]=new int[6]; //declaration and instantiation
     
	 System.out.println("longitud de l'array args " + args.length);
     //imprimir l'array args d'esquerra cap a dreta
   
     
 	 Scanner sc = new Scanner(System.in);
     for(int i=0;i<a.length;i++)
     {
          System.out.println("Introdueix un número: ");
           a[i]= sc.nextInt(); 
     } 
    	 
     //imprimir l'array d'esquerra cap a dreta
     for(int i=0;i<a.length;i++)
     System.out.print(a[i]+" ");
   
 
     for(int i=0;i<a.length;i++)
      if (a[i]>MaximArray) MaximArray=a[i];   
     
     System.out.println("el valor màxim és " + MaximArray);
     
     //imprimir l'array en ordre invers ( de  dreta cap a esquerra )
     for(int i=a.length-1;i>=0;i--)
     System.out.print(a[i]+" ");
   
     
     
     System.out.println("Llistat d'arguments");
     for(int i=0;i<args.length;i++)
         System.out.print("argument" + i +" = " + args[i]+" "); 
	 
	System.out.println("Hola"); 
    
     
      }
 
}