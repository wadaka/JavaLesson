import java.util.*;
public class StringMethod{
	public static void main(String[] args){
		String fruits="apple";
		System.out.println(fruits.length());//文字数をしらべーる
		for(int i=0;i<fruits.length();i++){
			System.out.println(fruits.charAt(i));
		}
		char[] data=fruits.toCharArray();
		System.out.println(Arrays.toString(data));
		if(fruits.contains("pp")){
			System.out.println("ppを含みます");
		}
		if(fruits.equals("apple")){
			System.out.println("appleと等しい");
		}
		if(fruits.equalsIgnoreCase("apple")){
			System.out.println("appleと等しい");
		}
		if(fruits.equals("12")){
			System.out.println("12と等しい");
		}
		//大文字変換
		String str = fruits.toUpperCase();
		System.out.println(str);
		System.out.println(fruits.toUpperCase());
		//小文字変換
		System.out.println(fruits.toLowerCase());
		if(fruits.startsWith("a")){
			System.out.println("aで始まります");
		}
		if(fruits.endsWith("e")){
			System.out.println("eで終わります");
		}
		String str2 = fruits.substring(0,3);
		System.out.println(str2);//app
		//String str3 = fruits.substring(2,4);
		//System.out.ptintln(str3);//pl
		String str4 = fruits.substring(0,fruits.length()-1);
		System.out.println(str4);
		//aから１０個(a,b,c,?......)
		char[] chars=new char[10];
		char alph = 'a';
		for(int i=0;i<chars.length;i++){
			chars[i]=alph;
			alph += 1;
		}
		System.out.println(Arrays.toString(chars));
		char[] hirachars= new char[10];
		char hira = 'あ';
		for(int i=0;i<hirachars.length;i++){
			hirachars[i]=hira;
			hira += 1;
		}
		System.out.println(Arrays.toString(hirachars));
	}
}
