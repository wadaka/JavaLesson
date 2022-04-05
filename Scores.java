public class Scores{
	public static void main(String[] args){
		int[][] rdms= new int[3][3];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				rdms[i][j] = new java.util.Random().nextInt(9)+1;
			}
			System.out.println(Arrays.toString(rdms[i]));
		}
	}
}
