package edu.vsu.ru;

import org.jetbrains.annotations.NotNull;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public final class Tests {

    @Parameterized.Parameter
    public @NotNull TestCase testCase;

    @Parameterized.Parameters
    public static @NotNull Collection<TestCase> data(){
        List<TestCase> resList = Arrays.asList(
                        new TestCase (
                                new Integer[] {7, 10, 3, 8, 7, 2, 1, 9, 5, 7},
                                new boolean[] {true, false, true, true, false, false, true, true, false, true},
                                new Integer[] {1, 10, 3, 7, 7, 2, 7, 8, 5, 9}),


                        new TestCase (
                                new Integer[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
                                new boolean[]{true, false, true, true, false, false, true, true, false, true},
                                new Integer[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10}),

                        new TestCase (
                                new Integer[]{10},
                                new boolean[]{true},
                                new Integer[]{10})
        );
        return resList;
    }

    public static final class TestCase {
        public final Integer[] intArray;
        public final boolean[] boolArray;
        public final Integer[] resultArray;

        public TestCase(Integer[] intArray, boolean[] boolArray, Integer[] resultArray) {
            this.intArray = intArray;
            this.boolArray = boolArray;
            this.resultArray = resultArray;
        }
    }

    @Test
    public void testOfSort() {

        SortArray.sort(testCase.intArray, testCase.boolArray);

        Assert.assertArrayEquals(testCase.intArray, testCase.resultArray);
    }
}
