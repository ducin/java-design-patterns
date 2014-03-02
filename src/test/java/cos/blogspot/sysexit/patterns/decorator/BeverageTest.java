package cos.blogspot.sysexit.patterns.decorator;

import static org.junit.Assert.*;

import org.junit.Test;

import com.blogspot.sysexit.patterns.decorator.Beverage;
import com.blogspot.sysexit.patterns.decorator.Espresso;
import com.blogspot.sysexit.patterns.decorator.Milk;

public class BeverageTest {

    @Test
    public void test() {
        Beverage beverage = new Espresso();
        beverage = new Milk(beverage);
        assertEquals(beverage.cost(), 2.09, 0);
    }

}
