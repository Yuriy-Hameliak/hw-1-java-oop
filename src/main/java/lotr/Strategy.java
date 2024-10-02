package lotr;
import java.util.Random;
abstract class Strategy extends Character {
    static Random rand = new Random();
    static int x = rand.nextInt(11) + 5;
    public Strategy(){
        super(x, x);
    }
    public void kick(Character c){
        int power = rand.nextInt(super.getPower()+1);
        c.setHp(c.getHp() - power);
    }
}
