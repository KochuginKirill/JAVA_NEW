package Algorithms_DZ2;

public class BtTest {
    public static void main(String[] args) {

        DzBinaryTree<Integer> tree = new DzBinaryTree<>();

        tree.add(6);
        tree.add(3);
        tree.add(2);
        tree.add(4);
        tree.add(5);
        tree.add(1);
        tree.add(9);
        tree.add(7);
        tree.add(11);
        tree.add(8);
        tree.add(12);
        tree.add(15);
        tree.add(10);
        tree.print();
        tree.add(252);
        tree.print();
        System.out.println(tree.remove(12));
        tree.remove(12);
        System.out.println(tree.remove(12));


    }
}