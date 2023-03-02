package org.example.counter;

public class Counter {
    private int value;

    // when we create an instance of this class, we want to init with 0
    public Counter() {
        this.value = 0;
    }

    // increment the counter by 1
    public void increment() {
        this.value += 1;

    }

    // decrease the counter by 1
    public void decrement() {
        this.value --;
    }

    // get value should return the value:
    public int getValue() {
        return this.value;
    }

    // this should reset the counter to 0
    public void reset() {
        this.value = 0;
    }
}
