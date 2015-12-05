package com.company;

public class Problem15_BinarySearch {
    public static int binarySearch(int[] arr, int startIndex, int endIndex, int x){
        int middleIndex = (startIndex + endIndex) / 2;
        int middleElem = arr[middleIndex];
        if(x == middleElem)
            return middleIndex;
        if(endIndex - startIndex == 0)
            return -1;
        if(x < middleElem){
            return binarySearch(arr, startIndex, middleIndex, x);
        }
        else{
            return binarySearch(arr, middleIndex + 1, endIndex, x);
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int n = 10;
        System.out.println(binarySearch(arr, 0, 9, n));
    }
}
// 0 9, middle = 4
// 4, 9, middle = 6
// 6, 9 middle = 7