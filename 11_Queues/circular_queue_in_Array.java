public class circular_queue_in_Array {

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());

        queue.enqueue(6);
        queue.enqueue(7);

        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
        }
    }
    public static class CircularQueue {
        private int[] arr;
        private int front, rear, size, capacity;

        public CircularQueue(int capacity) {
            this.capacity = capacity;
            arr = new int[capacity];
            front = 0;
            rear = -1;
            size = 0;
        }

        public void enqueue(int data) {
            if (size == capacity) {
                System.out.println("Queue is full");
                return;
            }
            rear = (rear + 1) % capacity;
            arr[rear] = data;
            size++;
        }

        public int dequeue() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            int data = arr[front];
            front = (front + 1) % capacity;
            size--;
            return data;
        }


        
        public boolean isEmpty() {
            return size == 0;
        }
    }
}