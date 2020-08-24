package ExcerciseFacade;

import java.util.ArrayList;
import java.util.List;

public class ListFilter {
    public List<Integer> filterOdd(List<Integer> numbers,List<Integer> newList){
        for (Integer number: numbers) {
            if(number % 2 == 0){
                newList.add(number);
            }
        }
        return newList;
    }
}
