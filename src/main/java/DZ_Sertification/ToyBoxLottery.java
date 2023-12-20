package DZ_Sertification;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;


public class ToyBoxLottery {
    private static PriorityQueue<Toy> box;


    public ToyBoxLottery() {
        box = new PriorityQueue<>(new ToyComparator());
    }

    public static void add(ArrayList<Toy> toy){
        for (int i = 0; i < toy.size(); i++) {
            box.add(toy.get(i));
        }
    }

    public static String getLotteryWinner(){
        return box.peek().getName();
    }
}
