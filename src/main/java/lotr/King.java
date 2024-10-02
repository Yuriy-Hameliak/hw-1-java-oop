package lotr;
import java.util.Random;
public class King  extends Strategy{
    static Random rand = new Random();
    static int x = rand.nextInt(11) + 5;
    public King() {
        super();
    }
    public String toString() {
        return "King{hp=" + this.getHp() + ", power=" + x + "}";
    }
}
