import java.util.*;
public class Ball{
	public static void main(String[] args){
		int[] balls={1,2,3,4,5};
		for(int i=0;balls.length-1<0;i++){
			int index = new Random().nextInt(ball.length-i)+i;
			int tmp = balls[index];
			balls[index] = balls[i];
			balls[index] = tmp;
		}
		System.out.println(Arrays.toString(balls));
	}
}
