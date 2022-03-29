import java.util.*;
public class Kuku{
	public static void main(String[] args){
		System.out.print("Start>>");
		int st = new Scanner(System.in).nextInt();
		System.out.print("End>>");
		int end = new Scanner(System.in).nextInt();
		for (int i=st;i<=end;i++){
			for(int j=1;j<=9;j++){
				System.out.printf("%d*%d=%2d ",i,j,i*j);
				//System.out.printf(i+"*"+j+"=%2d ",i*j);
				//System.out.printf("%2d",i*j);
				//System.out.print(" ");
			}
			System.out.println();
		}
	}
}
