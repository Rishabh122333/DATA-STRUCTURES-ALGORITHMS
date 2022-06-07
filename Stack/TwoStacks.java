public class TwoStacks {
    private static final int Default_size = 10;
    int size;
    int tos1, tos2;
    int stack[];

    TwoStacks() {
        this(Default_size);
    }

    TwoStacks(int s) {
        this.stack = new int[s];
        size = s;
        tos1 = -1;
        tos2 = size;
    }
    void push1(int x)
    {
        if (tos1>tos2 - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        else {
            tos1++;
            stack[tos1] = x;

        }
    }
    void push2(int x)
    {
        if (tos1>tos2 - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        else {
            tos2--;
            stack[tos2] = x;

        }
    }
    int pop1()
    {
        if (tos1<0) {
            System.out.println("Stack Underflow");
        }
        else {
            int x = stack[tos1];
            tos1--;
            return x;
        }
        return -1;
    }
    int pop2()
    {
        if (tos2>size) {
            System.out.println("Stack Underflow");
        }
        else {
            int x = stack[tos2];
            tos2++;
            return x;

        }
        return -1;
    }
    public static void main(String args[])
    {
        TwoStacks ts = new TwoStacks(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        System.out.println("Popped element from" + " stack1 is " + ts.pop1());
        ts.push2(40);
        System.out.println("Popped element from" + " stack2 is " + ts.pop2());
    }
    }

