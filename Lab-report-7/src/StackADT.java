class StackOverflowException extends Exception {
    public StackOverflowException(String message) {
        super(message);
    }
}

class StackUnderflowException extends Exception {
    public StackUnderflowException(String message) {
        super(message);
    }
}

public interface StackADT {
    void push(int numIn) throws StackOverflowException;

    int pop() throws StackUnderflowException;

    int size();
}
