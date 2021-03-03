package com.kc.project.rashmiwebservice;

import java.util.Arrays;

public class RashmiSet {

    int[] intArr = new int[5];

    int count = 0;
    public int size() {
        return count;
    }



    public void add(int item) {
        for (int j = 0; j < intArr.length; j++) {
            if (intArr[j] == item) {
                return;
            }
        }
        intArr[count] = item;
        count++;
        if (count == intArr.length) {
            int[] tempArr = new int[intArr.length * 2];
            for (int i = 0; i < intArr.length; i++) {
                tempArr[i] = intArr[i];
            }
            intArr = tempArr;
        }
    }

    public void remove(int item) {
        int index = -1;
        for(int i=0;i<intArr.length;i++) {
            if (intArr[i] == item) {
            index = index+(i+1);
            break;
            }
        }
        if(index>0) {
            int[] temp = intArr;
            System.arraycopy(temp, size() - 1, intArr, index, 1);
            System.arraycopy(intArr, size(), intArr, size() - 1, 1);
            count--;
        }
    }
}