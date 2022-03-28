import java.util.*;
public class Dice{
	public static void main(String[] args){
		int num =  new Random().nextInt(6)+1;
		String con;
		/*
		if(num %2 == 0){
			con = "偶数";
		}else{
			con = "奇数";
		}
		*/
		//条件演算子(三項演算子)
		String result = num % 2 == 0 ? "偶数":"奇数";
		System.out.printf("%dは、%sです%n",num,result);
		System.out.printf("%dは、%sです%n",num,num % 2 == 0 ? "偶数":"奇数");
	}
}
