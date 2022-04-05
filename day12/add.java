import java.util.*;
public class Add{
	public static void main(String[] args){
		System.out.print("整数をカンマ区切りで入力>>");
		String input = new Scanner(System.in).nextLine();
		String[] adds=input.split(",");
		int sum = 0;
		for(int i=0;i<adds.length;i++){
			sum += Integer.parseInt(adds[i]);
		}
		System.out.printf("合計は%dです。",sum);
	}
}
