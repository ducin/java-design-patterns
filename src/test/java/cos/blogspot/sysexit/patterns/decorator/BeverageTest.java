package cos.blogspot.sysexit.patterns.decorator;

import static org.junit.Assert.*;

import org.junit.Test;

import com.blogspot.sysexit.patterns.decorator.Beverage;
import com.blogspot.sysexit.patterns.decorator.DarkRoast;
import com.blogspot.sysexit.patterns.decorator.Decaf;
import com.blogspot.sysexit.patterns.decorator.Espresso;
import com.blogspot.sysexit.patterns.decorator.Milk;
import com.blogspot.sysexit.patterns.decorator.Mocha;
import com.blogspot.sysexit.patterns.decorator.Soy;
import com.blogspot.sysexit.patterns.decorator.Whip;

public class BeverageTest {

    @Test
    public void test() {
        Beverage beverage1 = new Espresso();
        beverage1 = new Milk(beverage1);
        assertEquals(2.09, beverage1.cost(), 0);
        assertEquals("Espresso, Milk", beverage1.getDescription());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Soy(beverage2);
        beverage2 = new Milk(beverage2);
        assertEquals(1.24, beverage2.cost(), 0);
        assertEquals("Dark roast, Soy, Milk", beverage2.getDescription());

        Beverage beverage3 = new Decaf();
        beverage3 = new Mocha(beverage3);
        beverage3 = new Mocha(beverage3);
        assertEquals(1.45, beverage3.cost(), 0);
        assertEquals("Decaf, Mocha, Mocha", beverage3.getDescription());
        beverage3 = new Whip(beverage3);
        assertEquals(1.55, beverage3.cost(), 0);
        assertEquals("Decaf, Mocha, Mocha, Whip", beverage3.getDescription());        
    }

}
