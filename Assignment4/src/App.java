import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class App {
    public static void main(String[] args) throws Exception {

        List<Student> list=new ArrayList<>();

        list.add(new Student("Shailesh",1));
        list.add(null);
        list.add(new Student("Amar",2));
        list.add(new Student("Testuser",3));

        list.forEach(example->{
            Optional.ofNullable(example).ifPresent(example2->{
                System.out.println(example2.getName(example2.name));
            });
        }
        );
        MyInterface.callStaticMethod();
    }
}
