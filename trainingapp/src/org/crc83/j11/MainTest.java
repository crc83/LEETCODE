package org.crc83.j11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testTwoSum_case1() {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        int[] output = new int[] {0,1};

        Main main = new Main();
        int[] actual = main.twoSum(nums,target);

        assertArrayEquals(output, actual);
    }

    @Test
    void testTwoSum_case2() {
        int[] nums = new int[]{3,2,4};
        int target = 6;
        int[] output = new int[] {1,2};

        Main main = new Main();
        int[] actual = main.twoSum(nums,target);

        assertArrayEquals(output, actual);
    }

    @Test
    void testTwoSum_case3() {
        int[] nums = new int[]{3,3};
        int target = 6;
        int[] output = new int[] {0,1};

        Main main = new Main();
        int[] actual = main.twoSum(nums,target);

        assertArrayEquals(output, actual);
    }
}