package principal;
import static util.Print.*;
import static util.ManejadorDeArchivos.*;
import static util.MyString.*;
import util.Dupla;
import util.Punto;
/**@version 1.0
   @author Antonio Martinez Cruz*/
public class Depurador{
	private String cadena;

	public Depurador(){
	}

	public Depurador(String cadena){
		this.cadena=cadena;
	}

	 public String getCadena(){
		return cadena;
	}
	 public void setCadena(){
		this.cadena=cadena;
	}

	public String depura(){
		String [] acentos ={ "á","é","í","ó","ú","\n"};
		String [] latex = {"\\\\'a","\\\\'e","\\\\'i","\\\\'o","\\\\'u"," "};
		for(int i =0;i<acentos.length;i++){
			cadena = cadena.replaceAll(acentos[i],latex[i]);			
		}
		return cadena;
	}
	public static void main(String [] args){
		escribe(args[0],new Depurador(lee(args[0])).depura());
	}
}
