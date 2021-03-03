package com.kc.project.rashmiwebservice;

import java.util.Arrays;

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

    public void addUnique(int item){
        boolean dulpicate=false;
        for(int j=0;j<intArr.length;j++){
            if(intArr[j]==item){
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
            int[] temp = new int[intArr.length-1];
            for(int j=0,k=0;j<intArr.length;j++){
                if(index==j || intArr[j]== item){
                    System.out.println("count:::" +count--);
                    continue;
                }
                temp[k++] = intArr[j];
            }
            intArr=temp;
    }
}