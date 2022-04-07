import java.util.*;
public class Lesson1{
	public static void main(String[] args){
		final int LINE_ROWS = 3;
		final int LINE_COLUMNS = 3;
		int[][] start= new int[LINE_ROWS][LINE_COLUMNS];
		for(int i=0;i<start.length;i++){
			for(int j=0;j<start[i].length;j++){
				start[i][j] = new Random().nextInt(3)+1;
				System.out.print(start[i][j]);
			}
			System.out.println();
		}
		int win = Same(start);
		System.out.printf(win !=0 ? "%d line win!":"Lose...",win);
	}
	public static int Same(int[][] arr){
		int missLine = 0;
		for(int i=0;i<arr.length;i++){
			int first = arr[i][0];
			for(int j=1;j<arr[i].length;j++){
				if(first != arr[i][j]){
					missLine ++;
					break;
				}
			}
		}
		return arr.length -missLine; 
	}
}
