package com.mapbar.misc;

import com.mapbar.util.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class JudgeCircle657Test {

    private JudgeCircle657 judgeCircle657 = new JudgeCircle657();

    @Test
    public void judgeCircle() {
        Assert.assertTrue(judgeCircle657.judgeCircle("UD"));
        Assert.assertTrue(judgeCircle657.judgeCircle("ULDR"));
        Assert.assertFalse(judgeCircle657.judgeCircle("LL"));
    }
}