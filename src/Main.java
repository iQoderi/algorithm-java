import sort.*;

public class Main {
    public static void main(String[] args) {
        Sort mySort=new Sort();
        int[] array={8, 5, 10, 12, 7, 6, 15, 9, 11, 3};
        mySort.insertSort(array,10);
        System.out.println(array);
    }
}
