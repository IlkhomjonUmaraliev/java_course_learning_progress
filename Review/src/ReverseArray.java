public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for(int a : arr) {
            System.out.print(a + " ");
        }

        System.out.println("We called a method here");
        reverseArray(arr);

        for(int b : arr) {
            System.out.print(b + " ");
        }
    }

    public static void reverseArray(int[] arr) {
        int lastElement = arr.length - 1;
        int middle = lastElement / 2;

        for(int i = 0; i <= middle; i++) {
            int temp = arr[i];
            arr[i] = arr[lastElement - i];
            arr[lastElement - i] = temp;
        }
    }
}
