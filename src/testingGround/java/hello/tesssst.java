package hello;

public class tesssst {
    public static void main(String[] args) {
        int[] initArray = new int[]{17, 32, 1, 4, 25, 17, 0, 3, 10, 7, 64, 1};
        int llength = initArray.length;
        heapSort (initArray, llength);
    }
    public static void buildTree(int[] tree, int sortLength, int i) {
        int n = sortLength;
        int l = i * 2 + 1;
        int r = i * 2 + 2;
        int largest = i;

        if(l < n && tree[l] > tree[largest]){
            largest = l;
        }
        if(l < n && tree[r] > tree[largest]){
            largest = r;
        }

        if (i != largest){
            int temp = tree[i];
            tree[i] = tree[largest];
            tree[largest] = temp;


            buildTree(tree, n , largest);
        }
    }

    public static void heapSort(int[] sortArray, int sortLength) {
        int n = sortArray.length;
        int temp = 0;
        for (int i = n/2 - 1; i >= 0; i--){
            buildTree(sortArray, n , i);
        }

        for (int i = n - 1; i >= 0; i--){
            temp = sortArray[i];
            sortArray[i] = sortArray[0];
            sortArray[0] = temp;
            buildTree(sortArray, i , 0);
        }
    }
}

