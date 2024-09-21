public class MessageTask implements Runnable {

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(5000); // Затримка на 5 секунд
                System.out.println("Минуло 5 секунд");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
