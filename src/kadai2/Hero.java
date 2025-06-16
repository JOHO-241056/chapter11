package kadai2;

public class Hero extends Character {
    int attackDamage = 10;

    @Override
    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃！");
        m.hp -= this.attackDamage;
        System.out.println("敵に" + this.attackDamage + "のダメージを与えた");
    }
}