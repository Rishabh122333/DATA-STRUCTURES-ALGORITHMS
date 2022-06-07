public class DynamicQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int rear = 0;
    protected int front = 0;
    private int size = 0;

    public DynamicQueue(){
        this(DEFAULT_SIZE);
    }

    public DynamicQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void insert(int x) {
        if (isFull()){
            int[] temp = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i) % data.length];
            }
            front = 0;
            rear = data.length;
            data = temp;
        }
            data[rear++] = x;
            rear = rear % data.length;
            size++;
    }

    public int remove()  {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }

        int x = data[front++];
        front = front % data.length;
        size--;
        return x;
    }

    public int front() throws Exception{
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return data[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i] + " ");
            i++;
            i %= data.length;
        } while (i != rear);
        System.out.println();
    }
    public static void main(String[] args)  {
        DynamicQueue cqueue=new DynamicQueue(4);
        cqueue.insert(10);
        cqueue.insert(20);
        cqueue.insert(30);
        cqueue.insert(40);
        cqueue.insert(50);
        System.out.println(cqueue.remove());
        cqueue.display();
        cqueue.insert(10);
        System.out.println(cqueue.remove());
        System.out.println(cqueue.remove());
        cqueue.insert(20);
        cqueue.display();
    }
}
