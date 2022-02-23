package top.year21.java;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/1/27 18:49
 */
public class Kids extends Mankind {
    //属性
    private int yearsOld;



    //构造器
    public Kids(int yearsOld){
        this.yearsOld = yearsOld;
    }


    //方法
    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge(){
        System.out.println("yearsOld的值为：" + yearsOld);
    }

    public void employeed(){
        System.out.println("kids should study and no job！");
    }

}
