package TeamMangerProject.domain;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/8 14:54
 */
public class Printer implements Equipment {
    //属性
    private String name;
    private String type;

    //构造器
    public Printer(String name,String type){
        this.name = name;
        this.type = type;
    }

    //用于输出开始界面的领用设备信息
    public String getDescription(){
        return name + "(" + type + ")";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
