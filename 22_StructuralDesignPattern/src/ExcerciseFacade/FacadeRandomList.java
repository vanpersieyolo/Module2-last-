package ExcerciseFacade;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FacadeRandomList {
    List<Integer> numbers = new ArrayList<>();
    List<Integer> newList = new ArrayList<>();
    RandomList randomList = new RandomList();
    ListFilter listFilter= new ListFilter();
    ListPrinter listPrinter = new ListPrinter();
    public void printrandomlist(){
      randomList.generateList(10,0,100,numbers );
      listFilter.filterOdd(numbers,newList);
      listPrinter.printList(newList);

    }
}
