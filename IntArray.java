import static util.Print.*;
import static util.ManejadorDeArchivos.*;
/**@version 1.0
   @author Antonio Martinez Cruz*/
public class IntArray{
	int [] a;
	IntArray(int longitud){
		a=new int[longitud];	
		for(int i=0;i<a.length;i++)
			a[i]=i;
	}

	public static void main(String [] args){
		IntArray arreglo= new IntArray(10);
		p(arreglo.a);
	}
}
