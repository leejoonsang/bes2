package week3.day4.collection;

import java.util.HashSet;
import java.util.Set;

public class RandNumWithoutDuplicated {
    public static void main(String[] args) {
        RandNumCreator randNumGenerator = new RandNumCreator();
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<50; i++){
            int r = randNumGenerator.create(10);
            set.add(r);
        }

        System.out.println(set);

    }

}
