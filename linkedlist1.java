package lec19;


import lec17_18.linkedlist;

// kth from last
public class linkedlist1 {

    private linkedlist.Node head;
    private linkedlist.Node tail;
    private int size = 0;

    public class Node {
        int value;
        linkedlist.Node next;

        // private int size;
        public Node(int value) {
            this.value = value;
        }
    }

}
