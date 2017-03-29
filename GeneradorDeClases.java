import static util.ManejadorDeArchivos.*;
import static util.Print.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class GeneradorDeClases{
  public static void main(String[]args){
	try{
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));	 
	 String nombreClase=br.readLine();
	 String texto="public class "+nombreClase+"{\n\tpublic static void main(String [] args){\n\t}\n}\n";
	 escribe(nombreClase+".java",texto);
	 }catch(Exception e){}
  }
}