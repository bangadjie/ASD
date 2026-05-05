package pertemuan12;

public class SingleLinkedList {
    Node22 head;
    Node22 tail;

    boolean isEmpty(){
        return (head == null);
    }

    public void print(){
        if (!isEmpty()) {
            Node22 tmp = head;
            System.out.print("Isi Linked List:\t");
            while (tmp != null){
                tmp.data.tampilkaninformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        }else{
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(MHSiswa22 input){
        Node22 ndInput = new Node22(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        }else{
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(MHSiswa22 input){
        Node22 ndInput = new Node22(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        }else{
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, MHSiswa22 input){
        Node22 ndInput = new Node22(input, null);
        Node22 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, MHSiswa22 input){
        if (index < 0) {
            System.out.println("indeks salah");
        }else if (index == 0){
            addFirst(input);
        }else{
            Node22 temp = head;
            for(int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.next = new Node22(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}
