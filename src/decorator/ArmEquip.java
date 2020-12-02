package decorator;

public class ArmEquip implements IEquip {
    @Override
    public int calculateAttack() {
        return 20;
    }

    @Override
    public String description() {
        return "倚天剑";
    }
}
