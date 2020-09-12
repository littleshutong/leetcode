package com.mapbar.office;

public class IsNumber20 {

    public boolean isNumber(String s) {
        s = s.trim().toLowerCase();
        int n = s.length();
        if(n == 0) {
            return false;
        }
        boolean e = false;
        int count = 0;
        for(int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(ch == ' ') {
                return false;
            }
            if(ch >= 'a' && ch <= 'z' && ch != 'e') {
                return false;
            }
            if((ch == '+' || ch == '-') && i > 0
                    && !('0' <= s.charAt(i - 1) && s.charAt(i - 1) <= '9') && s.charAt(i - 1) != 'e') {
                return false;
            }
            if(ch == '.') {
                count++;
                if(count > 1) {
                    return false;
                }
            }
            if(ch == '.') {
                if(i == 0 && i == n - 1) {
                    return false;
                } else if(i > 0){
                    if(s.charAt(i - 1) == 'e' || s.charAt(i - 1) == '.') {
                        return false;
                    }
                    if(e) {
                        return false;
                    }
                }
            }
            if(ch == 'e') {
                e = true;
                if(i == 0 || i == n - 1) {
                    return false;
                } else {
                    char c = s.charAt(i - 1);
                    if(!(c >= '0' && c <= '9')) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
