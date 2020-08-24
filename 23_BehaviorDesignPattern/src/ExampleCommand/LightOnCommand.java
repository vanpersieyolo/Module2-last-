package ExampleCommand;

public class LightOnCommand extends Light{
    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }
    public void execute(){
        light.switchOn();
    }
}
