package top.year21.java;

public class CustomerList {
        //属性
        Customer[] customers;//先定义一个数组，可在构造器内或者直接显式赋值
        int total = 0;

        //构造器 此处用于创建对象
        public CustomerList(int totalCustomer){
                customers =  new Customer[totalCustomer];//数组初始化
        }


        //方法
        //判断用户是否添加成功
        public boolean addCustomer(Customer customer){
                if (total >= customers.length || total < 0){
//                        System.out.println("超过限制，添加失败");
                        return false;
                }
                customers[total] = customer;
                total++;
                return true;
        }
        //给修改后的用户信息提供数组内的修改
        public boolean replaceCustomer(int index, Customer cust){
                if (index >= total || index < 0){
//                        System.out.println("无法找到用户，替换失败");
                        return false;
                }
                customers[index] = cust;//将cust属性地址值赋予数组内index对应的元素
                return true;
        }
        //判断是否成功删除用户
        public boolean deleteCustomer(int index){
                if (index >= total || index < 0){
//                        System.out.println("无法找到索引用户，删除失败");
                        return false;
                }
                //i要遍历到最后一位，但index又不能和total相同 例如total=3，角标只能为0，1，2，因此i要小于<=total-1
                for (int i = index; i < total-1;i++){
                        customers[i] = customers[i+1];
                }
                customers[total - 1] = null;//数组的最后一位元素赋予空置值
                total--;//total记录了数组的元素，所以删除了一个要减一
                return true;
        }
        //以total的长度新建一个新数组，将customers数组中不为空值的元素地址值赋予新数组
        //输出数组所有元素
        public Customer[] getAllCustomers(){
                Customer[] cust = new Customer[total];
                for (int i = 0; i < total;i++){
                        cust[i] = customers[i];
                }
                return cust;//返回的是cust数组的地址值
        }

        //获取数组内指定某一角标元素的信息
        public Customer getCustomer(int index){
                if (index >= total || index < 0){
//                        System.out.println("索引无效");
                }
                return customers[index];
        }

        //获取数组的用户个人
        public int getTotal(){
                return total;
        }



}
