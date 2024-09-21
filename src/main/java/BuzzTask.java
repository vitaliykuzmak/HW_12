public class BuzzTask implements Runnable {
    private FizzBuzz fizzBuzz;

    public BuzzTask(FizzBuzz fizzBuzz) {
        this.fizzBuzz = fizzBuzz;
    }

    @Override
    public void run() {
        for (int i = 1; i <= fizzBuzz.getN(); i++) {
            if (i % 5 == 0 && i % 3 != 0) {
                try {
                    fizzBuzz.getQueue().put("buzz");
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
