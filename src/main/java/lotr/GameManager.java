package lotr;

public class GameManager {
    public static void fight(Character c1, Character c2) {
        String c1Name = "P1:"+c1.getClass().getSimpleName();
        String c2Name = "P2:"+c2.getClass().getSimpleName();
        System.out.println("Fight between " + c1Name + " and " + c2Name);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        int round = 1;
        while (c1.isAlive() && c2.isAlive()) {
            System.out.println("Round " + round);
            if (c2 instanceof Hobbit && c1 instanceof Hobbit) {
                System.out.println("Player 1:");
                ((Hobbit) c1).toCry();
                System.out.println("Player 2:");
                ((Hobbit) c2).toCry();
                break;
            }
            if (c2 instanceof Elf && c1 instanceof Elf) {
                System.out.println("Two mighty elves would not fight with each other");
                break;
            }
            int t1 = c2.getHp();
            c1.kick(c2);
            System.out.println(c1Name + " kicks " + c2Name + " with power " + (t1 - c2.getHp()));
            System.out.println(c2Name+ " has " + c2.getHp() + " hp");
            if (c2.isAlive()){
                int t2 = c1.getHp();
                c2.kick(c1);
                System.out.println(c2Name + " kicks " + c1Name + " with power " + (t2 - c1.getHp()));
                System.out.println(c1Name+ " has " + c1.getHp() + " hp");
            }
            round++;
        }

        if (c1.isAlive() && !c2.isAlive()) {
            System.out.println(c1Name + " wins");
        } else if (c2.isAlive() && !c1.isAlive()) {
            System.out.println(c2Name + " wins");
        }
    }
    public static void main(String[] args) {
        CharacterFactory cf = new CharacterFactory();
        Character c1 = cf.createCharacter();
        Character c2 = cf.createCharacter();
        fight(c1, c2);
    }
}
