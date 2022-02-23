package top.year21.java;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class CustomerView {
        //存储用户信息的数组初始化
        CustomerList customerList = new CustomerList(10);
        String details = "编号  姓名       性别    年龄   电话                   邮箱";

        //用户进入选择的界面
        public void enterMainMenu(){
            Boolean isFlag = true;
            while(isFlag){
                System.out.println("-----------------客户信息管理软件-----------------\n");
                System.out.println("                  1 添 加 客 户");
                System.out.println("                  2 修 改 客 户");
                System.out.println("                  3 删 除 客 户");
                System.out.println("                  4 客 户 列 表");
                System.out.println("                  5 退       出\n");
                System.out.print("                  请选择(1-5)：");

                int choose = CMUtility.readMenuSelection();
                switch(choose){
                    case '1':
                        addNewCustomer();
                        break;
                    case '2':
                        modifyCustomer();
                        break;
                    case '3':
                        deleteCustomer();
                        break;
                    case '4':
                        listAllCustomers();
                        break;
                    case '5':
                        System.out.print("请问你是否确定要退出（Y/N）:");
                        char c = CMUtility.readConfirmSelection();
                        if (c == 'Y'){
                            isFlag = false;
                            break;//结束switch的分支结构，并返回isFlag = false
                        }
                        }
//                        if (isFlag == false){ //可加可不加 在这算是多一个保障
//                            return;//结束方法
//                        }
                }
            }

         private void addNewCustomer(){
             System.out.println("---------------------添加客户---------------------");
             System.out.print("姓名：");
             String name = CMUtility.readString(10);
             System.out.print("性别：");
             char gender = CMUtility.readChar();
             System.out.print("年龄：");
             int age = CMUtility.readInt();
             System.out.print("电话：");
             String phone = CMUtility.readString(20);
             System.out.print("邮箱：");
             String email = CMUtility.readString(20);
             //new一个新cust存放用户输入的信息
             Customer cust = new Customer(name,gender,age,phone,email);
             customerList.addCustomer(cust);//放进数组里面
             System.out.println("---------------------添加成功---------------------");
         }
        private void modifyCustomer(){
            System.out.println("---------------------修改客户---------------------");
            int index;
            Customer cust;//为了下边能够直接调用，同时也是用于循环里面不用定义
            for (;;){
                System.out.print("请选择待修改客户编号(-1退出)：");
                index = CMUtility.readInt();
                if (index == -1){
                    return;//结束方法
                }
                //用户认为数字是从1开始，但在java中 1对应的数组中是0，因此角标需要index - 1 ；
                //查看用户要查询的数在数组是否为null，并将地址值赋予cust；
                cust = customerList.getCustomer(index - 1);
                if (cust == null){
                    System.out.println("索引无效，无法找到指定用户");
                }else{
                    break;//结束当前包裹break的循环
                }
            }
            System.out.print("姓名(" + cust.getName() +  ")：");
            String name = CMUtility.readString(10,cust.getName());
            System.out.print("性别(" + cust.getGender() +  ")：");
            char gender = CMUtility.readChar(cust.getGender());
            System.out.print("年龄(" + cust.getAge() +  ")：");
            int age = CMUtility.readInt(cust.getAge());
            System.out.print("电话(" + cust.getPhone() +  ")：");
            String phone = CMUtility.readString(20,cust.getPhone());
            System.out.print("邮箱(" + cust.getEmail()+  ")：");
            String email = CMUtility.readString(20,cust.getEmail());
            //在堆空间当中重新造了一个对象将修改属性的值的地址值赋予cust1
            Customer cust1 = new Customer(name,gender,age,phone,email);
            customerList.replaceCustomer(index-1,cust1);
            Boolean isSuccess = customerList.replaceCustomer(index-1,cust1);
            if (isSuccess){
                System.out.println("---------------------修改完成---------------------");
            }else{//这一步其实不会执行，能走到这一步上面也就意味着这个角标在数组内是有效的
                System.out.println("---------------------修改失败---------------------");
            }
        }
         private void deleteCustomer(){
             System.out.println("---------------------删除客户---------------------");
            int index;
            Customer cust;
            for (;;){
                System.out.print("请选择待修改客户编号(-1退出)：");
                index = CMUtility.readInt();
                if (index == -1){
                    return;
                }
                cust =customerList.getCustomer(index-1);//
                if (cust == null){
                    System.out.println("索引无效，无法找到指定用户");
                }else{
                    break;//结束当前包裹break的循环
                }
            }
            System.out.println("确认是否删除(Y/N)：");
            char c = CMUtility.readChar();
            if (c == 'Y'){
                customerList.deleteCustomer(index -1 );
            }
             Boolean isSuccess = customerList.deleteCustomer(index-1);
             if (isSuccess){
                 System.out.println("---------------------删除完成---------------------");
             }else{
                 System.out.println("---------------------删除失败---------------------");
             }
         }
        private void listAllCustomers(){
            System.out.println("---------------------------客户列表---------------------------");
            Customer[] cust = customerList.getAllCustomers();//将之前的数组重新将地址值赋予新数组
            if (cust.length == 0){
                System.out.println("没有客户");
            }else{
//                Customer[] cust = customerList.getAllCustomers();//将之前的数组重新将地址值赋予新数组
                System.out.println(details);
                for (int i = 0; i < cust.length;i++){
                    System.out.println((i+1) + cust[i].getName() + cust[i].getGender() + cust[i].getAge()
                            + cust[i].getPhone() + cust[i].getEmail());
                }
            }
            System.out.println("-------------------------客户列表完成-------------------------");
        }

         public static void main(String[] args){
            CustomerView customerView = new CustomerView();
            customerView.enterMainMenu();
         }


}
