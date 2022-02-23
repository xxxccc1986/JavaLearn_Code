package Exer;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/15 21:41
 */
public class ExerTest {
    public static void main(String[] args) {
        Comparator com = new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Employee && o2 instanceof Employee){
                    Employee e1 = (Employee)o1;
                    Employee e2 = (Employee)o2;

                    MyDate m1 = e1.getBirthday();
                    MyDate m2 = e2.getBirthday();

                    return -m1.compareTo(m2);
                }
                throw new RuntimeException("传入的数据不匹配");
            }
        };

        TreeSet tree = new TreeSet(com);

        tree.add(new Employee("Tom",20,new MyDate(2002,10,21)));
        tree.add(new Employee("Mary",28,new MyDate(1994,9,21)));
        tree.add(new Employee("Jack",21,new MyDate(2001,10,5)));
        tree.add(new Employee("Amy",15,new MyDate(2006,7,1)));
        tree.add(new Employee("Smith",30,new MyDate(1992,12,21)));

        Iterator iterator = tree.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
