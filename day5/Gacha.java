import java.util.*;
public class Gacha{
	public static void main(String[] args){
		/*
			SSR 5%
			SR 10%
			R  20%
			N  65%
		 */
		System.out.println("エンターキーを押してください");
		new Scanner(System.in).nextLine();
		int seed = '木' + '村' + '彰' + '吾';
		int n = new Random(seed).nextInt(100);

		if(n < 5){
			System.out.println("SSR!");
		}else if(n < 15){
			System.out.println("SR!");
		}else if(n < 35){
			System.out.println("R");
		}else{
			System.out.println("N");
		}
	}
}
