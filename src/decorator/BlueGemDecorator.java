package decorator;

public class BlueGemDecorator implements IEquipDecorator {
    private IEquip equip;

    public BlueGemDecorator(IEquip equip) {
        this.equip = equip;
    }

    @Override
    public int calculateAttack() {
        return 5 + equip.calculateAttack();
    }

    @Override
    public String description() {
        return equip.description() + "+ 蓝宝石";
    }
}
