import java.util.*;
public class Method1{
	public static void main(String[] args){
		int max = maxOf(3,8);
		System.out.println(max);
		double area = calcTriangleArea(7.0,2.8);
		System.out.println(area);
		boolean isSame= isSame(new int[]{3,3,3});
		if(isSame){
			System.out.println("要素はすべて等しい");
		}else{
			System.out.println("要素はすべて等しいわけではない");
		}
		int price =2800;
		int tax =10;
		int taxIn = calcTaxIn(price,tax);
		System.out.printf("定価%d円税率%d%%の税込み価格は%d円です。%n",price,tax,taxIn);
		System.out.print("身長(cm)>>");
		double height=new Scanner(System.in).nextDouble();
		System.out.print("体重(kg)>>");
		double weight=new Scanner(System.in).nextDouble();
		double bmi = calcBMI(weight,height);
		System.out.printf("BMI:%.2f%n",bmi);
	}
	//(int a,int bは仮引数)
	public static int maxOf(int a,int b){
		return a > b ? a:b;
	}
	public static double calcTriangleArea(double bottom,double height){
		return bottom * height /2;
		/*
		 * double area = bottom * height /2;
		 * retuen area;でも可
		 */
	}
	public static boolean isSame(int[] arr){
		int first=arr[0];
		for(int i=1;i<arr.length;i++){
			if(first != arr[i]){
				return false;
			}
		}
		return true;
	}
	public static int calcTaxIn(int price,int taxRate){
		int taxin = (int)(price * (1+taxRate/100d)); 
		return taxin;
	}
	public static double calcBMI(double weightKg,double heightCm){
		double bmi = weightKg / (heightCm/100 * heightCm/100);
		return bmi;
	}
}
