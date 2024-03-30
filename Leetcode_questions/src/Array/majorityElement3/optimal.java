package Array.majorityElement3;

import java.util.*;

public class optimal {
    public class List<Integer> optimal(int[] arr){
        int size = arr.length;
        int cnt1= 0 , cnt2=0;

        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;

        List<Integer> ls = new ArrayList<>(); // list of answers

        for(int i =  0 ; i < size ; i++){
            if(cnt1 == 0 && el2 != arr[i]){
                el1 = arr[i];
                cnt1 = 1;
            }else if(cnt2 == 0 && el1 != arr[i]){
                el2 = arr[i];
                cnt2=1;
            }
            else if(arr[i] == el1) cnt1++;
            else if(arr[i] == el2) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }



        // Manually check if the stored elements in
        // el1 and el2 are the majority elements:
        cnt1 = 0; cnt2 = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] == el1) cnt1++;
            if (v[i] == el2) cnt2++;
        }

        int mini = (int)(n / 3) + 1;
        if (cnt1 >= mini) ls.add(el1);
        if (cnt2 >= mini) ls.add(el2);

        // Uncomment the following line
        // if it is told to sort the answer array:
        //Collections.sort(ls); //TC --> O(2*log2) ~ O(1);

        return ls;

    }
    public static void main(String args[]) {
        int[] arr = {11, 33, 33, 11, 33, 11};
        List<Integer> ans = majorityElement(arr);
        System.out.print("The majority elements are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }

    

}
