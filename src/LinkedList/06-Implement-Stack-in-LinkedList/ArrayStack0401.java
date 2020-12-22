package LinkedList;

public class ArrayStack0401<E> implements LinkedList.Stack0401<E> {

    private LinkedList.Array0401<E> array0401;

    public ArrayStack0401(int capacity){
        array0401 = new LinkedList.Array0401<>(capacity);
    }

    public ArrayStack0401(){
        array0401 = new LinkedList.Array0401<>();
    }

    @Override
    public int getSize(){
        return array0401.getSize();
    }

    @Override
    public boolean isEmpty(){
        return array0401.isEmpty();
    }

    public int getCapacity(){
        return array0401.getCapacity();
    }

    @Override
    public void push(E e){
        array0401.addLast(e);
    }

    @Override
    public E pop(){
        return array0401.removeLast();
    }

    @Override
    public E peek(){
        return array0401.getLast();
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Stack: ");
        res.append('[');
        for(int i = 0; i < array0401.getSize() ; i ++){
            res.append(array0401.get(i));
            if(i != array0401.getSize() - 1)
                res.append(", ");
        }
        res.append("] top");
        return res.toString();
    }

    public static void main(String[] args) {

        ArrayStack0401<Integer> stack = new ArrayStack0401<>();

        for(int i = 0 ; i < 5 ; i ++){
            stack.push(i);
            System.out.println(stack);
        }

        stack.pop();
        System.out.println(stack);
    }
}
