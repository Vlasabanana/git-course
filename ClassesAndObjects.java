public class ClassesAndObjects {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.name = "Vladislav";
        person1.age = 27;
        person1.speak();
        person1.sayHello();
        Person person2 = new Person();
        person2.name = "Kris";
        person2.age = 27;
        person2.speak();
        person2.sayHello();
    }
}

class Person{
    String name;
    int age;

    void speak(){
        System.out.println(name + " " + age);
    }

    void sayHello(){
        System.out.println("Hello!!");
    }
}

