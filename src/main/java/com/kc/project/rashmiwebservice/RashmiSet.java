package com.kc.project.rashmiwebservice;

public class RashmiSet {

    int[] intArr = new int[5];

    int count = 0;
    public int size() {
        return count;
    }

    public void add(int item){
        intArr[count] = item;
        count++;
        if(count==intArr.length){
            int[] tempArr = new int[intArr.length * 2];
            for (int i=0; i < intArr.length; i++){
                tempArr[i] = intArr[i];
            }
            intArr = tempArr;
        }
    }
}