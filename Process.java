import java.util.ArrayList;

public class Process {
    //create variables
    ArrayList threads;
    String state;
    String[] input;
    String[] output;
    int[] memory;
    int priority;
    int processID = 1;

    //when a process is created it should be added to the process array list
    static ArrayList<Process> processArray = new ArrayList<>();

    //constructor
    public Process(ArrayList threads, String state, String[] input, String[] output, int[] memory, int priority, int processID) {
        this.threads = threads;
        this.state = state;
        this.input =input;
        this.output = output;
        this.memory = memory;
        this.priority = priority;
        this.processID = processID;

        //everytime this is called, a new processID is created
        // processID++;
    }

    //getters
    public ArrayList getThreads() {
        return threads;
    }

    public String getState() {
        return state;
    }

    public String[] getInput() {
        return input;
    }

    public String[] getOutput() {
        return output;
    }

    public int[] getMemory() {
        return memory;
    }

    public int getPriority() {
        return priority;
    }

    public int getProcessID() {
        return processID;
    }
}