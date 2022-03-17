import java.util.*;//「java.util.」を省略
public class Code2_14{
	public static void main(String[] args){
		int r = new Random().nextInt(90);//0~89の90個からランダムで一つの数字が決定
		//nextInt(6)+5
		//nextInt(大きい数-小さい数+1)+小さい数
		System.out.println("あなたはたぶん、" + r + "歳ですね？");
	}
}
