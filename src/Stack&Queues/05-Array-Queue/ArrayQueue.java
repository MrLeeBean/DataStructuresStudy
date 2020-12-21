package Stack;

public class ArrayQueue<E> implements Queue<E> {

    private Array0305<E> Array0305;

    public ArrayQueue(int capacity){
        Array0305 = new Array0305<>(capacity);
    }

    public ArrayQueue(){
        Array0305 = new Array0305<>();
    }

    @Override
    public int getSize(){
        return Array0305.getSize();
    }

    @Override
    public boolean isEmpty(){
        return Array0305.isEmpty();
    }

    public int getCapacity(){
        return Array0305.getCapacity();
    }

    @Override
    public void enqueue(E e){
        Array0305.addLast(e);
    }

    @Override
    public E dequeue(){
        return Array0305.removeFirst();
    }

    @Override
    public E getFront(){
        return Array0305.getFirst();
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Queue: ");
        res.append("front [");
        for(int i = 0 ; i < Array0305.getSize() ; i ++){
            res.append(Array0305.get(i));
            if(i != Array0305.getSize() - 1)
                res.append(", ");
        }
        res.append("] tail");
        return res.toString();
    }

    public static void main(String[] args) {

        Stack.ArrayQueue07<Integer> queue = new Stack.ArrayQueue07<>();
        for(int i = 0 ; i < 10 ; i ++){
            queue.enqueue(i);
            System.out.println(queue);
            if(i % 3 == 2){
                queue.dequeue();
                System.out.println(queue);
            }
        }
    }
}
