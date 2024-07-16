

/**
 * Person
 */
public class Person {

    private String Name;
    private int age;

    Person(String name,int  age) {
        this.Name = name;
        this.age = age;
    }
    void setName(String name){
        this.Name = name;
       
    }
    void setAge(int age){
        this.age = age;
       
    }
    int getAge(){
        return age;
       
    }
    String getName(){
        return Name;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Person p = new Person("Shailesh", 34);
        System.out.printf("Person Name is  %s\n", p.getName());
        System.out.printf("Person Age is  %d", p.getAge());
        p.setName("NewUser");
        p.setAge(40);
        System.out.println("\n");
        System.out.printf("Person Updated Name is  %s\n", p.getName());
        System.out.printf("Person Updated age is  %d", p.getAge());
    }
    
}