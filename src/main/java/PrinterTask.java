public class PrinterTask implements Runnable {
    private FizzBuzz fizzBuzz;

    public PrinterTask(FizzBuzz fizzBuzz) {
        this.fizzBuzz = fizzBuzz;
    }

    @Override
    public void run() {
        for (int i = 1; i <= fizzBuzz.getN(); i++) {
            try {
                System.out.print(fizzBuzz.getQueue().take() + (i == fizzBuzz.getN() ? "" : ", "));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
