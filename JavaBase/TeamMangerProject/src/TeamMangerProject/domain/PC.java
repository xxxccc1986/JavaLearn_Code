package TeamMangerProject.domain;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/8 14:53
 */
public class PC implements Equipment{
    //属性
    private String model;
    private String display;

    //构造器
    public PC(String model,String display){
        this.model = model;
        this.display = display;
    }

    //用于输出开始界面的领用设备信息
    public String getDescription(){
        return model + "(" + display + ")";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }
}
