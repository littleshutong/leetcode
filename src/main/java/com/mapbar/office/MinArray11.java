package com.mapbar.office;

public class MinArray11 {
    public int minArray(int[] numbers) {
        if(numbers.length == 0) {
            return 0;
        }
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] < numbers[i - 1]) {
                return numbers[i - 1];
            }
        }
        return numbers[0];
    }
}
