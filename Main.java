public class Main {
    public static int binarySearchI(int[] sortedList, int key) {
        int left = 0, right = sortedList.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;

            if (key == sortedList[middle]) {
                return middle;
            } else if (key < sortedList[middle]) {
                right = middle - 1;
            } else if (key > sortedList[middle]) {
                left  = middle + 1;
            }
        }

        return left;
    }
    public static void main(String[] args){
        int[] a={2,4,7,8};
        System.out.println(binarySearchI(a,7));
        System.out.println(binarySearchI(a,9));
    }
}
