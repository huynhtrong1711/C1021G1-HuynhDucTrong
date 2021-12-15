package ss11_stack_queue.bai_tap.trien_khai_queue;

public class Queue {
    private None front;
    private None rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enQueue(int key) {
        None temp = new None(key);
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }
        this.rear.link = temp;
        this.rear = temp;
    }

    public None deQueue(int key) {
        if (this.front == null)
            return null;
        None temp = this.front;
        this.front = this.front.link;
        if (this.front == null)
            this.rear = null;
        return temp;
    }
}
