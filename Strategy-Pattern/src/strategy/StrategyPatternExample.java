package strategy;

public class StrategyPatternExample {
    public static void main(String[] args) {
        SortedList sortedList = new SortedList();
        int[] arr = {25, 30, 45, 6, 11, 90, 15};
        int[] arr2 = {10, 7, 8, 9, 1, 5, 2, 6};
        sortedList.setSortStrategy(new MergeSort());
        sortedList.sort(arr);

        sortedList.setSortStrategy(new QuickSort());
        sortedList.sort(arr2);
    }
}
