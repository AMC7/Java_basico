package util;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**Clase que te sirve para escribir y para leer archivos
@author Antonio Martinez Cruz
@version 1.0
*/
public class ManejadorDeArchivos{
	/**Metodo que escribe un archivo dado un url y el texto a escribir
	@param url la url donde vamos a guardar el texto
	       texto texto donde guardaremos la url
	*/
	public static void escribe(String url,String texto){
    try{
	System.out.println(texto);
	PrintWriter pw= new PrintWriter(new BufferedWriter(new FileWriter(new File(url))));
    pw.write(texto);
    pw.close();	
	}catch(Exception e){
		e.printStackTrace();	
	}		
	}

	public static String stdin(){
		try{
	  		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String texto = "";
		    	String s = null;
			while ((s = in.readLine()) != null && s.length() != 0)
			texto += s+"\n";
			return texto;	
		}catch(Exception e ){
			e.printStackTrace();
		}
		return null;
	}
	/**Metodo que te recibe una url y te regresa un String con el texto que leiste*/
	public static String lee(String url){
	try{		
	String resultado="";	
	String texto="";	
	BufferedReader fr = new BufferedReader(new FileReader(new File(url)));
    while((texto=fr.readLine())!=null)
      	resultado+=texto+"\n";
	
	return resultado;
	}catch(Exception e){
		e.printStackTrace();	
	}
	return null;
	}
}

