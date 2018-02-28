package util;
import static util.MyString.*;
/**@version 1.0
   @author Antonio Martinez Cruz*/
public class Dupla<T,V>{
	public T fst;
	public V snd;
	
	public T getFirst(){
		return fst;	
	}

	public V getSecond(){
		return snd;	
	}

	public Dupla(T fst,V snd){
		this.fst=fst;
		this.snd=snd;
	}
	public String toString(){
		return "("+str(fst)+","+str(snd)+")";
	}

}
