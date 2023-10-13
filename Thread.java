public class Thread {
    //create variables
    String[] instructions;
    int thread_number;
    String state;
    // int processID = Process.getProcessID();

    //constructor
    public Thread(String[] instructions, int thread_number, String state, int processID) {
        this.instructions = instructions;
        this.thread_number = thread_number;
        this.state = state;
        // this.processID = processID;
    }

    //getters
    public String[] getInstructions() {
        return instructions;
    }

    public int getThreadNumber() {
        return thread_number;
    }

    public String getState() {
        return state;
    }

    // public int getProcessID() {
    //     return processID;
    // }
}

