import java.util.*;
public class Rensyu{
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			for(int j=0;j<6;j++){
				switch(i){
					case 1:
					case 3:
					case 5:
						System.out.print("~");
						break;
					case 2:
						System.out.print(4*j+1 == " ☆彡");

						break;
					default:
						System.out.print("☆");
				}
			}
			System.out.println();
		}
	}
}
