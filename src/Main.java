public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Adder adder = new Adder(c);
        Subtractor subtractor = new Subtractor(c);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}