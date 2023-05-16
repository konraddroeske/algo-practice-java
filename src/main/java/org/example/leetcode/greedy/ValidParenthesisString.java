package org.example.leetcode.greedy;


import static java.lang.Math.max;

public class ValidParenthesisString {
    public boolean checkValidString(String s) {
        int leftMax = 0;
        int leftMin = 0;

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);

            if (cur == '(') {
                leftMax++;
                leftMin++;
            } else if (cur == '*') {
                leftMax++;
                leftMin = max(0, leftMin - 1);
            } else {
                leftMax--;
                leftMin = max(0, leftMin - 1);
            }

            if (leftMax < 0) {
                return false;
            }
        }

        return leftMin == 0;
    }
}
