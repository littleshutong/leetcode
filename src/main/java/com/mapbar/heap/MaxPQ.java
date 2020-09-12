package com.mapbar.heap;

/**
 *  优先级队列实现,数组节点从0开始
 */
public class MaxPQ <Key extends Comparable<Key>> {

    // 存储元素的数组
    private Key[] pq;
    // 当前PQ中元素个数
    private int N;

    public MaxPQ(int cap) {
        // 索引 0 不用，所以多分配一个空间
        pq = (Key[]) new Comparable[cap + 1];
    }

    /**
     * 返回当前堆中最大元素
     * @return
     */
    public Key max() {
        return pq[1];
    }

    /**
     * 插入元素
     */
    public void insert(Key key) {
        N++;
        if(N >= pq.length) {
            extend();
        }
        // 添加元素到最后
        pq[N] = key;
        // 上浮到正确位置
        swim(N);
    }

    /**
     * 扩充数组
     */
    private void extend() {
        // 以pq数组长度作为容量
        Key[] temp = (Key[]) new Comparable[(pq.length << 1) + 1];
        for(int i = 1; i < pq.length; i++) {
            temp[i] = pq[i];
        }
        pq = temp;
    }

    /**
     * 删除并返回最大元素
     */
    public Key delMax() {
        if( N == 0) {
            return null;
        }
        Key max  = pq[1];
        exch(1, N);
        pq[N] = null;
        N--;
        sink(1);
        return max ;
    }

    /**
     * 上浮第k个元素
     * @param k
     */
    public void swim(int k) {
        while(k > 1 && less(parent(k), k)) {
            exch(parent(k), k);
            k = parent(k);
        }
    }

    /**
     * 下浮第k个元素
     * @param k
     */
    public void sink(int k) {
        while(left(k) <= N) {
            // 假设左边节点大
            int older = left(k);
            // 如果右边节点存在比大小
            if(right(k) <= N && less(older, right(k))) {
                older = right(k);
            }
            if(less(older, k)) {
                break;
            }
            exch(older, k);
            k = older;
        }

    }

    /**
     * 交换两个位置内容
     * @param i
     * @param j
     */
    public void exch(int i, int j) {
        Key temp = pq[i];
        pq[i] = pq[j];
        pq[j] = temp;
    }

    /**
     * pq[i] 是否小于pq[j]
     * @param i
     * @param j
     * @return
     */
    public boolean less(int i, int j) {
        return pq[i].compareTo(pq[j]) < 0;
    }

    // 堆的三个操作
    /**
     * 寻找父节点
     * @param node 当前节点索引
     * @return
     */
    int parent(int node) {
        return node >> 1;
    }

    /**
     * 寻找左孩子
     * @param node 当前节点索引
     * @return
     */
    int left(int node) {
        return node << 1;
    }

    /**
     * 寻找右孩子
     * @param node 当前节点索引
     * @return
     */
    int right(int node) {
        return (node << 1) + 1;
    }
}
