package lec17_18;

public class linkedlistclient {
    public static void main(String[] args) {
//        linkedlist list = new linkedlist();
//        list.insertfirst(1);
//        list.insertfirst(2);
//        list.insertfirst(3);
//        list.insertfirst(34);
//        list.insertfirst(7);
//        list.insertlast(3);
//        list.insertfirst(4);
//        list.insertlast(5);
//        list.insertlast(5);
//        list.insertlast(5);
//        System.out.println(list.deletefirst());
////        System.out.println(list.deletelast());
//        list.display();
//        System.out.println(list.getnode(2));
//        System.out.println(list.getnode(1));


//        list.insertinbetweeen(2,10);
//        list.display();
//        list.deleteinbetween(2);
//        list.display();
//
//        System.out.println("remobe duplicates are");
//       list.removeduplicate();
//       list.display();
//        System.out.println("reverse is");
//        list.reverse();
//        list.display();

       // System.out.println(list.vertex(2));
//    linkedlist list1 = new linkedlist();
//        linkedlist list2 = new linkedlist();
//        list1.insertlast(1);
//        list1.insertlast(2);
//        list1.insertlast(3);
//        list2.insertlast(4);
//        list2.insertlast(5);
//        list2.insertlast(6);
//        linkedlist list3 = new linkedlist();
//        list3=list3.merge(list1,list2);
//
//        System.out.println("merge of teo linked list");
//        list3.display();
//
//        System.out.println("mid is");
//        System.out.println(list.mid());

        linkedlist list4 = new linkedlist();
        list4.insertlast(10);
        list4.insertlast(8);
        list4.insertlast(3);
        list4.insertlast(4);
        list4.insertlast(6);
        list4.insertlast(7);
//        System.out.println("merge sort is");
//        list4=list4.mergesort(list4);
//        list4.display();
        System.out.println("kth from last");
        System.out.println( list4.kth(2));

//        System.out.println(" separsste odd even");
//        list4=list4.oddeven(list4);
//        list4.display();
//
//        System.out.println("separete second");
//
//        list4.oddeven2();
//        list4.display();

    }
}
