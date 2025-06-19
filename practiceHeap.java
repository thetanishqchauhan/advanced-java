class heap{
    int arr[] = new int[20];
    int size = 0;

    void insert(int val){
        size += 1;
        int index = size;
        arr[index] = val;
        
        while (index > 1) {
            if (arr[index] > arr[index/2]) {
                //swap
                int temp = arr[index];
                arr[index] = arr[index/2];
                arr[index/2] = temp;
                index = index/2;
            }
            else return;
        }
        
    }

    void print(){
        System.out.println("Max Heap: ");
        for(int i = 1; i <= size; i++){
            System.out.print(arr[i] + " ");
        }
    }

    void delete(){
        if(size == 0){
            System.out.println("Nothing to remove");
            return;
        }
        int index = 1;
        arr[index] = arr[size];
        size--;
        int leftChild = index*2;
        int rightChild = index*2 + 1;
        if(leftChild < size && arr[leftChild] > arr[index]){
            //swap
            int temp = arr[leftChild];
            arr[leftChild] = arr[index];
            arr[index] = temp;
            index = leftChild;
        }
        else if(rightChild < size && arr[rightChild] > arr[index]){
            //swap
            int temp = arr[rightChild];
            arr[rightChild] = arr[index];
            arr[index] = temp;
            index = rightChild;
        }
        else return;
    }

    void heapify(int arr[], int n, int i){
        int parent = i;
        int leftChild = 2*i;
        int rightChild = 2*i + 1;

        if (leftChild <= n && arr[parent] < arr[leftChild]) {
            parent = leftChild;
        }
        if (rightChild <= n && arr[parent] < arr[rightChild]) {
            parent = rightChild;
        }
        if (parent != i) {
            int temp = arr[parent];
            arr[parent] = arr[i];
            arr[i] = temp;
            heapify(arr, n, parent);
        }
        else return;
    }
    
    void heapSort(int arr[], int n){
        int i = 1;
        int size = n;
        while (size > 1) {
            // 1: swap
            int temp = arr[i];
            arr[i] = arr[size];
            arr[size] = temp;

            // 2: size - 1
            size--;

            // 3: heapify
            heapify(arr, size, i);
        }
    }
    
}

public class practiceHeap {
    public static void main(String[] args) {
        heap h = new heap();
        // h.insert(50);
        // h.insert(55);
        // h.insert(53);
        // h.insert(52);
        // h.insert(54);
        // h.print();
        // h.delete();
        // System.out.println();
        // System.out.println("Deletion: ");
        // h.print();

        int arr[] = {-1, 54, 53, 55, 52, 50};
        int n = 5;

        // heap creation
        for(int i = n/2; i > 0; i--){
            h.heapify(arr, n, i);
        }

        // heap sorting
        h.heapSort(arr, n);

        // print heap
        System.out.println("Printing the array now: ");
        for(int i = 1; i <= n; i++){
            System.out.print(arr[i] +  " ");
        }
        
    }
}
