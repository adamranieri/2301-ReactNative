package org.example.counter;

import org.junit.*;

public class CounterTest {
    // set up a Counter object that we can use in our tests
    static Counter counter;

    @BeforeClass
    public static void setUp() {
        counter = new Counter();

    }

    @Before
    public void init() {
        // reset the counter:
        counter = new Counter();
    }

    @After
    public void cleanUp() {

    }

    @AfterClass
    public static void cleanUpClass() {

    }

    @Test
    public void testGetCounter() {
        // assert just takes in a boolean and asserts that it's true
        Assert.assertEquals(0, counter.getValue());
    }

    @Test
    public void testIncrement() {
        // due to having the before methods set up, we should have an already-initialized counter object:
        counter.increment();
    }

}
