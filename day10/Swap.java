import java.util.*;
public class Swap{
	public static void main(String[] args){
		int a=10;
		int b=20;
		/*
		 *処理
		 */
		//"a:20,b:10"、aとbの値を交換する
		//2値の交換アルゴリズム
		//int temp = a;
		a = b;
		//b = temp;
		System.out.println("a:"+a+",b:"+b);
		int[] data={3,1,5,2,4};
		//配列の並びを逆にしてください
		/*
		int[] temp=new int[data.length];
		for(int i=0;i<data.length;i++){
			temp[i]=data[data.length-1-i];
		} */
		System.out.println(Arrays.toString(data));//[3,1,5,2,4]
		for(int i=0;i<data.length/2;i++){
			int temp=data[i];
			data[i]=data[data.length-1 -i];
			data[data.length-1-i]=temp;
		}
		System.out.println(Arrays.toString(data));//[4,2,5,1,3]
	}
}
