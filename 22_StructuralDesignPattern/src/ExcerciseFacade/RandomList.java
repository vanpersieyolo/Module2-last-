package ExcerciseFacade;

import java.util.ArrayList;
import java.util.List;

public class RandomList {
    public static List<Integer> generateList(int size, int min, int max,List<Integer> numbers ){
        RandomNumber randomNumber = new RandomNumber();
        for (int i = 0; i < size; i++){
            int randomInteger = randomNumber.generateInteger(min, max);
            numbers.add(randomInteger);
        }
        return numbers;
    }
}
