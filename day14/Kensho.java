import java.util.*;
public class Kensho{
	public static void main(String[] args){
		System.out.print("何回戦やる？（偶数）>>");
		int inp = new Scanner(System.in).nextInt();
		int[] nums = new int[inp];
		for(int i=0;i<nums.length;i++){
			int one = new Random().nextInt(99)+1;
			int two = new Random().nextInt(99)+1;
			nums[i] = Math.max(one,two);
			System.out.printf("%d回目:ランダム生成された数字は「%2d」と「%2d」、「%2d」が大きい%n",i+1,one,two,nums[i]);
		}
		System.out.println("--比較終了！--");
		System.out.print("生き残った数字は【");

		for(int i=0;i<nums.length-1;i++){
			for(int j=1+i;j<nums.length;j++){
				if(nums[i] < nums[j]){
					int temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
				}
			}
			System.out.print(nums[i]+" ");
		}
		System.out.printf("%d】（降順）%n",nums[nums.length-1]);

		System.out.println("--再度比較!--");
		for(int i=0;i<nums.length;i++){
			int rdm = new Random().nextInt(nums.length-i)+i;
			int temp = nums[rdm];
			nums[rdm] = nums[i];
			nums[i] = temp;
		}
		int[] arrive_nums = new int[nums.length/2];
		for(int i=0;i<=nums.length-1;i+=2){
			int one = nums[i];
			int two = nums[i+1];
			arrive_nums[i/2] = Math.max(one,two);
			System.out.printf("%2d回目：選ばれた数字は「%2d」と「%2d」、「%2d」が大きい%n",i/2+1,one,two,arrive_nums[i/2]);
		}
		System.out.println("--比較終了！--");
		System.out.print("生き残った数字は【");
		for(int i=0;i<arrive_nums.length-1;i++){
			for(int j=1+i;j<arrive_nums.length;j++){
				if(arrive_nums[i]>arrive_nums[j]){
					int temp = arrive_nums[j];
					arrive_nums[j] = arrive_nums[i];
					arrive_nums[i] = temp;
				}
			}
			System.out.print(arrive_nums[i]+" ");
		}
		System.out.printf("%d】（昇順）%n",arrive_nums[arrive_nums.length-1]);
	}
}
