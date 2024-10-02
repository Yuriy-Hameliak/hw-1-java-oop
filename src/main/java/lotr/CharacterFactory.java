package lotr;
import java.util.Random;
public class CharacterFactory {
    public  Character createCharacter() {
        Random rand = new Random();
        int c = rand.nextInt(4);
        Character all[] = {new Knight(), new Elf(), new Hobbit(), new King()};
        return all[c];
    }
}
