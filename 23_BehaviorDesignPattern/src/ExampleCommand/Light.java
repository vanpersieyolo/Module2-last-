package ExampleCommand;

public class Light {
    private boolean on;

    public void switchOn(){
        on = true;
        System.out.println("on");
    }
    public void switchOff(){
        on = false;
        System.out.println("off");
    }
}
