package ObjectExer2;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/1/29 20:47
 */
public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.0);
        Circle c2 = new Circle(3.0,"white",20);
        System.out.println(c1.color.equals(c2.color));
        System.out.println(c1.equals(c2));
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }


}
