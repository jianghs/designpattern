package decorator;

public class WristEquip implements IEquip {
    @Override
    public int calculateAttack() {
        return 5;
    }

    @Override
    public String description() {
        return "护腕";
    }
}
