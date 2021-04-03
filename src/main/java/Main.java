import java.util.*;

class ServiceList{
    public void addList(List list, String name, int k){
        Date start = new Date();

        for (int i = 0; i < k/3+1; i++){
            if (list.getClass().equals(LinkedList.class)) {
                ((LinkedList<Object>) list).addFirst(new Object());
            }
            else
                list.add(0, new Object());
        }

        for (int i = 0; i < k/3+1; i++) {
            if (list.getClass().equals(LinkedList.class)) {
                ((LinkedList<Object>) list).addLast(new Object());
            }
            else
                list.add(new Object());
        }

        for (int i = 0; i < k/3+1; i++) {
            list.add(list.size()/2, new Object());
        }

        Date finish = new Date();

        long time = finish.getTime() - start.getTime();

        System.out.println(name + " : " + time);
    }

    public void getList(List list, String name, int k){
        Date start = new Date();
        int l = list.size();
        Object object;

        for (int i = 0; i < k/3; i++) {
            object = list.get(list.size()/2);
        }

        for (int i = 0; i < k/3; i++) {
            if (list.getClass().equals(LinkedList.class)) {
                object = ((LinkedList<Object>) list).getFirst();
            }
            else
                object = list.get(0);
        }

        for (int i = 0; i < k/3; i++) {
            if (list.getClass().equals(LinkedList.class)) {
                object = ((LinkedList<Object>) list).getLast();
            }
            else
                object = list.get(list.size()-1);
        }

        Date finish = new Date();

        long time = finish.getTime() - start.getTime();

        System.out.println(name + " : " + time);
    }

    public void removeList(List list, String name, int k){
        Date start = new Date();
        int l = list.size();
        Object object;

        for (int i = 0; i < k/3; i++) {
            object = list.remove(list.size()/2);
        }

        for (int i = 0; i < k/3; i++) {
            if (list.getClass().equals(LinkedList.class)) {
                object = ((LinkedList<Object>) list).removeFirst();
            }
            else
                object = list.remove(0);
        }

        for (int i = 0; i < k/3; i++) {
            if (list.getClass().equals(LinkedList.class)) {
                object = ((LinkedList<Object>) list).removeLast();
            }
            else
                object = list.remove(list.size()-1);
        }

        Date finish = new Date();

        long time = finish.getTime() - start.getTime();

        System.out.println(name + " : " + time);
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();

        List<Object> al = new ArrayList<>();
        List<Object> ll = new LinkedList<>();

        System.out.println("Add elements:");
        new ServiceList().addList(al, "ArrayList", k);
        new ServiceList().addList(ll, "LinkedList", k);
        System.out.println("- - - - - - - - -");

        System.out.println("Get elements:");
        new ServiceList().getList(al, "ArrayList", k);
        new ServiceList().getList(ll, "LinkedList", k);
        System.out.println("- - - - - - - - -");

        System.out.println("Remove elements:");
        new ServiceList().removeList(al, "ArrayList", k);
        new ServiceList().removeList(ll, "LinkedList", k);
        System.out.println("- - - - - - - - -");
    }
}