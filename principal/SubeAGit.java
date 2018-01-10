package principal;
import static util.Print.*;
import static util.ManejadorDeArchivos.*;
import static util.MyString.*;
import util.Dupla;
import util.Punto;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**@version 1.0
   @author Antonio Martinez Cruz*/
public class SubeAGit{
	private String agrega = "git add .\n";
	private String sube = "git push\n";
	private String comentario;
	
	public SubeAGit(String comentario){
		this.comentario = comentario; 		
	}
	
	public String ponMensaje(){
		 return "git commit -m \""+comentario+"\"\n";				
	}	

	public SubeAGit(String agrega,String sube){
		this.agrega=agrega;
		this.sube=sube;
	}

	 public String getAgrega(){
		return agrega;
	}
	 public void setAgrega(){
		this.agrega=agrega;
	}
	 public String getSube(){
		return sube;
	}
	 public void setSube(){
		this.sube=sube;
	}

	public String subir(){
		return getAgrega()+
		       ponMensaje()+
		       getSube(); 	
	}
	public static void main(String [] args){
		escribe("tmp",new SubeAGit(stdin()).subir());
	}
}
