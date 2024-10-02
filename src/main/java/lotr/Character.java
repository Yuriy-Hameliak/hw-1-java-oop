package lotr;
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
        if (hp < 0) {
            this.hp = 0;
        } else{
            this.hp = hp;
        }
    }

    public void setPower(int power) {
        this.power = power;
    }
    public void kick(Character c) {
        
    }
    public boolean isAlive() {
        return hp > 0;
    }
    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}";
    }
}