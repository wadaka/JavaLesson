import java.util.*;
public class Seikai{
	public static void main(String[] args){
		System.out.print("幅(2~9)>>");
		int input = new Scanner(System.in).nextInt();
		boolean isWin = false;
		for(int i=0;i<3;i++){
			boolean isLine = true;
			int first=0;
			for(int j=0; j<input;j++){
				int n = new Random().nextInt(3)+1;
				//あたりチェッカー
				if(j==0){
					first=n;
				}else{
					if(first !=n){
						isLine=false;
					}
				}
				System.out.print(n);
			}
			if(isLine){
				isWin = true;
			}
			System.out.println();
		}
		System.out.println(isWin ? "当たり":"はずれ");
	}
}
