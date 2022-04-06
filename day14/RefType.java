import java.util.*;
public class RefType{
	public static void main(String[] args){
		int a=10;
		int b=a;
		b++;
		System.out.println(a);
		System.out.println(b);

		int[] arrA = new int[]{3,5};
		int[] arrB = arrA;
		arrB[0]=100;
		System.out.println(arrA[0]);
		System.out.println(arrB[0]);

		int x =0;
		int[] arrC=null;
		System.out.println(arrC);

		int[] arrD = {1,2,3};
		arrD=new int[]{3,5,7};//元あった参照ポイント消滅(Garbage Collection)
		arrD=null;//参照ポイントを消す
		System.out.println(arrD[0]);
		System.out.println(arrD[1]);
		System.out.println(arrD[2]);
		
		int[] arrE = {2,3,4};
		int[] arrF = arrE;
		arrE = null;//arrEはポイントを手放したが、arrFは依然として保持しているので、消滅せず
		System.out.println(arrF[0]);


	}
}
