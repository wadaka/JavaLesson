public class NewRpg{
	public static void main(String[] args){
		String name="もずく";
		int hp=100;
		System.out.println("魚の大群があらわれた！");	
		System.out.println("魚の大群が"+name+"を襲う！");
		hp = hp -40;
		System.out.println(name+"に40のダメージ！");	
		System.out.println(name+"の生命力は"+"残り("+hp+")"+"となってしまった！");

		System.out.println("さらなる不幸が"+name+"を襲う！");
		hp = hp -140;
		System.out.println(name+"に140のダメージ！");	
		System.out.println(name+"の生命力は"+"残り("+hp+")"+"となってしまった！");
		
		System.out.println(name+"は");
		name = "'もくず'";
		System.out.println("海の"+name+"となってしまった…");
	}
}

