package lotr;
import java.util.Random;
public class King  extends Strategy{
    static Random rand = new Random();
    public static final int Kix = rand.nextInt(11) + 5;
    public King() {
        super(Kix);
    }
}
