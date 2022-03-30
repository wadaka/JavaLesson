import java.util.*;
public class ArrLesson2{
	public static void main(String[] args){
		int[] data = new int[5];
		System.out.println(data[0]);
		System.out.println(data.length);
		//先頭の要素に100代入
		data[0] = 100;
		//5
		data[data.length -1] = 150;
		data[2] = 120;
		data[0] = data[2] - data[0];
		System.out.println(data[1]);
	}
}
