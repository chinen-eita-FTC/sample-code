package org.education;

import org.education.service.CheckEvenNumber;

/**
 * エントリポイント：コンソールアプリケーション起動時に一番最初に実行されるクラス
 */
public class BootApp {
    
    // TODO[リファクタリング]：本来エントリに必要ない情報なので「定数クラス」や「リソースファイル」に移すこと
    final String FAILD_CONVERT_TO_INTGER = "[ERROR]入力値がint型へ変換できませんでした。入力値をもう一度ご確認ください。";
    final String Illegal_INPUT_VALUE = "[ERROR]入力値の個数は2個以上必要です。";
    final String UNEXPECTED_ERROR = "[ERROR]実装内容をご確認ください。";
    
    /**
	 * 起動と同時にインスタンスを同クラスのインスタンスを生成
	 * @param args アプリケーション起動時に入力される値
	 */
	public static void main(String[] args) {
		BootApp bootApp = new BootApp(args);
	}

    /**
	 * インスタンス時に処理を実行
	 * @param args アプリケーション起動時に入力される値
	 */
	public BootApp(String[] args) {
		this.execute(args);
	}

    /**
     * TODO[リファクタリング]：アプリケーション起動時の入力値に応じてサービスレイヤの処理を動的に選択できるようにすること
	 * アプリケーション実行
	 * @param args アプリケーション起動時に入力される値
	 */
	private void execute(String[] args) {
		try {
            CheckEvenNumber result = new CheckEvenNumber();
			result.check(args);
		} catch (NumberFormatException e) {
			System.out.println(FAILD_CONVERT_TO_INTGER);
		} catch (IllegalArgumentException e) {
			System.out.println(Illegal_INPUT_VALUE);
		} catch (Exception e) {
            System.out.println(UNEXPECTED_ERROR);
		} finally {
            // NOP
        }
	}
}
