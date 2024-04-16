package humans;

import bases.Human;
import utils.Dice;

public class Fighter extends Human{
	// コンストラクタ
	public Fighter(String name, String weapon) {
		// Humanクラスで定義したコンストラクタを利用する
		super(name,weapon);
		
		super.setHp(Dice.get(240,300));
		super.setOffensive(Dice.get(17, 23));
	}
}
