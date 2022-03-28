import java.util.*;
public class PrintfLesson{
	public static void main(String[] args){
		System.out.println(Math.PI);
		System.out.printf("%.2f%n",Math.PI);
		System.out.println("Hello");

		int num =3405960;
		System.out.printf("%,d%n",num);

		String name="やまふぁ";
		int age = 23;
		System.out.printf("こんにちは%s(%d歳)さん！%n", name,age);
		System.out.printf("%,6d%n",34);
		System.out.printf("%,6d%n",2384);
		System.out.printf("%,6d%n",264);
		System.out.printf("%,6d%n",98234);
	}
}
