package com.mapbar.util;

import com.mapbar.tree.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试类
 */
public class TestPrintUtil {

    @Test
    public void test() {
        String result = "1,2,3";
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        Assert.assertEquals(PrintUtil.printList(list), result);
        List<TreeNode> treeNodes = new ArrayList<>();
        treeNodes.add(new TreeNode(1));
        treeNodes.add(new TreeNode(2));
        treeNodes.add(new TreeNode(3));
        Assert.assertEquals(PrintUtil.printList(treeNodes), result);

    }
}
