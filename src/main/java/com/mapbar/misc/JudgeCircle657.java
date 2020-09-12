package com.mapbar.misc;

public class JudgeCircle657 {

    /**
     * 判断U和D， L和R操作次数是否相同
     * @param moves
     * @return
     */
    public boolean judgeCircle2(String moves) {
        int[] letters = new int[26 + 'A'];
        for (char c : moves.toCharArray()) {
            letters[c]++;
        }
        return letters['U'] == letters['D'] && letters['L'] == letters['R'];
    }

    /**
     * 模拟思路
     * @param moves
     * @return
     */
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for(int i = 0; i < moves.length(); i++) {
            char direct = moves.charAt(i);
            if(direct == 'L') {
                y--;
            } else if(direct == 'R') {
                y++;
            } else if(direct == 'U') {
                x--;
            } else if(direct == 'D') {
                x++;
            }
        }
        return x == 0 && y == 0;
    }
}
