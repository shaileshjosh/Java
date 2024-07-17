
class Sender{

synchronized  void send(String message) {
    System.out.println(message);
}
}

class ThreadedSend extends Thread{
    Sender sender;
    String message;
    ThreadedSend(Sender s,String message){
        this.sender = s;
        this.message = message;

    }

    @Override
    public void run() {
       sender.send(message);
    }
    }

public class Demo {

    public static void main(String[] args) {
        Sender sender = new Sender();
        ThreadedSend first = new ThreadedSend(sender, "Hi");
        ThreadedSend second = new ThreadedSend(sender, "Bye");
        first.start();
        second.start();
    }
    
}
