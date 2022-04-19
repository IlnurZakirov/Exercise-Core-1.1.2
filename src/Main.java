public class Main {

    public static void main(String[] args) {
        int numberOffError = 33;
        OnTaskDoneListener listener = System.out::println;
        Worker worker = new Worker(listener);
        worker.start(taskNumber -> taskNumber == numberOffError);
    }
}
