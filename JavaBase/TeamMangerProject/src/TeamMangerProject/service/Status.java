package TeamMangerProject.service;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/8 15:35
 */
public class Status {
    private final String NAME;
    private Status(String name){
        this.NAME = name;
    }

    public static final  Status FREE = new Status("FREE");
    public static final  Status BUSY = new Status("BUSY");
    public static final  Status VOCATION = new Status("VOCATION");

    public String getName() {
        return NAME;
    }

    @Override
    //重写输出NAME的值  不重写输出的是地址值
    public String toString() {
        return NAME;
    }
}
