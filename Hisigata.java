//ひし形
//星と空欄を合わせて出力

package sample;

public class Hisigata {

	public static void main(String[] args) {
		//縦の数
		int lin = 5;

		//中央値を求める
		int cen = (lin - 1) / 2;

		//出力
		for (int i = 0; i < lin; i++) {
			//中央値からの差を求める
			int diff = Math.abs(cen - i);

			//空欄の数を求める
			//空欄の数は中央値からの差が当てはまる
			String space = "";
			for (int s = 0; s < diff; s++) {
				space += "　";
			}

			//星の数を求める
			int str_count = lin - diff * 2;

			//星の出力
			String str = "";
			for (int h = 0; h < str_count; h++) {
				str += "★";
			}

			//画面出力
			System.out.println(space + str + space);
		}
	}
}
