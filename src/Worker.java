public class Worker {
    private OnTaskListener callback;
    OnTaskErrorListener errorCallback;
    public Worker(OnTaskListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;

    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if(errorCallback.onError(i) == 33) {
                System.out.println("Error on task: " + i);
                continue;
            }
            callback.onDone("Task " + i + " is done");
        }
    }
}
