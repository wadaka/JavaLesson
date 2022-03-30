import java.util.*;
public class ArrLesson3{
	public static void main(String[] args){
		/*
		//下の書き方だと、初期化までしなければならない
		//代入する値が決まってるときは、↓の書き方のほうが記述が短くて済む
		//↓ちなみに、dataAはnew int[]で再代入できる。この書き方では代入が受け付けなくなるわけではない。
		int[] dataA={3,5,10};
		//int[] dataB=new int[]{4,6,10}
		//↓の表記だと、後々で配列に値を代入できる
		//代入する値が決まってないときは、↓の形で宣言するといい。
		int[] dataB;
		dataB=new int[]{4.6.10};
		//↓の処理により、dataBに新しい配列が入った
		//このため、↑のアドレスは未使用の状態となるため、破棄される？
		dataB=new int[]{7,7,7};*/
		int[] dataA={3,5,10};
		int[] dataB=new int[]{4,6,10};
		//普通のfor文
		for(int i=0;i<dataA.length;i++){
			System.out.println(dataA[i]);
		}
		//拡張for文
		//配列を走査する（全部見る、調べる)
		//for(A : B)
		//Aは、配列の入っている方を指定する(intならint) nは適当な値を設定してるだけ
		//Bは、true or false を試行している
		//試行内容は、該当配列に"次"のデータが存在しているかを順繰りで確認。
		//３つのデータが入ってる配列なら、1番目のデータを見て、あればtrueで[]内を実行
		//実行後、2番目のデータをみて、あるからtrueで[]内を実行
		//３番目も同じことして、４番目のデータ参照時に、存在してないからfalseで処理ＥＮＤ
		for(int n:dataB){
			System.out.println(n);
		}
		//配列の中身を列挙
		System.out.println(Arrays.toString(dataA));
	}
}
