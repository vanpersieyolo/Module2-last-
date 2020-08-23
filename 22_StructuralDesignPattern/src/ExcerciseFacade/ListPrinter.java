package ExcerciseFacade;

import java.util.List;

public class ListPrinter {
    public void printList(List<Integer> a){
        for (Integer number: a) {
            System.out.println(number);
        }
    }
}
