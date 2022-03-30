import java.util.*;
public class Dice{
	public static void main(String[] args){
		int[] result = new int[10];
		int n =0;
		for(int i=0; i<result.length; i++){
			n = new Random().nextInt(6)+1;
			result[i] = n;
			// result[i] = new Random().nextInt(6)+1;
		}
		System.out.println(Arrays.toString(result));
	}
}
