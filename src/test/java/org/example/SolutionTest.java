package org.example;

import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testApp()
    {
        Solution solution = new Solution();
        assertEquals(2, solution.runSolution(1));
    }

    public void test2App()
    {
        Solution solution = new Solution();
        assertEquals(4, solution.runSolution(2));
    }

}