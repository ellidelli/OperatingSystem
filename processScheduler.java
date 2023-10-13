import java.util.ArrayList;
import java.util.Random;

public class processScheduler {
    static int processID = 1;
    // create a method that randomly creates at least 5 processes
    public static void createProcesses() {
        Random random = new Random();

        System.out.println("-------------------");
        System.out.println("| ACTIVE PROCESSES |");
        System.out.println("-------------------");

        // pick a number between 5-10
        int process_amount = random.nextInt(6) + 5;

        // create that amount of processes passing in the threads
        for (int j = 0; j < process_amount; j++) {
            // pick a number between 3-40 for the threads
            int thread_amount = random.nextInt(38) + 3;

            // create that many threads and add them to an array
            ArrayList<Thread> threadArray = new ArrayList<>();
            for (int i = 0; i < thread_amount; i++) {
                int thread_number = 1;
                Thread newThread = new Thread(null, thread_number, null, 0);
                threadArray.add(newThread);
                thread_number++;
            }

            // creating the processes
            Process newProcess = new Process(threadArray, "Running", null, null, null, 0, processID);
            Process.processArray.add(newProcess);
            processID++;
        }

        //printing the array
        for (int f = 0; f < Process.processArray.size(); f++) {
            Process current = Process.processArray.get(f);
            System.out.println("Process ID: " + current.getProcessID() + " Threads: " + current.getThreads().size());
        }
    }

    //create a method that randomly terminates processes
    public static void terminateProcesses() {
        Random random = new Random();
        int terminate_amount = random.nextInt(Process.processArray.size()-1) +1;
        
        //terminate banner
        System.out.println("-------------------");
        System.out.println("|    TERMINATION   |");
        System.out.println("-------------------");

        //terminate amount loop
        for (int i = 0; i < terminate_amount; i++) {
            int terminate_index = random.nextInt(Process.processArray.size()/2) + 1;
            System.out.println("Terminating Process ID: " + Process.processArray.get(terminate_index).getProcessID());
            Process.processArray.remove(terminate_index);
        }
    }
}
