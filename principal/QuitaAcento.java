package principal;
import static util.Print.*;
import static util.ManejadorDeArchivos.*;
import static util.MyString.*;
import util.Dupla;
import util.Punto;
/**@version 1.0
   @author Antonio Martinez Cruz*/
public class QuitaAcento{
	private String x;

	public static void main(String [] args){
		String s  = lee(args[0]);
		s = s.replaceAll("á","\\\\'a");
		s = s.replaceAll("é","\\\\'e");
		s = s.replaceAll("í","\\\\'i");
		s = s.replaceAll("ó","\\\\'o");
		s = s.replaceAll("ú","\\\\'u");
		escribe(args[0],s);	
	}
}
