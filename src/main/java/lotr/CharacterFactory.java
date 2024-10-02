package lotr;
import java.util.Random;
public class CharacterFactory {
    private Random random = new Random();
    private Class<?>[] classes = {Hobbit.class, Elf.class, King.class, Knight.class};
    public Character createCharacter() {
        int index = random.nextInt(classes.length);
        try {
            return (Character) classes[index].getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}