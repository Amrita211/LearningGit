package lec14_lec15;

public class circularque {
          private int[] ar ;
        private  int defaultsize= 10;
        private int size;
        private int front;

        private int end ;
        public  circularque (){
            this.ar= new int[defaultsize];
            this.front=0;
            this.end=0;
            this.size=0;
        }

        public  void insert(int elem){
            if(isfull()){
                System.out.println("full");
                return;
            }
            this.ar[end++]=elem;
            end = end%ar.length;
            size++;
        }
        public int delete(){
            if(isempty()){
                System.out.println("empty");
                return -1;
            }
            int temp =ar[front++];
//            for (int i = 1; i <end ; i++) {
//                ar[i-1]=ar[i];
//            }
            //front=front+1;
            front=front%ar.length;
            size--;
            return temp;

        }
        public boolean isfull(){
            return size==ar.length;
        }
        public boolean isempty(){
            return size==0;
        }
        public int front() {

            return ar[front];
        }
        public  void display(){
            for (int i = front; i <size ; i++) {
                System.out.println(ar[(front+i)%ar.length]);
            }
            System.out.println();
        }
    }


