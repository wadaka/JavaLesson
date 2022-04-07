import java.util.*;
public class Lesson1{
	public static void main(String[] args){

	}
	public static boolean isSame(int[] arr){
		int first=arr[0]; 
		for(int i=0;i<arr.length;i++){
			if(first != arr[i]){
				return dalse;
			}
		}
		return true;
	}
}
