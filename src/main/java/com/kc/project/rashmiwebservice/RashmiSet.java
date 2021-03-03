package com.kc.project.rashmiwebservice;

public class RashmiSet {

    int[] intArr = new int[5];

    int count = 0;

    public int size() {
        return count;
    }


    public void add(int item) {
        for (int k : intArr) {
            if (k == item) {
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
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] == item) {
                index = index + (i + 1);
                intArr[index] = intArr[count - 1];
                intArr[count - 1] = 0;
                count--;
                break;
            }
        }
    }
}