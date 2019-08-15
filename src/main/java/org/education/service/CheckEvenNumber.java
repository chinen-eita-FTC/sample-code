package org.education.service;

import org.education.utility.Calculator;

/**
 * サービスレイヤ：「入力値から偶数判定を行い、その結果を出力をするという要件」を満たすためのクラス
 */
public class CheckEvenNumber {

	// TODO[リファクタリング]：本来エントリに必要ない情報なので「定数クラス」や「リソースファイル」に移すこと
	final String IS_EVEN_NUMBER = "入力した値は偶数です。";

	final String IS_ODD_NUMBER = "入力した値は奇数です。";
	
	/**
	 * 入力値から偶数判定を行い、その結果を出力
	 * @param inputs 入力値
	 */
	public void check(String[] inputs) {
		if(inputs.length <= 1) {
			throw new IllegalArgumentException(); 
		}
		int result = Calculator.sum(inputs);
		String message = (isEvenNumber(result)) ? IS_EVEN_NUMBER : IS_ODD_NUMBER;
		System.out.println(message);
	}

	/**
	 * 偶数判定
	 * @param target 判定対象の数値
	 * @return true:偶数 false:奇数
	 */
	private boolean isEvenNumber(int target) {
		return (target % 2 == 0);
	}
}
