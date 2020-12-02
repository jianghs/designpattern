package command;

public class Start {

    public static void main(String[] args) {
        Light light = new Light();
        Door door = new Door();
        Computer computer = new Computer();

        ControlPanel controlPanel = new ControlPanel();
        controlPanel.setCommand(0, new LightOnCommand(light));
        controlPanel.setCommand(1, new LightOffCommand(light));
        controlPanel.setCommand(2, new DoorOpenCommand(door));
        controlPanel.setCommand(3, new DoorCloseCommand(door));
        controlPanel.setCommand(4, new ComputerOnCommand(computer));
        controlPanel.setCommand(5, new ComputerOffCommand(computer));

        controlPanel.keyPressed(0);
        controlPanel.keyPressed(1);
        controlPanel.keyPressed(2);
        controlPanel.keyPressed(3);
        controlPanel.keyPressed(4);
        controlPanel.keyPressed(5);
        controlPanel.keyPressed(6);
    }
}
