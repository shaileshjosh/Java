
 class NumbersDisplay {
    
    synchronized void printNumbers(int n){
    for (int i = 0; i < 5; i++) {
        System.out.println(n+i);
    }
    }

}
 class FirstThread extends Thread {

    NumbersDisplay number;
    int startingNumber;

    public FirstThread(NumbersDisplay number,int start) {
        this.number = number;
        this.startingNumber = start;
    }

    @Override
    public void run() {
        number.printNumbers(startingNumber);
    }

}

class SecondThread extends Thread {

    NumbersDisplay number;
    int startingNumber;

    public SecondThread(NumbersDisplay number,int start) {
        this.number = number;
        this.startingNumber = start;
    }

    @Override
    public void run() {
        number.printNumbers(startingNumber);
    }

}

class ThreadNumbers {
    public static void main(String[] args) {
        NumbersDisplay numbers = new NumbersDisplay();
        FirstThread first = new FirstThread(numbers,1);
        SecondThread second = new SecondThread(numbers,6);
        first.start();
        second.start();
    }
}