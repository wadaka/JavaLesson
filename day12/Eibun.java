import java.util.*;
public class Eibun{
	public static void main(String[] args){
		System.out.print("英文>>");
		String input = new Scanner(System.in).nextLine();
		char[] words= input.toCharArray();
		for(int i=6;i<words.length+6;i++){
			System.out.print(words[i-6]);
			if(i%5 == 0){
				System.out.println("");
			}
		}
	}
}
