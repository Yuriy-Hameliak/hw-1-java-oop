package lotr;
public class Hobbit extends Character {
    public Hobbit() {
        super(3, 0);
    }

    public void kick(Character c) {
        this.toCry();
    }
    public void toCry() {
        System.out.println("Cry");
    }
    public String toString() {
        return "Hobbit{hp=" + this.getHp() + ", power=" + this.getPower() + "}";
    }
}

