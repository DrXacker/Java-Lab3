import java.util.Date;
import java.util.List;

public class Benchmark{
    /**
     * Метод для сравнения классов по методу - add
     * @param list - переменная типа сравниваемых нами классов
     * @param k - столько количество раз будет вызываться метод
     * @return - время требуемое для на операцию
     */
    public long addList(List list, int k){
        Date start = new Date();

        for (int i = 0; i < k/3+1; i++){
            list.add(0, new Object());
        }

        for (int i = 0; i < k/3+1; i++) {
            list.add(new Object());
        }

        for (int i = 0; i < k/3+1; i++) {
            list.add(list.size()/2, new Object());
        }

        Date finish = new Date();

        return finish.getTime() - start.getTime();
    }

    /**
     * Метод для сравнения классов по методу - get
     * @param list - переменная типа сравниваемых нами классов
     * @param k - столько количество раз будет вызываться метод
     * @return - время требуемое для на операцию
     */
    public long getList(List list, int k){
        Date start = new Date();
        int l = list.size();
        Object object;

        for (int i = 0; i < k/3; i++) {
            object = list.get(list.size()/2);
        }

        for (int i = 0; i < k/3; i++) {
            object = list.get(0);
        }

        for (int i = 0; i < k/3; i++) {
            object = list.get(list.size()-1);
        }

        Date finish = new Date();

        return finish.getTime() - start.getTime();
    }

    /**
     * Метод для сравнения классов по методу - remove
     * @param list - переменная типа сравниваемых нами классов
     * @param k - столько количество раз будет вызываться метод
     * @return - время требуемое для на операцию
     */
    public long removeList(List list, int k){
        Date start = new Date();
        int l = list.size();
        Object object;

        for (int i = 0; i < k/3; i++) {
            object = list.remove(list.size()/2);
        }

        for (int i = 0; i < k/3; i++) {
            object = list.remove(0);
        }

        for (int i = 0; i < k/3; i++) {
            object = list.remove(list.size()-1);
        }

        Date finish = new Date();

        return finish.getTime() - start.getTime();
    }
}
