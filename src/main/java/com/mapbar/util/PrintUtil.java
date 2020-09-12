package com.mapbar.util;

import com.mapbar.Constants;

import java.util.List;

/**
 * 打印工具类， 对各种数据结构进行打印操作。
 */
public class PrintUtil {

    /**
     * 打印List结构信息
     * @param list
     * @param delimiter
     * @param <T>
     * @return
     */
    public static <T> String printList(List<T> list, String delimiter) {
        StringBuffer sb = new StringBuffer();
        if(list != null && list.size() > 0) {
            for(T t : list) {
                sb.append(t).append(delimiter);
            }
            if(sb.length() > 0) {
                sb.delete(sb.length() - delimiter.length(), sb.length());
            }
        }
        return sb.toString();
    }

    /**
     * 打印List结构信息，默认逗号分割
     * @param list
     * @param <T>
     * @return
     */
    public static <T> String printList(List<T> list) {
        return printList(list, Constants.COMMA_DELIMITER);
    }
}
