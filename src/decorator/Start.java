package decorator;

public class Start {
    public static void main(String[] args) {
        IEquip equip = new RedGemDecorator(new RedGemDecorator(new BlueGemDecorator(new ShoeEquip())));
        System.out.println(equip.calculateAttack());
        System.out.println(equip.description());
    }
}
