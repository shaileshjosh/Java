public class Teacher extends  Person {

    String specialization;
    String department;
    Teacher (String name,int age,String specialization,String department){
        super(name,age);
        this.specialization = specialization;
        this.department = department;
    }

    void setSpecialization(String specialization){
        this.specialization = specialization;
    }
    void setDepartment(String department){
        this.department = department;
    }

    String getSpecialization(){
        return this.specialization;
    }
    String getDepartment(){
        return this.department;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Teacher t = new Teacher("Rajnandini", 30, "Java", "Developer");
        System.out.printf("Teacher Name is  %s\n", t.getName());
        System.out.printf("Teacher Age is  %d\n", t.getAge());
        System.out.printf("Teacher Specialization is  %s\n", t.getSpecialization());
        System.out.printf("Teacher Department is  %s\n", t.getDepartment());

        t.setName("Prathmesh");
        t.setAge(35);
        t.setSpecialization("Recruitment");
        t.setDepartment("HR");
        System.out.println("\n");
        System.out.printf("Updated Teacher Name is  %s\n", t.getName());
        System.out.printf("Updated Teacher Age is  %d\n", t.getAge());
        System.out.printf("Updated Teacher Specialization is  %s\n", t.getSpecialization());
        System.out.printf("Updated Teacher Department is  %s\n", t.getDepartment());
    }
}
