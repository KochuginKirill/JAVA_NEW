package DZ_Sertification;
import java.util.Random;

public class Toy{
    Random random = new Random();
    private int id;
    private int weight;
    private String name;
    protected int chance;

    public Toy(int id, int weight, String name) {
        this.id = id;
        this.weight = weight;
        this.name = name;
        this.chance = random.nextInt(weight) + 1;
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

    public int getChance(){ return this.chance; }

    public void getNewChance(){ this.chance = random.nextInt(this.weight) + 1; }

    public void printChance(){
        System.out.println(this.chance);
    }

//    @Override
//    public int compareTo(Toy o) {
//        return chance;
//    }
}
