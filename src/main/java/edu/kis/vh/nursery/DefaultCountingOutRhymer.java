package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int INT = -1;
    public static final int NUMBERS_SIZE = 12;
    public static final int RETURN_ISFULL = 11;
    private int[] numbers = new int[NUMBERS_SIZE];

    public int total = INT;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() { return total == INT;
    }

    public boolean isFull() {
        return total == RETURN_ISFULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return INT;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return INT;
        return numbers[total--];
    }

}
