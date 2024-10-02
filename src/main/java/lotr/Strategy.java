package lotr;
import java.util.Random;
public class Strategy extends Character {
    static Random rand = new Random();
    private int x;
    public Strategy(int x) {
        super(x, x);
        this.x = x;
    }
    public void kick(Character c){
        int power = rand.nextInt(super.getPower()+1);
        c.setHp(c.getHp() - power);
    }
}
