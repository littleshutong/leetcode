package com.mapbar.misc;

import com.mapbar.util.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Exist79Test {

    private Exist79 exist79 = new Exist79();
    @Test
    public void exist() {
        Assert.assertTrue(exist79.exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCCED"));
        Assert.assertTrue(exist79.exist(new char[][]{ {'A','B','C','E'}, {'S','F','C','S'}, {'A','D','E','E'}}, "SEE"));
        Assert.assertFalse(exist79.exist(new char[][]{ {'A','B','C','E'}, {'S','F','C','S'}, {'A','D','E','E'}}, "ABCB"));
        Assert.assertFalse(exist79.exist(new char[][]{ {'A','B','C','E'}, {'S','F','C','S'}, {'A','D','E','E'}}, "MV"));
        Assert.assertTrue(exist79.exist(new char[][]{ {'C','A','A'}, {'A', 'A', 'A'}, {'B', 'C', 'D'}}, "AAB"));
    }
}