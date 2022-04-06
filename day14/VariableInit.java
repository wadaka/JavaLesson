import java.util.*;
public class VariableInit{
	public static void main(String[] args){
		/* NG
		int n;
		System.out.println(n);
		*/
		/* Javaは条件式に入っている変数を調査しない
		int n;
		int x=5;
		if(x>0){
			n=10;
		}
		System.out.println(n);
		*/
		/* OK
		int n;
		if(5>0){
			n=10;
		}
		System.out.println(n);
		*/
		/* if ~else文はどちらか一方を通ることが保証されている文なので
		int n;
		int x=5;
		if(x>0){
			n=10;
		}else{
			n=20;
		}
		System.out.println(n);
		*/
		/* NG
		int n;
		int x=5;
		if(x>0){
			n=20;
		}else if(x <=0){
			n=20;
		}
		System.out.println(n);
		*/
		/* OK
		int n;
		int x=5;
		if(x>0){
			n=10;
		}else if(x<0){
			n=20;
		}else{
			n=30;
		}
		System.out.println(n);
		*/
		/* NG
		int n;
		int x=5;
		if(x>0){
			n=10;
		}else if(x<0){
			//n=20;
		}else{
			n=30;
		}
		System.out.println(n);
		*/
		/* NG
		int n=new Random.nextInt(3);
		String fortune;
		switch(n){
			case 0:
				fortune="大吉"
				break;
			case 1:
				fortune="吉"
				break;
			case 2:
				fortune="凶"
				break;
		}
		System.out.println(n);
		*/
		/* OK
		int n=new Random.nextInt(3);
		String fortune;
		switch(n){
			case 0:
				fortune="大吉"
				break;
			case 1:
				fortune="吉"
				break;
			default:
				fortune="凶"
				break;
		}
		System.out.println(n);
		*/
		/* OK
		int n;
		if(true){
			n=20;
		}
		System.out.println(n);
		*/
		/* NG 変数なのでOUT
		int n;
		boolean isOk=true;
		if(isOK){
			n=20;
		}
		System.out.println(n);
		*/
		/* OK do ~whileは最低1回通ることが保証されている文
		int n;
		do{
			n=10;
		}while(false);
		System.out.println(n);
		*/
		/* OK
		int n;
		for(;;){
			n=3;
			break;
		}
		System.out.println(n);
		*/
		/* NG 継続条件に変数が入ってる
		int n;
		for(int i=0;i<10;I++){
			n=3;
		}
		System.out.println(n);
		*/
	}
}
