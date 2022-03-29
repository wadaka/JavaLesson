import java.util.*;
public class Haba2{
	public static void main(String[] args){
		System.out.print("幅(2~9)>>");
		int input = new Scanner(System.in).nextInt();
		int atari = 0;
		boolean AC = false;
		boolean LastAC = false;
		for(int i=0;i<3;i++){
			for(int j=0; j<input;j++){
				int r = new Random().nextInt(3)+1;
				System.out.print(r);
				//あたりチェッカー
				if(j==0){
					atari = r;
					AC = true;
				}else{
					if(AC == true){
						if(atari == r){
							AC = true;
						}else{
							AC = false;
						}
					}
				}
			}
			if(AC == true){
				LastAC = true;
				System.out.print("←〇");
			}
			System.out.println();
		}
		if(LastAC == true){
			System.out.println("当たり！");
		}
	}
}
