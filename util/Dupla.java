import static util.MyString.*;
/**@version 1.0
   @author Antonio Martinez Cruz*/
public class Dupla<T,S>{
	private T fst;
	private S snd;
	
	Dupla(T fst,S snd){
		this.fst=fst;
		this.snd=snd;
	}
	
	public T fst(){
		return fst;
	}
	public void fst(T fst){
		this.fst=fst;
	}
	
	public S snd(){
		return snd;
	}
	public void snd(S snd){
		this.snd=snd;
	}
	public String toString(){
		return "("+str(fst)+","+str(snd)+")";
	}

}
