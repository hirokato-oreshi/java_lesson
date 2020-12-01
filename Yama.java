//星の数が増えて減る

package sample;

public class Yama {

	public static void main(String[] args) {
		//縦の数
		int lin = 5;

		//中央値を求める
		int cen = (lin - 1)  / 2 ;

		//出力
		for (int i = 0; i < lin; i++) {
			//中央値からの差で星の数を変える
			//中央値からの差を絶対値で求める
			int diff = Math.abs(cen - i);

			//出力する星の数を求める
			int str_count = (cen + 1) - diff;

			//星の出力
			String str = "";
			for (int r = 0; r < str_count; r++) {
				str += "★";
			}
			//画面出力
			System.out.println(str);
		}

	}
}


