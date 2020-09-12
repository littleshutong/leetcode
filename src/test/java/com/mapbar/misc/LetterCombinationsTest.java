package com.mapbar.misc;

import com.mapbar.util.PrintUtil;
import org.junit.Test;

import java.util.List;

public class LetterCombinationsTest {

    private LetterCombinations17 letterCombinations = new LetterCombinations17();

    @Test
    public void letterCombinations() {
        List<String> temps = letterCombinations.letterCombinations("234");
        System.out.println(PrintUtil.printList(temps));
    }
}