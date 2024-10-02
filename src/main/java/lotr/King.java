package lotr;
import java.util.Random;
public class King  extends Character {
    static Random rand = new Random();
    static int x = rand.nextInt(11) + 5;
    public King() {
        super(x, x);
    }
    
    public void kick(Character c) {
        int power = rand.nextInt(super.getPower()+1);
        c.setHp(c.getHp() - power);
    }
    public String toString() {
        return "King{hp=" + this.getHp() + ", power=" + x + "}";
    }
}
