package org.education.utility;

import java.util.Arrays;

/**
 * ユーティリティ：計算にのみ関心を置いた汎用クラス
 */
public class Calculator {
    
  /**
	 * 文字列群を数値に変化したうえで総和を算出
	 * @param targets 数値に変換可能な文字列群
   * @return 入力値の総和
	 */
	public static int sum(String[] targets) throws NumberFormatException {
		return Arrays.stream(targets).mapToInt(Integer::parseInt).sum();
	}
}