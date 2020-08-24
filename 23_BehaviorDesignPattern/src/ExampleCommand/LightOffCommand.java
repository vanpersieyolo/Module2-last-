package ExampleCommand;

public class LightOffCommand extends Light {
    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }
    public void execute(){
        light.switchOff();
    }
}
