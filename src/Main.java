import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        CustomLinkedList<Integer> array = new CustomLinkedList<>();
        array.addFirst(8);
        array.addFirst(25);
        array.addFirst(26);
        array.addFirst(5);
        array.addFirst(2);
        array.addFirst(9);


        for (int i = 0; i < array.size(); i++){
            System.out.println(array.get(i));
        }
        array.remove(4);
        System.out.println(array.getFirst());
        System.out.println(array.getLast());
        System.out.println(array.size());
    }
}