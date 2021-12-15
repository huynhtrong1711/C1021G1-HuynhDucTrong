package ss11_stack_queue.thuc_hanh.trien_khai_queue;

public class MyLinkedListQueue {
    private None head;
    private None tail;

    public MyLinkedListQueue() {
        this.head = head;
        this.tail = tail;
    }
    public void enqueue(int key) {
        None temp = new None(key);
        if (this.tail == null) {
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }
    public None dequeue() {
        if (this.head == null)
            return null;
        None temp = this.head;
        this.head = this.head.next;
        if (this.head == null)
            this.tail = null;
        return temp;
    }
}
