package com.mapbar.misc;

import com.mapbar.util.Assert;
import com.mapbar.util.PrintUtil;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder54 {

    public static void main(String[] args) {
        SpiralOrder54 spiralOrder54 = new SpiralOrder54();
        String ans = PrintUtil.printList(spiralOrder54.spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
        Assert.assertEquals(ans, "1,2,3,6,9,8,7,4,5");
        ans = PrintUtil.printList(spiralOrder54.spiralOrder(new int[][]{{1,2,3},{4,5,6}}));
        Assert.assertEquals(ans, "1,2,3,6,5,4");
        ans = PrintUtil.printList(spiralOrder54.spiralOrder(new int[][]{{1,2},{3,4},{5,6}}));
        Assert.assertEquals(ans, "1,2,4,6,5,3");
        ans = PrintUtil.printList(spiralOrder54.spiralOrder(new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}}));
        Assert.assertEquals(ans, "1,2,3,4,5,10,15,14,13,12,11,6,7,8,9");
        ans = PrintUtil.printList(spiralOrder54.spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15}}));
        Assert.assertEquals(ans, "1,2,3,6,9,12,15,14,13,10,7,4,5,8,11");
        ans = PrintUtil.printList(spiralOrder54.spiralOrder2(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
        Assert.assertEquals(ans, "1,2,3,6,9,8,7,4,5");
    }

    /**
     * 题解中更好些代码的方法
     * @param matrix
     * @return
     */
    public List<Integer> spiralOrder2(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        if(matrix.length == 0) {
            return ans;
        }
        if(matrix[0].length == 0) {
            return ans;
        }
        int m = matrix.length, n = matrix[0].length;
        int u = 0, d = m - 1, l = 0, r = n - 1;
        while(true) {
            for(int i = l; i <= r; i++) {
                ans.add(matrix[u][i]);
            }
            if(++u > d) {
                break;
            }
            for(int i = u; i <= d; i++) {
                ans.add(matrix[i][r]);
            }
            if(--r < l) {
                break;
            }
            for(int i = r; i >= l; --i) {
                ans.add(matrix[d][i]);
            }
            if(-- d < u) {
                break;
            }
            for(int i = d; i >= u; --i) {
                ans.add(matrix[i][l]);
            }
            if(++l > r) {
                break;
            }
        }
        return ans;
    }

    /**
     * 模拟算法流程进行遍历
     * @param matrix
     * @return
     */
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        if(matrix.length == 0) {
            return ans;
        }
        if(matrix[0].length == 0) {
            return ans;
        }
        int m = matrix.length, n = matrix[0].length;
        int min = Math.min(m, n);
        if(min % 2 == 1) {
            min = min + 1;
        }
        min = min / 2;
        for(int i = 0; i < min; i++) {
            // 打印上方行
            for(int j = i; j < n - i; j++) {
                ans.add(matrix[i][j]);
            }
            // 打印右侧列
            for(int j = i + 1; j < m - i; j++) {
                ans.add(matrix[j][n - i - 1]);
            }
            // 打印下方行, 限定有行的时候才能向左遍历m - i - 1 > i
            for(int j = n - i - 2; j > i - 1 && m - i - 1 > i; j--) {
                ans.add(matrix[m - i - 1][j]);
            }
            // 打印左侧列, 限定有列的时候才能向上遍历n - i - 1 > i
            for(int j = m - i - 2; j > i && n - i - 1 > i; j--) {
                ans.add(matrix[j][i]);
            }
        }
        return ans;
    }
}
