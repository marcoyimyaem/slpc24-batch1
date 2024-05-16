package chapter5.topic2;

public class AbstractL {
    public static void main(String[] args) {
    // Monster mm = new Monster();
}
    
}


abstract class Monster {
    private int hp;
    private String name;

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract int doubleHp();
    abstract void attack();
    abstract void escape();
            

    
}
abstract class Boss extends Monster {
    @Override
    void escape(){}
    
}
class WaterMonster extends Monster{

    @Override
    public int doubleHp() {
        return 1;    
    }

    @Override
    void attack() {
        }

    @Override
    void escape() {
        }

}
class FireMonster extends Boss{

    @Override
    public int doubleHp() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'doubleHp'");
    }

    @Override
    void attack() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'attack'");
    }

    
    
}