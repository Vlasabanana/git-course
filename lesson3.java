public class lesson3 {
    public static void main(String[] args) {
        Human human1 = new Human("Bobert", 25);
        human1.getInfo();
    }
}

class Human{
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName(){
        return name;
    }
     public int getAge(){
        return age;
     }
     public void getInfo(){
         System.out.println(name + " " + age);
     }
}