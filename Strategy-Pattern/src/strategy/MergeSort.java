package strategy;

public class MergeSort implements SortStrategy {
    @Override
    public void sort(int[] items) {
        System.out.println("------Merge sort------");
        sort(items, 0, items.length - 1);
    }

    private void sort(int[] arr, int left, int right) {
        if (left < right) {

            // Tìm điểm chính giữa
            int mid = (left + right) / 2;

            // Hàm đệ quy tiếp tục chia đôi
            sort(arr, left, mid);
            sort(arr, mid + 1, right);
            merge(arr, left, mid, right);
            // hien thi mang
            display(arr);
        }
    }

    // Merge hai mảng con của arr[].
    // Mảng con thứ nhất là arr[l .. m]
    // Mảng con thứ hai là arr[m + 1..r]
    void merge(int[] arr, int left, int mid, int right) {

        // Tìm kích thước của 2 mảng con để merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Tạo mảng tạm
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy dữ liệu vào mảng tạm
        System.arraycopy(arr, left, L, 0, n1);
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];

        // Merge các mảng tạm lại

        // Chỉ mục ban đầu của 2 mảng con
        int i = 0, j = 0;

        // Chỉ mục ban đầu của mảng phụ được hợp nhất
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Sao chép các phần tử còn lại của L[] nếu có
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Sao chép các phần tử còn lại của R[] nếu có
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
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
