import java.util.*;
public class DiceApp{
	public static void main(String[] args){
		/*
		 *さいころ振って、それが偶数か奇数かを判定する
		 (実行結果)
		 4は偶数です。
		 1は奇数です。
		 * */
		int dice = new Random().nextInt(6)+1;
		//int	even_judge = dice %2;
		/*
		if(even_judge == 0){
			System.out.println(dice + "は偶数です。");
		}else{
			System.out.println(dice + "は奇数です。");
		}
		*/

		if(dice % 2 == 0){
			System.out.println(dice + "は偶数です。");
		}else{
			System.out.println(dice + "は奇数です。");
		}
	}
}
