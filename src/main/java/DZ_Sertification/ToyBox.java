package DZ_Sertification;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class ToyBox {
    private PriorityQueue<Toy> box;


    public ToyBox() {
        box = new PriorityQueue<>();
    }

    public void add(Toy toy){
        box.add(toy);
    }
}
