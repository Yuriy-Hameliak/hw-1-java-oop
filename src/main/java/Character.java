public class Character {

    private int hp;
    private int power;

    public Character(int hp, int power) {
        this.hp = hp;
        this.power = power;
    }

    public int getHp() {
        return hp;
    }

    public int getPower() {
        return power;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}