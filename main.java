public class main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long targetDuration = 10 * 60 * 1000;

        //loop to run for 10 min
        while (System.currentTimeMillis() - startTime < targetDuration) {
            processScheduler.createProcesses();
            processScheduler.terminateProcesses();
            
            //sleep for a second so its not overwhelming
            try {
                java.lang.Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
