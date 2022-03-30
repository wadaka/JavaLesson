import java.util.*;
public class ArrLesson1{
	public static void main(String[] args){
		final int[] nums= new int[3];
		//nums = new int[5];numsには代入できない、ただ、int[]の配列の中身は代入可
		System.out.println(nums.length);//3
		System.out.println(nums[0]);//0
		System.out.println(nums[1]);//1
		System.out.println(nums[2]);//2
		//System.out.println(nums[3]);//実行時エラー
		//値を入れる
		nums[0]=10;
		nums[1]=20;
		nums[2]=30;
		//値を見る
		System.out.println(nums[0]);
		nums[0] = nums[1]+nums[2];
		System.out.println(nums[0]);//50
	}
}
