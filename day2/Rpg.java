public class Rpg{
	public static void main(String[] args){
		String name="ロト";
		int hp=100;
		System.out.println("スライムがあらわれた！");
		System.out.println("スライムの先制攻撃！");
		System.out.println(name + "は30のダメージを受けた!");
		hp = hp-30;
		System.out.println(name + "("+ hp +")");
		
		System.out.println("スライムの連続攻撃！");
		System.out.println(name + "は100のダメージを受けた!");
		hp = hp-100;
		
		System.out.println(name + "("+ hp +")");
		System.out.println(name + "はちからつきた");
		System.out.println("GameOver");
	}
}
