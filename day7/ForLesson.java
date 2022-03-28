import java.util.*;
public class ForLesson{
	public static void main(String[] args){
		/*System.out.println("Start");
		for(int i=0;i<5;i++){
			System.out.println(i);
		}
		int sum =0;
		for(int i=10;i<=1000;i++){
			sum +=i;//sum = sum + i;
		}
		System.out.println(sum);
		System.out.println("END");
		for(int i=10;i>0;i--){
			System.out.println(i);
		}
		for(int i=0;i<10;i+=2){
			System.out.println(i);
		}
		for(int i=0;;i+=2){
			System.out.println(i);
		}
		System.out.print("小さい数>>");
		int s_num = new Scanner(System.in).nextInt();
		System.out.print("大きい数>>");
		int l_num = new Scanner(System.in).nextInt();
		int num = 0;
		int cal_num = s_num;
		for( ; cal_num < l_num + 1; cal_num++){
			num += cal_num;
		}
		System.out.println(s_num + "から" + l_num + "までの和は" + num + "です。");*/
		System.out.print("小さい数>>");
		int min = new Scanner(System.in).nextInt();
		System.out.print("大きい数>>");
		int max = new Scanner(System.in).nextInt();
		int sum = 0;
		for(int i=min ; i<=max ; i++){
			sum += i;
		}
		System.out.println(min + "から" + max + "までの和は" + sum + "です。");
	}
}
