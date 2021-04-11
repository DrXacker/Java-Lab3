import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();

        List<Object> arrayList = new ArrayList<>();
        List<Object> linkedList = new LinkedList<>();

        System.out.println("Add elements:");
        long time = new Benchmark().addList(arrayList, k);
        System.out.println("  ArrayList: " + time);
        time = new Benchmark().addList(linkedList, k);
        System.out.println("  LinkedList: " + time);
        System.out.println("- - - - - - - - -");

        System.out.println("Get elements:");
        time = new Benchmark().getList(arrayList, k);
        System.out.println("  ArrayList: " + time);
        time = new Benchmark().getList(linkedList, k);
        System.out.println("  LinkedList: " + time);
        System.out.println("- - - - - - - - -");

        System.out.println("Remove elements:");
        time = new Benchmark().removeList(arrayList, k);
        System.out.println("  ArrayList: " + time);
        time = new Benchmark().removeList(linkedList, k);
        System.out.println("  LinkedList: " + time);
        System.out.println("- - - - - - - - -");
    }
}