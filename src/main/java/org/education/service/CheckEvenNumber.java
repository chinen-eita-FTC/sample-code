package org.education.service;

import org.education.utility.Calculator;

/**
 * サービスレイヤ：「入力値から偶数判定を行い、その結果を出力をするという要件」を満たすためのクラス
 */
public class CheckEvenNumber {

	final String IS_EVEN_NUMBER = "入力した値は偶数です。";
	final String IS_ODD_NUMBER = "入力した値は奇数です。";
	
	public void check(String[] inputs) {
		if(inputs.length <= 1) {
			throw new IllegalArgumentException(); 
		}
		int result = Calculator.sum(inputs);
		String message = (isEvenNumber(result)) ? IS_EVEN_NUMBER : IS_ODD_NUMBER;
		System.out.println(message);
	}

	private boolean isEvenNumber(int result) {
		return (result % 2 == 0);
	}
}
