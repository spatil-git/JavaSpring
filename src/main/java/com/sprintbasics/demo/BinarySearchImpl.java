package com.sprintbasics.demo;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BinarySearchImpl implements SearchIntf {
    @Override
    public int search(int[] array, int toFind) {
        Arrays.sort(array);
        int left = 0;
        int right = array.length-1;
        while(left <= right) {
            int mid = (right-left)/2;
            if(array[mid] == toFind) {
                return mid;
            } else if(array[mid] > toFind) {
                // move left
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return -1;
    }
}
