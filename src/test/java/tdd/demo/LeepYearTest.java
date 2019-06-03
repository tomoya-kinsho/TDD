package tdd.demo;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LeepYearTest {
    @Test
    public void _年歴が4で割り切れない場合にfalseを返す() {
        LeapYear leapYear;
        assertThat(LeapYear.isLeep(), is(false));
    }
}
