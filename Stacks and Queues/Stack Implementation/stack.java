public class stack {

    // class variables
    private int[] arr;
    private int sizeOfArray = 0;
    private int sizeOfStack = 0;
    private int tos = -1; // top of stack

    // constructors 
    public stack {
        this.intialize(5); // taking default value 5
    }

    public stack(int size) {
        this.initialize(size); // user defined size
    }

    protected void initilize(int size) {
        this.arr = new int[size];
        this.sizeOfArray = size;
        this.sizeOfStack = 0;
        this.tos = -1;
    }

    // exceptions
    private void stackIsFullException() throws Exception {
        if (this.sizeOfArray == this.sizeOfStack)
            throw new Exception("stackIsFull");
    }

    private void stackIsEmptyException() throws Exception {
        if (this.sizeOfStack == 0)
            throw new Exception("stackIsEmpty");
    }

    // basic
    public boolean isEmpty() {
        return this.sizeOfStack == 0; // true if size is zero
    }

    public int size() {
        return this.sizeOfStack;
    }

    protected int sizeOfArray() { 
        return this.sizeOfArray;
    }

    // functions

    public void push(int val) throws Exception {
        stackIsFullException();
        this.tos++;
        this.arr[this.tos] = val;
        this.sizeOfStack++;
    }

    public int pop() throws Exception {
        stackIsEmptyException();
        int val = this.top();
        this.arr[this.tos] = 0;
        this.tos--;
        this.sizeOfStack--;

        return val;
    }

    public int top() throws Exception {
        stackIsEmptyException();
        return this.arr[this.tos];
    }
}

// client class
public class client {
    public static void main(String[] args) throws Exception {
        stack st = new stack();

        for (int i = 1; i <= 10; i++)
            st.push(i * 10);

        while (st.size() != 0)
            System.out.print(st.pop() + " ");
    }
}