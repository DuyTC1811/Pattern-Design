package strategy;

public class QuickSort implements SortStrategy {
    @Override
    public void sort(int[] items) {
        System.out.println("------Quick sort------");
        quickSort(items, 0, items.length - 1);
    }

    /**
     * Chức năng chính thực hiện QuickSort arr[] -> Mảng cần sắp xếp, thấp -> Chỉ số bắt đầu, cao -> Chỉ số kết thúc
     */
    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            // pi là chỉ mục phân vùng, arr[p]
            // hiện đang ở đúng nơi
            int pi = partition(arr, low, high);

            // Sắp xếp riêng các phần tử trước
            // Phân vùng và sau phân vùng
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // A utility function to swap two elements
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    private int partition(int[] arr, int low, int high) {
        // trục
        int pivot = arr[high];

        // Chỉ số của phần tử nhỏ hơn và
        // chỉ ra đúng vị trí
        // của trục được tìm thấy cho đến nay
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // Nếu phần tử hiện tại nhỏ hơn
            // so với trục
            if (arr[j] < pivot) {
                // Chỉ số gia tăng của
                // phần tử nhỏ hơn
                i++;
                swap(arr, i, j);
                display(arr);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    public void display(int[] arr) {
        int i;
        System.out.print("[");
        // Duyet qua tat ca phan tu
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]\n");
    }
}
