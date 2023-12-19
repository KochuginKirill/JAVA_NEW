package DZ_Sertification;
import java.util.Random;

public class Toy implements Comparable<Toy>{
    Random random = new Random();
    private int id;
    private int weight;
    private String name;

    public Toy(int id, int weight, String name) {
        this.id = id;
        this.weight = weight;
        this.name = name;
    }

    public int getId(){
        return this.id;
    }

    public int getWeight(){
        return this.weight;
    }

    public String getName(){
        return this.name;
    }


    @Override
    public int compareTo(Toy o) {
        return random.nextInt(o.weight + 1);
    }
}
