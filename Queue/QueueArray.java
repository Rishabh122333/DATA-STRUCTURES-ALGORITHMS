public class QueueArray {
    protected int queue[];
    private static final int Default_size=10;
    int rear =-1;
    QueueArray()

    {
        this(Default_size);
    }
    QueueArray(int size)
    {
        this.queue=new int[size];
    }
    public void add(int x)
    {
        if(isfull())
            System.out.println("Queue is full");
        else
        {
            rear++;
            queue[rear]=x;
        }
    }
    public int remove()
    {
        int x=-1;
        if(isempty())
            System.out.println("Queue is empty");
        else
        {
            x=queue[0];
            for (int i = 1; i < rear; i++) {
              queue[i-1]=queue[i];
            }
            rear--;
        }
        return x;
    }
    public int peek()
    {
        if(isempty())
            System.out.println("Queue is empty");
        return queue[0];
    }

    private boolean isfull() {
        return rear ==queue.length-1;
    }

    private boolean isempty() {
        return rear ==-1;
    }

    public static void main(String[] args) {
        QueueArray queue=new QueueArray(8);
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
