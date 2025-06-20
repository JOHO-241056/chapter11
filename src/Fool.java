public class Fool extends Character implements Human {
    public Fool(String n, int h) {
        this.name = n;
        this.hp = h;
    }

    @Override
    public void attack(Matango m) {
        System.out.println(this.name + "は戦わず遊んでいる");
    }

    @Override
    public void talk() {
        System.out.println(this.name + "は意味のないことを話した");
    }

    @Override
    public void  watch() {
        System.out.println(this.name + "は虚空を見つめている");
    }

    @Override
    public void hear() {
        System.out.println(this.name + "は誰かの声が聞こえた気がした");
    }

    @Override
    public void run() {
        System.out.println(this.name + "大笑いしながら逃げ出した");
    }
}
