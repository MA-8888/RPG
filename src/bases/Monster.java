package bases;

import utils.Dice;

//モンスターを表現する抽象クラス
public abstract class Monster extends Living {
	int attack;

	// コンストラクタ
	public Monster(String name, String weapon) {
		// Livingクラスで定義したコンストラクタを利用する
		super(name, weapon);
	}

	// attackメソッドのオーバーライド
	@Override
	public void attack(Living target) {
		// 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする
		int attack = Dice.get(1, 10) * target.getOffensive();
		this.attack = attack;
		
		// 相手のHPをダメージ値だけ減らす
		target.setHp(target.getHp() - attack);

		// コンソールにステータスを表示
		System.out.println(target.getName() + "はモンスターの名前、"+ target.getWeapon()  +"はモンスターの武器の名前、"
		+ target.getName() + "はtargetの名前、" + target.getHp() + "はダメージ値");
	}
}
