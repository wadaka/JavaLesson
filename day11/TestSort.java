import java.util.*;
public class TestSort{
	public static void main(String[] args){
		System.out.print("人数>>");
		int input = new Scanner(System.in).nextInt();
		int[] scores = new int[input];
		//点数を決めるぞ！
		for(int i=0;i<scores.length;i++){
			scores[i] = new Random().nextInt(101);
		}
		//並び変えるぞ！
		for(int i=0;i<scores.length-1;i++){
			for(int j=i+1;j<scores.length;j++){
				if(scores[i]<scores[j]){
					int temp = scores[i];
					scores[i] = scores[j];
					scores[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(scores));
	}
}
