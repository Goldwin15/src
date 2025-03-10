// Check if the given array is consecutive or not
// An array is said to be consecutive if the elements in the array are consecutive
// Ex: {1, 2, 3, 4, 5} is consecutive
// Ex: {1, 2, 3, 5, 6} is not consecutive
// Ex: {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} is consecutive
// Ex: {1, 2, 3, 4, 5, 6, 8, 9, 10} is not consecutive


public class Consecutive {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] + 1 == arr[i + 1]) {
                count++;
            }
        }
        if (count == n - 1) {
            System.out.println("Consecutive");
        } else {
            System.out.println("Not Consecutive");
        }
    }
}
