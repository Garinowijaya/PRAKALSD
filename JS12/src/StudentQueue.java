public class StudentQueue {
    Node front;
    Node rear;
    int size;
    final int MAX_SIZE = 100;

    public StudentQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return size == MAX_SIZE;
    }

    public void enqueue(Student std) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot add more students");
            return;
        }

        Node newNode = new Node(std);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Student " + std.name + " has been added to the queue");
    }

    public Student dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No students to serve");
            return null;
        } 

        Student servedStudent = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return servedStudent;
    }

    public Student peekFront() {
        if (isEmpty()) {
            return null;
        }
        return front.data;
    }

    public Student peekRear() {
        if (isEmpty()) {
            return null;
        }
        return rear.data;
    }

    public int getQueueSize() {
        return size;
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Queue has been cleared");
    }

    void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("\nCurrent Queue:");
        System.out.println("Total students in queue: " + size);
        System.out.println();

        Node current = front;
        int position = 1;
        while (current != null) {
            System.out.println("Position #" + position);
            current.data.display();
            current = current.next;
            position++;
        }
    }
}
