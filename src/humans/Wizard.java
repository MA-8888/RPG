package humans;

import bases.Human;
import utils.Dice;

public class Wizard extends Human {
	
	// コンストラクタ
	public Wizard(String name, String weapon) {
		// Humanクラスで定義したコンストラクタを利用する
		super(name,weapon);
		
		super.setHp(Dice.get(120, 180));
		super.setOffensive(Dice.get(12, 18));
	}
}
