public class Talk {
    void display() {
        System.out.println("hello");
    }
    void  display(String name) {
        System.out.printf("Hello %s", name);
    }
    public static void main(String[] args) {
        Talk talk = new Talk();
        talk.display();
        talk.display("Shailesh");
    }
}
