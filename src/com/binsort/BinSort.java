package com.binsort;

import com.bin.Bin;

import java.util.ArrayList;

/**
 * Operation count of sorting a set of n records with integer keys in the range 0 to m-1 uses O(n+m) operations.
 * Populating the Bin takes n time. There are n insertions and n deletions. There is a loop that goes through each
 * of the bins in Bins[0...m-1].
 * In the end, BinSort is heavily dependent on the range of integer keys, or in other words: m.
 */
public class BinSort {

    public BinSort() {
    }

    public ArrayList<Bin> createBins(int n){
        ArrayList<Bin> bins = new ArrayList<>();
        for(int i = 0; i <= n; i++){
            bins.add(new Bin());
            //populate bins array with n bins
        }
        return bins;
    }

    public ArrayList<Integer> binSort(int n, ArrayList<Integer> arr, ArrayList<Bin> bins){
        while( !arr.isEmpty() ){
            int last = arr.remove(arr.size() - 1);
            bins.get(last).enBin(last);
            bins.get(last).displayBin();
        }

        for(int i = 0; i < n; i++){
            while(!bins.get(i).isEmpty()){
                bins.get(i).displayBin();
                int a = bins.get(i).deBin();
                arr.add(a);
            }
        }
        return arr;
    }
}
