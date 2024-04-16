package bases;

import utils.Dice;

// 人間を表現する抽象クラス
public abstract class Human extends Living {
	int attack;

	// コンストラクタ
	public Human(String name, String weapon) {
		// Livingクラスで定義したコンストラクタを利用する
		super(name,weapon);
	}

	// attackメソッドのオーバーライド
	@Override
	public void attack(Living target) {
		// 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする
		int attack = Dice.get(1, 10) * getOffensive();
		this.attack = attack;
		// 相手のHPをダメージ値だけ減らす
		target.setHp(target.getHp() - attack);
		
		// 自分の攻撃力を1だけ減らす
		target.setOffensive(target.getOffensive() - 1);
		
		// コンソールにステータスを表示
		System.out.println( target.getName() + "は人間の名前、"+ target.getWeapon()  +"は人間の武器の名前、" +
		target.getName() + "はtargetの名前、" + target.getHp() + "はダメージ値");
	} 
}

