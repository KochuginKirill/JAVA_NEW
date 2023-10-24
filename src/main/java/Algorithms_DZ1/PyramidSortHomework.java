package Algorithms_DZ1;

public class PyramidSortHomework {
    public static void main(String[] args) {
        int[] inputArrray = {45, 76, 599, 635, 1, -120, 1000, 11};
        heapSort(inputArrray);
        for (int j : inputArrray) System.out.print(j+" ");
    }
    public static void heapSort(int[] unsortedArray) {
        int n = unsortedArray.length;
        for (int i = n / 2-1; i >= 0; i--)
            heapify(unsortedArray, i, n);
        for (int i = n-1; i >= 0; i--) {
            int temp = unsortedArray[i];
            unsortedArray[i] = unsortedArray[0];
            unsortedArray[0] = temp;
            heapify(unsortedArray, 0, i);
        }
    }

    private static void heapify(int[] inputArray, int i, int n) {
        int left = i * 2+1;
        int right = i * 2+2;
        int largest = i;
        if (left < n && inputArray[left] > inputArray[largest])
            largest = left;
        if (right < n && inputArray[right] > inputArray[largest])
            largest = right;
        if (i != largest) {
            int temp = inputArray[i];
            inputArray[i] = inputArray[largest];
            inputArray[largest] = temp;
            heapify(inputArray, largest, n);
        }
    }
}
