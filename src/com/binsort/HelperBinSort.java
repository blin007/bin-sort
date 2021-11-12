package com.binsort;

import java.util.ArrayList;

/**
 * This class contains helper methods for the BinSort class
 */
public class HelperBinSort {

    /** Deletes the last element in arr and returns shortened arr*/
    public ArrayList<Integer> deleteFrom(ArrayList<Integer> arr){
        int n = arr.size();
        Integer res = arr.remove(n-1);
        return arr;
    }

    /** returns the last element in arr*/
    public int lastOf(int[] arr){
        return arr[arr.length-1];
    }

    public boolean isEmpty(int[] arr){
        return arr.length == 0;
    }
}
