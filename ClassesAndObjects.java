import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ClassesAndObjects {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.setName("Vladislav");
        person1.setAge(68);
        System.out.println(person1.getAge());
        System.out.println(person1.getName());
        Person person2 = new Person();
        person2.setAge(24);
    }
}

class Person{
    private String name;
    private int age;

    public void setName(String userName){
        if (userName.isEmpty()){
            System.out.println("Empty username");
        }
        else{
            name = userName;
        }
    }

    public String getName(){
        return name;
    }

    public void setAge(int userAge){
        if (userAge < 0){
            System.out.println("Age is invalid");
        }
        else {
            age = userAge;
        }
    }

    public int getAge(){
        return age;
    }

    void speak(){
        System.out.println(name + " " + age);
    }
}

