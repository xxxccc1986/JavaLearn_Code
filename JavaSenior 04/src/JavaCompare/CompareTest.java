package JavaCompare;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/12 19:45
 */
public class CompareTest {
    @Test
    public void getSort() {
        String[] product = new String[]{"AA", "CC", "EE", "DD", "BB"};
        Arrays.sort(product);
        System.out.println(Arrays.toString(product));
    }
    
    
    @Test
    //自然排序与自定义类的重写compareTo()方法排序
    public void test(){
        Product[] arr = new Product[6];
        arr[0] = new Product("lenovoMouse",34);
        arr[1] = new Product("dellMouse",43);
        arr[2] = new Product("xiaomiMouse",12);
        arr[3] = new Product("huaweiMouse",65);
        arr[4] = new Product("microsoftMouse",43);
        arr[5] = new Product("huaweiMouse",43);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }


    @Test
    //定制排序
    //从低到高的方式排序
    public void test1(){
        String[] arr = new String[]{"AA","CC","KK","MM","GG","JJ","DD"};
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof String && o2 instanceof String){
                    String a = (String)o1;
                    String b = (String)o2;
                    return -a.compareTo(b);
                }
                throw new RuntimeException("传入的数据类型不符合");
            }
        });
        System.out.println(Arrays.toString(arr));
    }



    @Test
    public void Test2(){
        Product[] arr = new Product[5];
        arr[0] = new Product("lenovoMou",34);
        arr[1] = new Product("dellMouse",43);
        arr[2] = new Product("xiaomiMouse",12);
        arr[3] = new Product("huaweiMouse",65);
        arr[4] = new Product("microsoftMouse",43);

        Arrays.sort(arr,new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Product && o2 instanceof Product){
                    Product p1 = (Product)o1;
                    Product p2 = (Product)o2;
                    if (p1.getPrice() > p2.getPrice()){
                        return 1;
                    }else if(p1.getPrice() < p2.getPrice()){
                        return -1;
                    }else {
                        return -p1.getName().compareTo(p2.getName());
                    }
                }
                throw new RuntimeException("传入的数据类型不符");
            }
        });

        System.out.println(Arrays.toString(arr));
    }
}




class Product implements Comparable{
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int compareTo(Object o){
        if (o instanceof Product){
            Product p = (Product)o;
            if (this.price > p.price){
                return 1;
            }else if (this.price < p.price){
                return -1;
            }else {
                return -this.name.compareTo(p.name);
            }
        }
        throw new RuntimeException("传入的数据类型不符合");
    }


    @Override
    public String toString() {
        return "Product{" + "name='" + name + '\'' + ", price=" + price + '}';
    }
}