package com.sprintbasics.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class LinearSearchImpl implements SearchIntf {
    @Override
    public int search(int[] array, int toFind) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == toFind) {
                return i;
            }
        }
        return -1;
    }
}
