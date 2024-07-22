package com.winside.perso.utils;

import com.winside.perso.entity.Expression;

import java.util.Stack;

public class ExpressionChecking {

    private Expression exp = new Expression();

    private boolean isValidExpression(final Expression ex) {
        boolean isValid = false;
        String symbol = ex.getExpression();
        Stack<Character> brackets = new Stack<>();
        Stack<Character> letters = new Stack<>();

        for (int i = 0; i < symbol.length(); i++) {
            if (symbol.charAt(i) == '(' || symbol.charAt(i) == '[') {
                brackets.push(symbol.charAt(i));
                System.out.println("brackets : " + brackets);
            } else if (symbol.charAt(i) == 'a' || symbol.charAt(i) == 'b' || symbol.charAt(i) == 'c' || symbol.charAt(i) == 'd') {
                letters.push(symbol.charAt(i));
                System.out.println("letters : " + letters);
            } else if ((symbol.charAt(i) == ')' && brackets.peek() == '(') || (symbol.charAt(i) == ']' && brackets.peek() == '[')) {
                if (!brackets.empty()) {
                    brackets.pop();
                } else if (!letters.empty()) {
                    letters.pop();
                }
            } else {
                brackets.push(symbol.charAt(i));
            }
        }

        if (brackets.empty()) {
            isValid = true;
            System.out.println("OK " + isValid);
        } else {
            System.out.println("NOPE " + isValid);
        }
        return isValid;
    }

    public void makeResult() {
        isValidExpression(exp);
    }
}
