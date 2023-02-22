public class Adder implements Runnable {
    Counter count;
    Adder(Counter countInstance) {
      this.count = countInstance;
    }

    @Override
    public void run() {
        for(int i=0;i<10000;i++) {
            synchronized (this.count) {
              this.count.count += i;
            }
        }
    }
}
