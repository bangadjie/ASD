package pertemuan12;

public class DoubleLinkedList22 {
    Nodee22 head;
    Nodee22 tail;
    int size;

    public DoubleLinkedList22(){
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(Mhssiswa22 data) {
        Nodee22 newNode = new Nodee22(null, data, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Mhssiswa22 data) {
        Nodee22 newNode = new Nodee22(null, data, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;  
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void insertAfter(String keyNim, Mhssiswa22 data){
        Nodee22 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + "tidak ditemukan.");
            return;
        }
        Nodee22 newNode = new Nodee22(null, data,null);
        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        }else{
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
        size++;
    }

    public void removeFirst(){
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    public void removeLast(){
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        if (head == tail) {
            head = tail = null;
        }else{
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    public void print(){
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        Nodee22 current = head;
        while (current != null) {
            current.data.tampilInformasi();
            current = current.next;
        }
    }
}
