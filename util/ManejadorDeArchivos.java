package util;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
public class ManejadorDeArchivos{
	public static void escribe(String url,String texto){
    try{
	PrintWriter pw= new PrintWriter(new BufferedWriter(new FileWriter(new File(url))));
    pw.write(texto);
    pw.close();	
	}catch(Exception e){}		
	}
}

