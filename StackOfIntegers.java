public class StackOfIntegers {
    private int[] elements;
    private int size;

    public StackOfIntegers() {
        this.size = 0;
        this.elements = new int[16];
    }

    public StackOfIntegers(int capacity) {
        this.size = 0;
        this.elements = new int[capacity];
    }

    public boolean empty() {
        return (this.size > 0 ? false : true);
    }

    public int peek() {
        return (this.empty() ? 0 : this.elements[this.size]);
    }

    public void push(int value) {
        this.elements[this.size] = value;
        this.size ++;
    }

    public int pop() {
        int num = this.elements[this.size - 1];
        // replace the previous value
        this.elements[this.size] = 0;
        this.size --;
        return num;
    }

    public int getSize() {
        return this.size;
    }
}