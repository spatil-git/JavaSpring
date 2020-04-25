package com.sprintbasics.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ArrayLookup {

    @Autowired
    SearchIntf searchIntf = null;


    /**
     * Spring would fill in the bean using Constructor.
     * @param impl Instance of ArrayLookup class
     */
    /*public ArrayLookup(SearchIntf impl) {
        this.searchIntf = impl;
    }*/

    /**
     * Spring would fill in using setter.
     * @param searchIntf
     */
    public void setSearchIntf(SearchIntf searchIntf) {
        this.searchIntf = searchIntf;
    }

    public int search(int[] input, int toFind) {
        return searchIntf.search(input,toFind);
    }
}
