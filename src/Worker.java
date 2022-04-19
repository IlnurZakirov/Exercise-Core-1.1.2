import java.util.function.Predicate;

public class Worker {

    private final OnTaskDoneListener callback;

    public Worker(OnTaskDoneListener callback) {
        this.callback = callback;
    }

    public void start(Predicate<Integer> taskNumber) {
        for (int i = 0; i < 100; i++) {
            if (taskNumber.test(i)) {
                callback.onDone("Task " + i + " is not done");
            } else {
                callback.onDone("Task " + i + " is done");
            }
        }
    }
}
