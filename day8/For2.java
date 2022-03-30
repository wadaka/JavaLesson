import java.util.*;
public class For2{
	public static void main(String[] args){
		System.out.print("いくつ>>");
		int input = new Scanner(System.in).nextInt();

		for(int i=0;i < input ;i++){
			for(int j=0;j<input ;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
