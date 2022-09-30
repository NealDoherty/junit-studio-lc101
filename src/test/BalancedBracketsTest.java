package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void assertTrue1() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void assertTrue2() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void assertTrue3() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void assertTrue4() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void assertFalse1() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void exception1() {
        BalancedBrackets.hasBalancedBrackets("Launch]Code[");
        fail("Shouldn't get here, out of order brackets present in this test case");
    }

    @Test
    public void assertFalse2() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test(expected = IllegalArgumentException.class)
    public void exception2() {
        BalancedBrackets.hasBalancedBrackets("][");
        fail("\"Shouldn't get here, out of order brackets present in this test case\"");
    }

    @Test
    public void assertTrue5() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("This string contains text and special characters but no " +
                "brackets }) !.?/,:'"));
    }

    @Test
    public void assertFalse3() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("}{}{}[[[sad][d ascdjkasbldcjkasld][]as[d][as]d["));
    }
}

