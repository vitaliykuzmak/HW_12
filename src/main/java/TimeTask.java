public class TimeTask implements Runnable {

    @Override
    public void run() {
        int seconds = 0;
        try {
            while (true) {
                System.out.println("Минуло " + seconds + " секунд");
                seconds++;
                Thread.sleep(1000); // Затримка на 1 секунду
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
