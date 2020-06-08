package lec14_lec15;

public class circularclient {
    public static void main(String[] args) {
        circularque queue = new circularque();
        for (int i = 0; i <=5 ; i++) {
            queue.insert(i);
        }
        queue.display();

//        System.out.println();
//
        System.out.println(queue.delete());
//
//        System.out.println();
//
//        queue.delete();
        queue.insert(8);
//
//        System.out.println();
//
        queue.display();
//
//        System.out.println(queue.delete());
//
//        queue.display();

    }
}
