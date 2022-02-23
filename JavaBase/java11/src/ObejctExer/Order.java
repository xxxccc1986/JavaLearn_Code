package ObejctExer;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/1/29 16:17
 */
public class Order {
     private int orderId;
     private String orderName;

     public Order(int orderId,String orderName){
         this.orderId = orderId;
         this.orderName = orderName;
     }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public boolean equals(Object obj){
         if (this == obj){//判断比较的两个数的地址值是否相同
             return true;
         }
         if (obj instanceof Order){//判断传入的形参是否是当前类或其子类实例对象
             System.out.println("进入");
             Order o = (Order)obj;
             return this.orderId == o.orderId && this.orderName.equals(o.orderName);
         } else {
                 return  false;
             }
         }
    }

