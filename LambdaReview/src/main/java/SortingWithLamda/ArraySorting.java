package SortingWithLamda;

public class ArraySorting {
    public static void main(String[] args) {

        ArraySorting arraySorting=new ArraySorting();

        QuickSort qs=new QuickSort();
        BubblesSorting bs=new BubblesSorting();

//        arraySorting.sort(qs);
//        arraySorting.sort(bs);

        /*
        We are creating our lambda expression it needs match with the functional interface
        In the interface; no parameter and no return type
         */
        Sorting quickSort=()-> System.out.println("QuickSorting");
        Sorting bubblesSorting=()-> System.out.println("BubblesSorting");
        /*
        After creating lambda expression we don't need QuickSort and BubblesSorting
        class and their objects.
         */

        System.out.println("==========Sorting With Lambda============");
        arraySorting.sort(quickSort);
        arraySorting.sort(bubblesSorting);
        System.out.println("=========Directly Put the Method In Lambda===========");
        arraySorting.sort(()-> System.out.println("QuickSorting"));
        arraySorting.sort(()-> System.out.println("BubblesSorting"));




    }

    private void sort(Sorting sorting){
        sorting.sort();
    }
}
