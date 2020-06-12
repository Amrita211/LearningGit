package lec17_18;

public class linkedlist {
    private Node head;
    private Node tail;
    private int size = 0;

    public class Node {
        int value;
        Node next;

        // private int size;
        public Node(int value) {
            this.value = value;
        }
    }

    public void insertfirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertlast(int value) {
        if (size == 0) {
            insertfirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }


    public void display() {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    // delete first
    public int deletefirst() {
        if (size == 0) {
            return -1;
        }
        int temp = head.value;
        head = head.next;
        size--;
        return temp;

    }

    public int deletelast() {
        if (size < 2) {
            return deletefirst();
        }
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        int val = tail.value;
        tail = temp;
        temp.next = null;
        size--;
        return val;

    }

    public Node getnode(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void insertinbetweeen(int index, int value) {
        if (index == 0) {
            insertfirst(value);
            return;

        }

        if (index == size) {
            insertlast(value);
            return;
        }
        Node prev = getnode(index - 1);
        Node temp = new Node(value);
        temp.next = prev.next;
        prev.next = temp;
        size++;

    }

    public int deleteinbetween(int index) {
        if (size == 0) {
            deletefirst();
            return -1;
        }
        if (index == size - 1) {
            deletelast();
            return -1;
        }
        Node prev = getnode(index - 1);

        int temp = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return temp;
    }

    // remove consecutive duplicate
    public void removeduplicate() {
        Node temp = head;
        while (temp.next != null) {
            if (temp.value == temp.next.value) {
                temp.next = temp.next.next;
                size--;
            } else {
                temp = temp.next;
            }
        }
        tail = temp;
    }

    // to find vertex in a linkedlist
    public Node vertex(int elem) {
        Node temp = head;
        while (temp.next != null) {
            if (elem == temp.value) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // reverse of linked list using recursion
    public void reverse() {
        reverse(head);

    }

    private void reverse(Node node) {
        if (node == tail) {
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    // merge two sorted linked list
    public linkedlist merge(linkedlist first, linkedlist sec){
        linkedlist mix = new linkedlist();
        Node f= first.head;
        Node s=sec.head;
        while (f != null && s != null) {
            if(f.value <s.value){
              mix.insertlast(f.value);
              f=f.next;

            }
            else{
                mix.insertlast(s.value);
                s=s.next;
            }
        }
        while(f!=null){
            mix.insertlast(f.value);
            f=f.next;
        }
        while(s!=null){
            mix.insertlast(s.value);
            s=s.next;
        }
        return mix;
    }

    // find mid

    public Node mid(){
        Node slow = head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast=fast.next.next;
        }
        return slow;

    }

    // merge sort of linkedlist
    public linkedlist mergesort(linkedlist list){
        if(list.size==1){
            return list;
        }
        Node mid = list.mid();
        linkedlist first = new linkedlist();
        first.head= list.head;
//        first.size=(list.size+1)/2;
        first.tail=mid;
        first.size=(list.size+1)/2;

        linkedlist second = new linkedlist();
        second.head= mid.next;
        second.tail=list.tail;
        second.size=list.size/2;
        mid.next=null;

        first=mergesort(first);
        second=mergesort(second);

        return merge(first,second);
    }
    // kth from last
   public int kth(int k){
        Node slow = head;
        Node fast = head;
       for (int i = 0; i <k ; i++) {
           fast=fast.next;
       }
       while(fast.next!=null){
           slow=slow.next;
           fast=fast.next;
       }
       return slow.value;
   }

   // separate odd and even iin a linkedlist
    public linkedlist  oddeven(linkedlist list){
        linkedlist odd = new linkedlist();
        linkedlist even = new linkedlist();
        //    Node temp = head;
        Node temp = list.head;
        while(temp!=null){
            if(temp.value%2!=0){
                odd.insertlast(temp.value);
            }
            else{
                even.insertlast(temp.value);
            }
            temp =temp.next;
        }
        odd.tail.next=even.head;
        odd.tail=even.tail;
        return odd;
    }
    // second approach for seapration odd even
    public void oddeven2() {
//        linkedlist odd = new linkedlist();
//        linkedlist even = new linkedlist();
        Node odd_head = null;
        Node even_head = null;
        Node odd_tail= null;
        Node even_tail = null;
        Node temp = head;
        while (temp != null) {
            if (temp.value % 2!= 0) {
                if (odd_head == null) {
                    odd_head = temp;
                    odd_tail = temp;
                } else {
                    odd_tail.next = temp;
                    odd_tail=temp;
                }
            }
           else{
                if (even_head == null) {
                    even_head = temp;
                    even_tail = temp;
                } else {
                    even_tail.next = temp;
                    even_tail=temp;
                }
            }
            temp =temp.next;
        }
        odd_tail.next= even_head;
        head = odd_head;
        tail= even_tail;
        tail.next=null;
    }
}
