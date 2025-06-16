package kadai2;

public class Wizard extends Character {
    int attackDamage = 7;

    @Override
    public void attack(Matango m) {
        System.out.println(name + "の攻撃！");
        m.hp -= this.attackDamage;
        System.out.println("魔法使いは火の玉を放った！");
        System.out.println("敵に" + this.attackDamage + "のダメージを与えた");
    }
}