public class Hensu{
	public static void main(String[] args){
		//変数宣言(Integer:整数)
		int money;
		money=100;//代入演算子(右辺の値を左辺の変数に代入する)
		System.out.println("所持金:"+money);
		System.out.println("50円拾った");
		money = money +50;
		System.out.println("所持金:" + money);	
		System.out.println("ラッキー！1000円こずかいをもらった！");
		money = money +1000;
		System.out.println("所持金:" + money);	

		System.out.println("500円の牛丼を食べ申した");
		money = money -500;
		System.out.println("所持金:" + money);	
	}
}
