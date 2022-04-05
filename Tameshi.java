import java.util.*;
public class Tameshi{
	public static void main(String[] args){
		int[][] nums = new int[3][];
		System.out.println(nums[0]);
		int[][] nums2 = { {3,5},{4,2,1},{2}};
		int[][] nums3 = new int[3][];
		System.out.println(nums3[0]);
		nums3[0] = new int[]{3,5};
		System.out.println(nums3[0][1]);
		System.out.println(nums3[1]);
		//System.out.println(nums3[1][2]);
	}
}
