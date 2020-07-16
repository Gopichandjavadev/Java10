package java10;

import java.util.List;
import java.util.stream.Collectors;

public class ListMethods {

    public static void main(String[] args) {
        
        List<Integer> someIntList = List.of(1, 2, 3);
       
        List<Integer> copyList = List.copyOf(someIntList);
        copyList.add(4);
        
        List<Integer> evenList = someIntList.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toUnmodifiableList());
              evenList.add(4);
              
              
        Integer firstEven = someIntList.stream()
                      .filter(i -> i % 2 == 0)
                      .findFirst()
                      .orElseThrow();

    }

}
