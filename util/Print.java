package util;
import java.util.Arrays;
/**Clase para imprimir archivos*/
public class Print{
   /**Metodo estatico que imprime un objeto*/
   public static void p(Object o){
   System.out.println(o.toString());
   }
   /**Metodo estatico que imprime un entero*/ 
   public static void p(int i){
   System.out.println(i);
   }
   /**Metodo estatico que imprime un double*/
   public static void p(double i){
   System.out.println(i);
   }
   /**Metodo estatico que imprime un arreglo de objetos*/
   public static void p(Object[]a){
   System.out.println(Arrays.toString(a));
   }
   /**Metodo estatico que imprime un arreglo de ints*/
   public static void p(int []a){
   System.out.println(Arrays.toString(a));
   }	
   /**Metodo estatico que imprime un arreglo de doubles*/
   public static void p(double[]a){
   System.out.println(Arrays.toString(a));
   }

}
