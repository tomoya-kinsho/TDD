package tdd.demo;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    Factorial factorial = new Factorial();
    @Test
    public void _入力数値が1の時に1が出力される() {
        assertThat(factorial.calculate(1), is(1));
    }

    @Test
    public void _入力数値が10の時に3628800が出力される() {
        assertThat(factorial.calculate(10), is(3628800));
    }

    @Test
    public void _入力数値が0の時にー１が出力される() {
        assertThat(factorial.calculate(0), is(-1));
    }

    @Test
    public void _入力数値が11の時にー１が出力される() {
        assertThat(factorial.calculate(11), is(-1));
    }

    @Test
    public void _入力数値がー１の時にー１が出力される() {
        assertThat(factorial.calculate(-1), is(-1));
    }
}
