package ru.netology.maventest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxCalcServiceTest {
    @Test

    public void maxNumberA() {
        MaxCalcService myService = new MaxCalcService();
        int a = 5;
        int b = 4;

        int expected = a;
        int actual = myService.maxNumber(a, b);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxNumberB() {
        MaxCalcService myService = new MaxCalcService();
        int a = 6;
        int b = 7;

        int expected = b;
        int actual = myService.maxNumber(a, b);
        Assertions.assertEquals(expected, actual);
    }
}
