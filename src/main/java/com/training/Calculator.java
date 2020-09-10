package com.training;

public class Calculator {
    private int value;
    public Calculator(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Calculator add(int v) {
        throw new UnsupportedOperationException();
    }

    public Calculator minus(int v) {
        throw new UnsupportedOperationException();
    }

    public Calculator divide(int v) {
        throw new UnsupportedOperationException();
    }

    public Calculator sqrt() {
        throw new UnsupportedOperationException();
    }

    public Calculator times(int v) {
        throw new UnsupportedOperationException();
    }

    public Calculator modulo(int v) {
        throw new UnsupportedOperationException();
    }
}
