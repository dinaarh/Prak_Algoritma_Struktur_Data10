package P15;

public class DoubleLinkedList10 {
    Node10 head;
    int size;

    public DoubleLinkedList10() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    // jb 12 graph
    public void addFirst(int item, int jarak) {
        if (isEmpty()) {
            head = new Node10(null, item, jarak, null);
        } else {
            Node10 newNode = new Node10(null, item, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas.");
        }
        Node10 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    // jb 12 graph
    public int getJarak(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas.");
        }
        Node10 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.jarak;
    }

    // jb 12 graph dimodifikasi
    public void remove(int index) {
        Node10 current = head;
        while (current != null) {
            if (current.data == index) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                size--;
                break;
            }
            current = current.next;
        }
    }
}
