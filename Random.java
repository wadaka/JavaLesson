public class Random{
	public static void main(String[] args){
		int[][] rdms= new int[3][3];
		for(int i=0;i<rdms.length;i++){
			for(int j=0;j<rdms[i].length;j++){
				rdms[i][j] = new java.util.Random().nextInt(9)+1;
			}
			System.out.println(java.util.Arrays.toString(rdms[i]));
		}
	}
}
