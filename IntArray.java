import static util.Print.*;
import static util.ManejadorDeArchivos.*;
import java.util.Arrays;
import java.util.Random;
import static java.lang.Math.*;
/**@version 1.0
   @author Antonio Martinez Cruz*/
public class IntArray{
	int [] a;
	IntArray(int longitud){
		a=new int[longitud];	
		for(int i=0;i<a.length;i++)
			a[i]=i;
	}
	IntArray(){
	  a=new int[15];
	  Random random= new Random();
	  for(int i=0;i<a.length;i++)
	  	a[i]=abs(random.nextInt()%30);
	}

	public String toString(){
		return Arrays.toString(a);
	}

	public int max(){
		int max=a[0];
		for(int i=0;i<a.length;i++)
			if(a[i]>max)
				max=a[i];
		return max;	
	}

	public int min(){
		int min=a[0];
		for(int i=0;i<a.length;i++)
			if(a[i]<min)
				min=a[i];
		return min;	
	}


	public static void main(String [] args){
		IntArray arreglo= new IntArray();
		p(arreglo);
		p(arreglo.max());
		p(arreglo.min());
	}
}
