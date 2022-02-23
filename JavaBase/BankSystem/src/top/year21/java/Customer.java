package top.year21.java;

public class Customer {
        //属性
        private String name;
        private char gender;
        private int age;
        private String phone;
        private String email;

        //构造器
        // 通过构造器给传入的形参赋值
        public Customer(String name,char gender,int age,String phone,String email){
            this.name = name;
            this.gender = gender;
            this.age = age;
            this.phone = phone;
            this.email = email;
        }

       /**
        * @description: 为Customer类的私有化属性提供set和get的方法
        * @author: Year21
        * @date: 2022/1/26 23:52
        */
        //方法
        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }

        public void setGender(char gender){
            this.gender = gender;
        }

        public char getGender(){
            return gender;
        }

        public void setAge(int age){
            this.age = age;
        }
        public int getAge(){
            return age;
        }

        public void setPhone(String phone){
            this.phone = phone;
        }
        public String getPhone(){
            return phone;
        }

        public void setEmail(String email){
            this.email = email;
        }
        public String getEmail(){
            return email;
        }







}
