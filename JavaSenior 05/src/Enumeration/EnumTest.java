package Enumeration;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 枚举类的相关说明
 * @date 2022/2/12 22:16
 */
public class EnumTest {
    public static void main(String[] args) {
        Season s1 = Season.SPRING;
        System.out.println(s1);
        System.out.println(Season.class);
    }

}

//自定义枚举类
class Season{
    //1.声明Season对象的属性:private final修饰
    private final String season;
    private final String seasonDes;

    //2.私有化类的构造器,并给对象属性赋值
    private Season(String season,String seasonDes){
        this.season = season;
        this.seasonDes = seasonDes;
    }


    //3.提供当前枚举类的多个对象：public static final的
    public static final Season SPRING = new Season("春天","万物复苏");
    public static final Season SUMMER = new Season("夏天","夏日炎炎");

    //4.获取枚举类对象的属性
    public static Season getSPRING() {
        return SPRING;
    }

    public static Season getSUMMER() {
        return SUMMER;
    }


    @Override
    //4.提供toString()
    public String toString() {
        return "Season{" + "season='" + season + '\'' + ", seasonDes='" + seasonDes + '\'' + '}';
    }
}

interface info{
   void show();
}
//使用enum关键字创建枚举类
enum Season1 implements info{
    //1.提供当前枚举类的对象，多个对象之间用","隔开，末尾对象";"结束
    SPRING("春天","万物复苏"){
        public void show(){
            System.out.println("这是春天");
        }
    },
    SUMMER("夏天","夏日炎炎"){
        public void show(){
            System.out.println("这是夏天");
        }
    };

//2声明Season对象的属性:private final修饰
    private final String season;
    private final String seasonDes;

    //2.私有化类的构造器,并给对象属性赋值
    private Season1(String season,String seasonDes){
        this.season = season;
        this.seasonDes = seasonDes;
    }


    //4.获取枚举类对象的属性
    public static Season1 getSPRING() {
        return SPRING;
    }

    public static Season1 getSUMMER() {
        return SUMMER;
    }

}

