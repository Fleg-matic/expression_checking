package com.winside.perso.entity;

public class Expression {

    private String expression = "(aa(bbb[cccc]))";

    public Expression() {
    }

    public Expression(String expression) {
        this.expression = expression;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }
}
