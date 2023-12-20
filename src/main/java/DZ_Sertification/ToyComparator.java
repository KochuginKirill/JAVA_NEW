package DZ_Sertification;

import java.util.Comparator;

public class ToyComparator implements Comparator<Toy> {
    @Override
    public int compare(Toy o1, Toy o2) {
        return o1.getChance() < o2.getChance() ? 1 : -1;
    }
}
