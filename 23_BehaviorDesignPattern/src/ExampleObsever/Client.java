package ExampleObsever;

public class Client {
    public static  void main(String[] args){
        Subject subject = new Subject();
        IObsever obsever = new IObsever() {
            @Override
            public void update(String message) {
                System.out.println("message 1 changed: "+ message);
            }
        };
        subject.attach(obsever);
        IObsever obsever1 = new IObsever() {
            @Override
            public void update(String message) {
                System.out.println("message 2 changed: "+ message);
            }
        };
        subject.attach(obsever1);
        subject.notifyChange("test 1 ");
        subject.detach(obsever);
        subject.notifyChange("test 2");
    }
}
