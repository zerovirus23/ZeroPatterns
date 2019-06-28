package co.zero.pattern.design.creation.singleton;

import co.zero.patterns.design.creation.singleton.SingletonAsEnum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SingletonTest {
    @Test
    public void testSingletonAsEnum() {
        SingletonAsEnum singleton1 = SingletonAsEnum.SINGLETON;
        SingletonAsEnum singleton2 = SingletonAsEnum.SINGLETON;

        assertEquals(singleton1, singleton2);
        assertTrue(singleton1 == singleton2);
        assertEquals(singleton1.getValue(), singleton2.getValue());

        singleton1.increaseValue();
        assertEquals(singleton1.getValue(), singleton2.getValue());
    }
}
