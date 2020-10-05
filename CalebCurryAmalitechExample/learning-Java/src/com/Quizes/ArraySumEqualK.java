package com.Quizes;

public class ArraySumEqualK {
    /*Given an array A of size Nrewrite.com
      web
     * We need to find all pairs in the array that sum to a number equal to K.
     * If no such pair exists then output will be -1
     * Array elements are distinct and in a sorted order
     * */
    public static void main(String[] args)
    {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int sum = 9;
        int low = 0;

        int high = arr.length - 1;

        while (low < high)
        {

            if (arr[low] + arr[high] > sum)
              {
                high--;

              }
            else if (arr[low] + arr[high] <sum)
            {
                low++;
            } else if ((arr[low]) + arr[high] == sum)
            {
                System.out.println("Pair (" +arr[low] + "," + arr[high] + ")");
                low++;
                high--;
            }
        }
    }



}
