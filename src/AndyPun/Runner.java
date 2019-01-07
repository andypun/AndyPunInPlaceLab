package AndyPun;

public class Runner {

    public static void main(String[] args) {
        // write your code here
        int[] Arr= {8,6,7,5,3,0,9,10,1,2,3};
        System.out.print("Before: ");
        for (int num:Arr)
            System.out.print(num+" ");
        System.out.println();

        long time = System.nanoTime();
        SelectSort.selectSort(Arr);
        time = System.nanoTime() - time;

        System.out.print("After: ");
        for (int num:Arr)
            System.out.print(num+" ");
        System.out.println();

        System.out.println("Sort Time: " + time + " nanoseconds");
    }
}