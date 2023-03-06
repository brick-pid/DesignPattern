package com.company;

public class Context {
    private Operation op;

    public Context(Operation operation) {
        this.op = operation;
    }

    public float executeOperation(float a, float b) {
        return op.calculate(a, b);
    }
}
