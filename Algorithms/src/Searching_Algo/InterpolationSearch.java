package Searching_Algo;
// pre-requisites : list have to uniform i.e the items should have the same interval
// formula : Lo + ((Hi-Lo)/(a[hi] - a[lo])) * (x-a[lo])

// |----------------------------------------------|
// |  Time Complexity       | Space Complexity    |
// |----------------------------------------------|
// | Best  | O(log2(log2n)) |    NONE             |
// | Worst | O(n)           |    NONE             |
// |----------------------------------------------|


public class InterpolationSearch {

    public  int interpolationSearch(int arr[], int lo,
                                          int hi, int x)
    {
        int pos;

        // Since array is sorted, an element
        // present in array must be in range
        // defined by corner
        if (lo <= hi && x >= arr[lo] && x <= arr[hi]) {

            // Probing the position with keeping
            // uniform distribution in mind.
            pos = lo
                    + (((hi - lo) / (arr[hi] - arr[lo]))
                    * (x - arr[lo]));

            // Condition of target found
            if (arr[pos] == x)
                return pos;

            // If x is larger, x is in right sub array
            if (arr[pos] < x)
                return interpolationSearch(arr, pos + 1, hi,
                        x);

            // If x is smaller, x is in left sub array
            if (arr[pos] > x)
                return interpolationSearch(arr, lo, pos - 1,
                        x);
        }
        return -1;
    }
}
