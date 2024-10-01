package lotr;
import java.util.Random;
public class King  extends Character {
    static Random rand = new Random();
    static int x = rand.nextInt(11) + 5;
    public King() {
        super(x, x);
    }
    public int getPower() {
        return rand.nextInt(super.getPower()+1);
    }
    
    public void kick(Character c) {
        c.setHp(c.getHp() - this.getPower());
    }
    public String toString() {
        return "King{hp=" + this.getHp() + ", power=" + this.getPower() + "}";
    }
}
