public class SortArrayDescendingOrder {
    public static void main(String[] args) {
        int[] arr = {32, 232, 239,22, 1,85, 3282};

        for(int a : arr) {
            System.out.print(a + " ");
        }

        sortArrayDescending(arr);
        System.out.println();
        for(int b : arr) {
            System.out.print(b + " ");
        }
    }

    public static void sortArrayDescending(int[] arr) {
        int temp;
        boolean flag = true;

        while(flag) {
            flag = false;
            for(int i = 0; i < arr.length - 1; i++) {
                if(arr[i] < arr[i+1]) {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    flag = true;
                }
            }
        }
    }
}