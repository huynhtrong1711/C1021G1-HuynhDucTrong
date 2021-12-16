package ss13_thuat_toan_tim_kiem.thuc_hanh;

public class BinarySearch {
    static int[] list = {1,4,7,9,13,16,18,19,20,25};
    static int birarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println(birarySearch(list, 2));
        System.out.println(birarySearch(list, 11));
        System.out.println(birarySearch(list, 79));
        System.out.println(birarySearch(list, 1));
        System.out.println(birarySearch(list, 5));
        System.out.println(birarySearch(list, 80));
    }
}
