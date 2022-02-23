package TeamMangerProject.service;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/2/8 14:51
 */
public class TeamException extends Exception {

    static final long serialVersionUID = 7193246939L;

    public TeamException(){
        super();
    }

    public TeamException(String message){
        super(message);
    }
}
