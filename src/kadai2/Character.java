package kadai2;

public abstract class Character {
    String name;

    public abstract void attack(Matango m);

    public void run() {
        System.out.println(this.name + "は逃げ出した！");
    }
}
