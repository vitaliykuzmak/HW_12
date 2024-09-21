public class NumberTask implements Runnable {
    private FizzBuzz fizzBuzz;

    public NumberTask(FizzBuzz fizzBuzz) {
        this.fizzBuzz = fizzBuzz;
    }

    @Override
    public void run() {
        for (int i = 1; i <= fizzBuzz.getN(); i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                try {
                    fizzBuzz.getQueue().put(String.valueOf(i));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
