import java.util.ArrayList;

public class subsequencesRecursion {

    static void subsequence(int i, ArrayList <Integer> list, int arr[], int n){
        if(i == n){
            if (list.isEmpty()) {
                System.out.println("{ }");
            }
            for (int item : list) {
                System.out.print(item + " ");
            }
            System.out.println();
            return;
        }
        list.add(arr[i]);
        subsequence(i + 1, list, arr, n);
        list.remove(list.size() - 1);
        subsequence(i + 1, list, arr, n);
    }
    
    public static void main(String[] args) {
        int arr[] = {3, 1, 2};
        int n = arr.length;
        ArrayList <Integer> list = new ArrayList<>();
        subsequence(0, list, arr, n);
    }

}
