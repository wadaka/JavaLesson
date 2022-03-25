import java.util.*;
public class WhileLesson{
	public static void main(String[] args){
		/*int n = 5;
		while(n>0){
			System.out.println(n);
			n--;
		}
		System.out.println("発射!");*/
		/*int count=0;
		while(true){
			count++;
			int n = new Random().nextInt(10);
			System.out.println(n);
			if(n == 7){
				break;
			}
		}
		System.out.println(count + "回目に7がでました。");*/
		/*
		 * ssr 1%
		 * sr  3%
		 * r  23%
		 * n  73%
		 * */
		int count=0;
		while(true){
			count++;
			int n = new Random().nextInt(100);
			if(n < 1){
				System.out.println("SSR!!");
				break;
			}else if(n < 4){
				System.out.println("SR!");
			}else if(n < 27){
				System.out.println("R");
			}else{
				System.out.println("N");
			}
		}
		System.out.println(count + "回目にSSRが出ました。");
	}
}
