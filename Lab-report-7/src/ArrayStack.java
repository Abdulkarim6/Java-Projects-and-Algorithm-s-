public class ArrayStack implements StackADT {
    int arr[];
    int back;

    public ArrayStack(int arrSz) {
        arr = new int[arrSz];
        back = 0;
    }

    @Override
    public void push(int numIn) throws StackOverflowException {
        if (arr.length == back) {
            throw new StackOverflowException("Stack is full. Cannot push item: " + numIn);
        } else {
            arr[back] = numIn;
            back++;
        }
    }

    @Override
    public int pop() throws StackUnderflowException {
        if (back == 0) {
            throw new StackUnderflowException("Stack is empty. Cannot pop item.");
        } else {
            back--;
            int popValue = arr[back];
            return popValue;
        }
    }

    @Override
    public int size() {
        return back;
    }

}
