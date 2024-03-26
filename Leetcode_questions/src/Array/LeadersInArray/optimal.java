package Array.LeadersInArray;

import java.util.ArrayList;

public class optimal {
    public static void main(String args[]) {
        int[] arr = { 10, 22, 12, 3, 0, 6 };
        ArrayList<Integer> ressuArrayList;
        ressuArrayList = learders(arr);
    }

    public static ArrayList<Integer> learders(int[] arr) {
        ArrayList<Integer> leaders = new ArrayList<>();
        int size = arr.length;
        int max = arr[size - 1];
        for (int i = size - 1; i >= 0; i--) {
            if (arr[i] >= max) {
                max = arr[i];
                leaders.add(max);
            }

        }
        return leaders;
    }
}
