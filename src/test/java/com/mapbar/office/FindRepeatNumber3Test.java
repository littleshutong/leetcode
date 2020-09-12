package com.mapbar.office;

import com.mapbar.util.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindRepeatNumber3Test {

    private FindRepeatNumber3 findRepeatNumber3 = new FindRepeatNumber3();

    @Test
    public void findRepeatNumber() {
        Assert.assertEquals(2, findRepeatNumber3.findRepeatNumber(new int[]{2, 3, 1, 0, 2, 5, 3}));
    }
}