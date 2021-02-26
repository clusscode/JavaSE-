package Obiect0223;

public class Person {
    //属性/成员变量/字段
    //直接写到类里面的变量就是“成员变量”
    //写到方法里面的变量就是“局部变量”
    //public 也可以加到成员变量中
    public String name;
    public int age;
    public String sex;

    public Person(){
        name = "chenguoqing1";
        age = 20;
        sex = "男";
    }
    public Person(String name){
        this.name = name;
        //this 是 Java 中的关键字
        //表示当前对象的引用，this相当于“我”
    }
    //方法/成员函数
    public void eat(String food){
        System.out.println(name + "正在吃" + food);
    }
}

