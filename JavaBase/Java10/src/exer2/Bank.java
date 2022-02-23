package exer2;

public class Bank {
    private Customer[] customers;
    private int numberOfCustomers;

    //无参构造器
    public Bank(){
        customers = new Customer[10];

    }

    public void addCustomer(String l,String f){
        Customer cust = new Customer(l,f);
        customers[numberOfCustomers] = cust;
        numberOfCustomers++;
    }

    public int getNumberOfCustomer() {
        return numberOfCustomers;
    }
    public Customer getCustomer(int index){
        if (index >=0 && index < numberOfCustomers){
            return customers[index];
        }else {
            return null;
        }
    }
}
