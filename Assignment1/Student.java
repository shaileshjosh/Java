

public class Student extends  Person {

    int RollNo;
    String course;
    String department;
    Student (String name,int age,int rollNo,String course,String department){
        super(name,age);
        this.RollNo = rollNo;
        this.course = course;
        this.department = department;
    }

    void setRollNo(int rollNo){
        this.RollNo = rollNo;
    }
    void setCourse(String course){
        this.course = course;
    }
    void setDepartment(String department){
        this.department = department;
    }

    int getRollNo(){
        return this.RollNo;
    }
    String getCourse(){
        return this.course ;
    }
    String getDepartment(){
        return this.department;
    }

      /**
     * @param args
     */
    public static void main(String[] args) {
        Student s = new Student("Amit", 30, 1, "go", "IT");
        System.out.printf("Student Name is  %s\n", s.getName());
        System.out.printf("Student Age is  %d\n", s.getAge());
        System.out.printf("Student Roll No is  %d\n", s.getRollNo());
        System.out.printf("Student Course is  %s\n", s.getCourse());
        System.out.printf("Student Department is  %s\n", s.getDepartment());

        s.setName("Rahul");
        s.setAge(28);
        s.setRollNo(2);
        s.setCourse("python");
        s.setDepartment("Computers");
        System.out.println("\n");
        System.out.printf("Student Updated Name is  %s\n", s.getName());
        System.out.printf("Student Updated Age is  %d\n", s.getAge());
        System.out.printf("Student Updated Roll No is  %d\n", s.getRollNo());
        System.out.printf("Student Updated Course is  %s\n", s.getCourse());
        System.out.printf("Student Updated Department is  %s", s.getDepartment());
    }


}
