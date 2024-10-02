import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import lotr.Character;
import lotr.CharacterFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CharacterFactoryTest {
    private CharacterFactory charecter;

    @BeforeEach
    public void init() {
        charecter = new CharacterFactory();
    }

    @Test
    public void testCreateCharacter() {
        Character c = charecter.createCharacter();
        assertTrue(c instanceof Character);
    }
}
