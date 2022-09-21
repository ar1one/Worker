public class Main {
    public static void main(String[] args) {
        OnTaskListener listener = System.out::println;
        OnTaskErrorListener error = a -> a;
        Worker worker = new Worker(listener, error);
        worker.start();
    }
}
