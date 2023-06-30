import java.util.Random;

public class Main {
    public static void main(String[] args) {

        BinaryTree<Integer> tree = new BinaryTree<>();
        for (int i = 0; i < 15; i++)
            tree.add((new Random().nextInt(1, 16)));
        tree.print();
    }

}