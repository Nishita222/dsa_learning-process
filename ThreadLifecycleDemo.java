public class ThreadLifecycleDemo {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread-1 started (Name: " + Thread.currentThread().getName() + ")");
            try {
                System.out.println("Thread-1 is going to sleep for 3 seconds...");
                Thread.sleep(3000); // Pauses execution for 3000ms
                System.out.println("Thread-1 woke up and completed its task.");
            } catch (InterruptedException e) {
                System.out.println("Thread-1 was interrupted during sleep!");
                Thread.currentThread().interrupt();
            }
        }, "Worker-Thread-1");
        Thread thread2 = new Thread(() -> {
            System.out.println("Thread-2 started (Name: " + Thread.currentThread().getName() + ")");
            try {
                System.out.println("Thread-2 is waiting for Thread-1 to complete...");
                thread1.join(); // Thread-2 waits for thread1 to die
                System.out.println("Thread-1 has finished. Thread-2 now resuming...");
                System.out.println("Thread-2 completed.");
            } catch (InterruptedException e) {
                System.out.println("Thread-2 was interrupted while waiting!");
                Thread.currentThread().interrupt();
            }
        }, "Worker-Thread-2");
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
            System.out.println("\nBoth threads have terminated. Main thread ending.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}