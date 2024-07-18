public interface MyInterface {

    default String getName(String name){
        return "default method is call with name:"+name;
    }

    static void callStaticMethod(){
        System.out.println("static method called from interface");
    }
}