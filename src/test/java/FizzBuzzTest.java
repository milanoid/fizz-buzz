import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FizzBuzzTest {


    FizzBuzz fizzBuzz;


    @DataProvider(name = "fizzBuzzTestInputs")
    public Object[][] getData() {
        return new Object[][]{
                {"1", "1"},
                {"2", "2"},
                {"3", "fizz"},
                {"4", "4"},
                {"5", "buzz"},
                {"6", "fizz"},
                {"7", "7"},
                {"8", "8"},
                {"9", "fizz"},
                {"10", "buzz"},
                {"11", "11"},
                {"12", "fizz"},
                {"13", "13"},
                {"14", "14"},
                {"15", "fizzbuzz"},
        };
    }


    @BeforeClass
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }


    @Test(dataProvider = "fizzBuzzTestInputs")
    public void fizzBuzzTestWithDataProvider(String input, String output) {
        assertEquals(fizzBuzz.convert(input), output);
    }

}
