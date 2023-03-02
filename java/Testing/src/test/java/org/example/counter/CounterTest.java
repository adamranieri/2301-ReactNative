package org.example.counter;

import org.junit.*;

public class CounterTest {
    // set up a Counter object that we can use in our tests
    static Counter counter;

    @BeforeClass
    public static void setUp() {
        // only initialize the counter once
        counter = new Counter();

    }

    @Before
    public void init() {
        // reset the counter back to 0:
        counter.reset();
    }

    @After
    public void cleanUp() {
        System.out.println("Clean up");

    }

    @AfterClass
    public static void cleanUpClass() {
        System.out.println("Clean up after class");

    }

    @Test
    public void testGetValue() {
        // assert just takes in a boolean and asserts that it's true
        Assert.assertEquals(0, counter.getValue());
    }

    //
    @Test
    public void testIncrement() {
        // due to having the before methods set up, we should have an already-initialized counter object:
        counter.increment();
        // assert that the counter has the right value:
        Assert.assertEquals(1, counter.getValue());


    }

    @Test
    public void testIncrementMultiple() {
        counter.increment();
        counter.increment();
        counter.increment();
        Assert.assertEquals(3, counter.getValue());
    }

    @Test
    public void testDecrement() {
        counter.decrement();
        // this isn't the optimal way to test because we're testing 2 methods
        // In our case, this could produce a false positive before we finish filling out the methods (getValue and decrement)
        Assert.assertEquals(-1, counter.getValue());
    }

    @Test
    public void testDecrementMultiple() {
        counter.decrement();
        counter.decrement();
        counter.decrement();
        Assert.assertEquals(-3, counter.getValue());
    }

    @Test
    public void testReset() {
        counter.increment();
        counter.increment();
        counter.reset();
        Assert.assertEquals(0, counter.getValue());
    }
}
