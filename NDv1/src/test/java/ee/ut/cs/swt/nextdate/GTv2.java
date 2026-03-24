package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv2 {

	@Test(timeout = 4000)
	public void testCreatesNextDate1() throws Throwable {
	    NextDate nextDate0 = new NextDate(3, 3, 3);
	    String string0 = nextDate0.run(3, 3, 1819);
	    assertEquals("3/4/1819", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate0() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(1, 1851, 1851);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate3() throws Throwable {
	    NextDate nextDate0 = new NextDate(11, 11, 11);
	    String string0 = nextDate0.run(11, 11, 1819);
	    assertEquals("11/12/1819", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate2() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(1, 31, 1869);
	    assertEquals("2/1/1869", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate5() throws Throwable {
	    NextDate nextDate0 = new NextDate(6, 6, 6);
	    String string0 = nextDate0.run(6, 30, 1842);
	    assertEquals("7/1/1842", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate4() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(4, 31, 1835);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
	    NextDate nextDate0 = new NextDate(3824, 3824, 3824);
	    String string0 = nextDate0.run(2, 28, 1804);
	    assertEquals("2/29/1804", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate(691, (-1760), (-1760));
	    String string0 = nextDate0.run((-1760), 691, 691);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate((-169), (-169), (-169));
	    String string0 = nextDate0.run((-169), (-169), (-169));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive1() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(1, 1, 1);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate14() throws Throwable {
	    NextDate nextDate0 = new NextDate(7, 7, 7);
	    String string0 = nextDate0.run(7, 7, 1819);
	    assertEquals("7/8/1819", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive0() throws Throwable {
	    NextDate nextDate0 = new NextDate(1752, 1752, 1752);
	    String string0 = nextDate0.run(1752, 1752, 1752);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate13() throws Throwable {
	    NextDate nextDate0 = new NextDate(5, 5, 5);
	    String string0 = nextDate0.run(5, 5, 1869);
	    assertEquals("5/6/1869", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate16() throws Throwable {
	    NextDate nextDate0 = new NextDate(10, 10, 10);
	    String string0 = nextDate0.run(10, 10, 1869);
	    assertEquals("10/11/1869", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive2() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(1, 3554, 3554);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate15() throws Throwable {
	    NextDate nextDate0 = new NextDate(8, 8, 8);
	    String string0 = nextDate0.run(8, 8, 1906);
	    assertEquals("8/9/1906", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate17() throws Throwable {
	    NextDate nextDate0 = new NextDate(3811, 3811, 3811);
	    String string0 = nextDate0.run(9, 9, 1813);
	    assertEquals("9/10/1813", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate7() throws Throwable {
	    NextDate nextDate0 = new NextDate(21, 21, 21);
	    String string0 = nextDate0.run(12, 21, 1803);
	    assertEquals("12/22/1803", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate6() throws Throwable {
	    NextDate nextDate0 = new NextDate(2848, 2848, 2848);
	    String string0 = nextDate0.run(12, 31, 2021);
	    assertEquals("Invalid Next Year", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate9() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(2, 1, 1861);
	    assertEquals("2/2/1861", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate8() throws Throwable {
	    NextDate nextDate0 = new NextDate(8, 8, 8);
	    String string0 = nextDate0.run(12, 31, 1906);
	    assertEquals("1/1/1907", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate10() throws Throwable {
	    NextDate nextDate0 = new NextDate(29, 29, 29);
	    String string0 = nextDate0.run(2, 29, 1849);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate12() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(2, 31, 1861);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate11() throws Throwable {
	    NextDate nextDate0 = new NextDate(28, 28, 28);
	    String string0 = nextDate0.run(2, 28, 1853);
	    assertEquals("3/1/1853", string0);
	}

}