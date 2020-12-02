package decorator;

public class RedGemDecorator implements IEquipDecorator {
    private IEquip equip;

    public RedGemDecorator(IEquip equip) {
        this.equip = equip;
    }

    @Override
    public int calculateAttack() {
        return 15 + equip.calculateAttack();
    }

    @Override
    public String description() {
        return equip.description() + "+ 红宝石";
    }
}
