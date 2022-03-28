import java.util.*;
public class For1{
	public static void main(String[] args){
		System.out.print("いくつ>>");
		int input = new Scanner(System.in).nextInt();

		for(int i=0;i < input ;i++){
			System.out.print("*");
		}
		System.out.println();
	}
}
