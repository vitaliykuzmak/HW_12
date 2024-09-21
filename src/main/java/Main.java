public class Main {

    public static void main(String[] args) {
        //Завдання 1: Виведення часу
        Thread timeThread = new Thread(new TimeTask());
        Thread messageThread = new Thread(new MessageTask());

        timeThread.start();
        messageThread.start();

        //Завдання 2: FizzBuzz
        int n = 15;
        FizzBuzz fizzBuzz = new FizzBuzz(n);

        Thread fizzThread = new Thread(new FizzTask(fizzBuzz));
        Thread buzzThread = new Thread(new BuzzTask(fizzBuzz));
        Thread fizzBuzzThread = new Thread(new FizzBuzzTask(fizzBuzz));
        Thread numberThread = new Thread(new NumberTask(fizzBuzz));
        Thread printerThread = new Thread(new PrinterTask(fizzBuzz));

        fizzThread.start();
        buzzThread.start();
        fizzBuzzThread.start();
        numberThread.start();
        printerThread.start();

        try {
            fizzThread.join();
            buzzThread.join();
            fizzBuzzThread.join();
            numberThread.join();
            printerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
