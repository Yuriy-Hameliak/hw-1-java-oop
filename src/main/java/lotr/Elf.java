package lotr;

public class Elf extends Character {
    public Elf() {
        super(10, 10);
    }
    
    public void kick(Character c) {
        if (c.getPower() < this.getPower()) {
            c.setHp(0);
        } else {
            c.setPower(c.getPower() - 1);
        }
    }
    public String toString() {
        return "Elf{hp=" + this.getHp() + ", power=" + this.getPower() + "}";
    }
}
