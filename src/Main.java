public class Main {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {1, 2, 2, 3, 3, 5, 6, 6, 6, 7, 8, 9, 9};
        int[] newList = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && list[i] == list[j]) {
                    if (!isFind(newList, list[i])) {
                        newList[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        for (int value : newList) {
            if (value != 0) {
                if (value % 2 == 0) {
                    System.out.println(value);
                }
            }
        }
    }
}