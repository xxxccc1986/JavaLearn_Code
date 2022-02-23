package top.year21.exer;

public class Customer {
    //属性
    private String firstName;
    private String lastName;
    private Account account;

    //构造器
    public Customer(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //方法
    public Account getAccount(){
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

}
