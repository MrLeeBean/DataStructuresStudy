package Arrays;

public class MainTest04 {

    public static void main(String[] args) {

        Arrays.Array04 arr = new Arrays.Array04(20);
        for(int i = 0 ; i < 10 ; i ++)
            arr.addLast(i);
        System.out.println(arr);

        arr.add(1, 100);
        System.out.println(arr);

        arr.addFirst(-1);
        System.out.println(arr);
    }
}
