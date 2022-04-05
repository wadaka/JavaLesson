import java.util.*;
public class StringMethod2{
	public static void main(String[] args){
		String str="apple:orange:banana";
		//変換
		str = str.replace(":",",");
		System.out.println(str);
		//特定の文字列で区切って、配列化する(split=分ける)
		String[] data=str.split(",");
		System.out.println(Arrays.toString(data));
		//特定の文字列で配列をくっつける
		String result=String.join(" ",data);
		System.out.println(result);
	}
}
