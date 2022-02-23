package TeamMangerProject.domain;

/**
 * @author hcxs1986
 * @version 1.0
 * @description:
 * @date 2022/2/8 14:54
 */
public class NoteBook implements Equipment {
    //属性
    private String model;
    private double price;

    //构造器
    public NoteBook(String model,double price){
        this.model = model;
        this.price = price;
    }

    //用于输出开始界面的领用设备信息
    public String getDescription(){
        return model + "(" + price + ")";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
