import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class FizzBuzz {
    private int n;
    private BlockingQueue<String> queue = new LinkedBlockingQueue<>();

    public FizzBuzz(int n) {
        this.n = n;
    }

    public BlockingQueue<String> getQueue() {
        return queue;
    }

    public int getN() {
        return n;
    }
}

