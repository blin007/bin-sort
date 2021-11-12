package com.bin;

import java.util.LinkedList;
import java.util.List;

/**
 * Characteristics of Bin data structure:
 *  FIFO - First in First Out
 *  Elements must be integers that are greater than 0
 */
public class Bin {
    private final LinkedList<Integer> linkedList;

    public Bin() {
        this.linkedList = new LinkedList<Integer>();
    }

    public boolean isEmpty() {
        return this.linkedList.peekFirst() == null;
    }

    public int binSize() {
        return this.linkedList.size();
    }

    public int getFirst() {
        int first = -1;
        try{
            first= this.linkedList.getFirst();
        }
        catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("Bin does not have a head: Bin is empty");
            throw e;
        }
        return first;
    }

    public int getLast() {
        int last = -1;
        try{
            last = this.linkedList.getLast();
        }
        catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("Bin does not have a tail: Bin is empty");
            throw e;
        }
        return last;
    }

    /**
     * enBin appends an integer to the front of the Bin
     * Terminates if the input is negative
     */
    public void enBin(int input){
        if (input < 0){
            System.out.println("Please input array has a negative element: " + input);
            return;
        }
        this.linkedList.addFirst(input);
    }

    /** deBin removes the last integer in the Bin */
    public int deBin(){
        //this.linkedList.removeLast();
        int last = -1;
        try{
            last = this.linkedList.removeLast();
        }
        catch(NullPointerException e){
            e.printStackTrace();
            System.out.println("Cannot remove tail: Bin is empty");
            throw e;
        }
        return last;
    }

    /** converts the Bin to a List */
    public List<Integer> binToList(){
        return this.linkedList.stream().toList();
    }

    public void displayBin(){
        System.out.println("bin: " + this.linkedList);
    }
}
