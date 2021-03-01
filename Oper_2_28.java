package Oper0228;




public class Oper_2_28 {
    public static void main(String[] args) {
//        Animal animal = new Animal();
//        Cat cat = new Cat();
//        animal = cat;
        Animal animal = new Cat();
    }
}
class Animal {
    String name;
    public void eat(String food){
        System.out.println(name + food);
    }
}
class Cat extends Animal{

    public  void run(){
        System.out.println("猫再跑");
    }
}
class Bird extends Animal{
    int age;
    public Bird( int age){
        this.age = age;
    }
    public void fly(){
        System.out.println(name + "在飞");
    }
}
