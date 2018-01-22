package principal;
import static util.Print.*;
import static util.ManejadorDeArchivos.*;
import static util.MyString.*;
import util.Dupla;
import util.Punto;
/**@version 1.0
   @author Antonio Martinez Cruz*/
public class Nueva{
	private int i;
	private int j;
	private String cadena;

	public Nueva(){
	}

	public Nueva(int i,int j,String cadena){
		this.i=i;
		this.j=j;
		this.cadena=cadena;
	}

	 public int getI(){
		return i;
	}
	 public void setI(){
		this.i=i;
	}
	 public int getJ(){
		return j;
	}
	 public void setJ(){
		this.j=j;
	}
	 public String getCadena(){
		return cadena;
	}
	 public void setCadena(){
		this.cadena=cadena;
	}
	public static void main(String [] args){
Nueva nueva= new Nueva();
	}
}
