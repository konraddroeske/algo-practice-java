package org.example.leetcode.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidParenthesisStringTest {
    ValidParenthesisString solution = new ValidParenthesisString();

    @Test
    void checkValidString1() {
        String s = "()";
        Boolean result = solution.checkValidString(s);

        assertEquals(true, result);
    }

    @Test
    void checkValidString2() {
        String s = "(*)";
        Boolean result = solution.checkValidString(s);

        assertEquals(true, result);
    }

    @Test
    void checkValidString3() {
        String s = "(*))";
        Boolean result = solution.checkValidString(s);

        assertEquals(true, result);
    }

    @Test
    void checkValidString4() {
        String s = "((((()(()()()*()(((((*)()*(**(())))))(())()())(((())())())))))))(((((())*)))()))(()((*()*(*)))(*)()";
        Boolean result = solution.checkValidString(s);

        assertEquals(true, result);
    }

    @Test
    void checkValidString5() {
        String s = "(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())";
        Boolean result = solution.checkValidString(s);

        assertEquals(false, result);
    }

    @Test
    void checkValidString6() {
        String s = "(((((*)))**";
        Boolean result = solution.checkValidString(s);

        assertEquals(true, result);
    }
}