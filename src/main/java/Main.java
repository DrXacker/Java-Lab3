import java.util.*;

class ServiceList{
    /**
     * Метод для сравнения классов по методу - add
     * @param list - переменная типа сравниваемых нами классов
     * @param name - Наименование класса
     * @param k - столько количество раз будет вызываться метод
     */
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

    /**
     * Метод для сравнения классов по методу - get
     * @param list - переменная типа сравниваемых нами классов
     * @param name - Наименование класса
     * @param k - столько количество раз будет вызываться метод
     */
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

    /**
     * Метод для сравнения классов по методу - remove
     * @param list - переменная типа сравниваемых нами классов
     * @param name - Наименование класса
     * @param k - столько количество раз будет вызываться метод
     */
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

        List<Object> arrayList = new ArrayList<>();
        List<Object> linkedList = new LinkedList<>();

        System.out.println("Add elements:");
        new ServiceList().addList(arrayList, "ArrayList", k);
        new ServiceList().addList(linkedList, "LinkedList", k);
        System.out.println("- - - - - - - - -");

        System.out.println("Get elements:");
        new ServiceList().getList(arrayList, "ArrayList", k);
        new ServiceList().getList(linkedList, "LinkedList", k);
        System.out.println("- - - - - - - - -");

        System.out.println("Remove elements:");
        new ServiceList().removeList(arrayList, "ArrayList", k);
        new ServiceList().removeList(linkedList, "LinkedList", k);
        System.out.println("- - - - - - - - -");
    }
}