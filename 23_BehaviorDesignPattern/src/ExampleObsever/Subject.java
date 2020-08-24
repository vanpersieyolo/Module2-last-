package ExampleObsever;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<IObsever> obsevers = new ArrayList<>();
    public void attach(IObsever obsever){
        obsevers.add(obsever);
    }
    public  void detach(IObsever obsever){
        obsevers.remove(obsever);
    }
    public void notifyChange(String message){
        for (IObsever a : obsevers) {
            a.update(message);
        }
    }
}
