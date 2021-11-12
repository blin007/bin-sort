package com.main;

import com.bin.Bin;
import com.binsort.BinSort;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //TODO connect BinSort class to Main


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> input = new ArrayList<>();
        BinSort bsort = new BinSort();

        System.out.println("Enter range of array to be sorted (lower bound is 0): ");
        int n = sc.nextInt();

        System.out.println("Enter numbers in array now");
        System.out.println("To stop appending, input a string or char type");
        while(sc.hasNextInt()){
            int x = sc.nextInt();
            if ( x > n || x < 0){
                System.out.println("entered number: " + x);
                System.out.println("Please enter a value within the bound: 0 < input < " + n);
            }
            else{
                input.add(x);
            }
        }

        System.out.println("Input array: " + input);
        ArrayList<Bin> bins = bsort.createBins(n);
        ArrayList<Integer> sortedInput = bsort.binSort(n, input, bins);
        System.out.println("Sorted input array: " + sortedInput);

//        int[] test = {4,0,5,4,1,4,1};
//        int n = test.length;
//
//        System.out.println("bins size before populating: " + bins.size());
//        for (int i = 0; i < n; i++){
//            bins.add(new Bin());
//            //populate Bins with n bins
//        }
//        System.out.println("bins size after populating: " + bins.size());
//
//        for(int i = 0; i < bins.size(); i++){
//            Bin bin = bins.get(i);
//            bin.enBin(test[i]);
//
//        }
//        for (Bin bin : bins) {
//            bin.displayBin();
//            int last = bin.deBin();
//            System.out.println("Last: " + last);
//            bin.displayBin();
//        }
    }
}
