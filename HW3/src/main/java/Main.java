public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(5);
        list.add(7);
        list.add(1);
        list.add(3);
        list.add(6);

        list.print();
        list.revert();
        list.print();


    }

}
