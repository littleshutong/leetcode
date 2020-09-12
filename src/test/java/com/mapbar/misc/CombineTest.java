package com.mapbar.misc;

import com.mapbar.ParamException;
import com.mapbar.util.Assert;
import com.mapbar.util.PrintUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CombineTest {

    private Combine combine = new Combine();

    @Test
    public void combine() throws ParamException {
        List<List<Integer>> c = combine.combine(4, 2);
        Assert.assertEquals(6, c.size());
        c = combine.combine(3, 2);
        Assert.assertEquals(3, c.size());
    }
}