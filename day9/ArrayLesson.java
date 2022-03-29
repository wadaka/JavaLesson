import java.util.*;
public class ArrayLesson{
	public static void main(String[] args){
		/*
		 * 配列(Array):値をまとまった塊として扱う技術
		 * */
		System.out.print("手を入力(0:グー,1:チョキ,2:パー)>>");
		int you = new Scanner(System.in).nextInt();
		String[] hands={"グー","チョキ","パー"};
		int pc = new Random().nextInt(hands.length);
		System.out.printf("あなたは%s,PCは%s%n", hands[you],hands[pc]);//
		if(pc == you){
			System.out.println("あいこ");
		}else if ((you+3 -pc)%3 ==2){
			System.out.println("あなたの勝ち");
		}else{
			System.out.println("あなたの負け");
		}
	}
}
