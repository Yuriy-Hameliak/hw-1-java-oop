package lotr;
import java.util.Random;
public class Knight extends Strategy {
    static Random rand = new Random();
    public static final int Knx = rand.nextInt(11) + 2;
    public Knight() {
        super(Knx);
    }
}
