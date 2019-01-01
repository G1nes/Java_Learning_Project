import TasksJava2.CalculatorTasks.Division;
import org.junit.*;
public class TestCalculator {
    private static final float Infinity = 1/0f;

    @Test
    public void testOfDivisionFunction (){
        Division d1 = new Division();
        Assert.assertEquals(1,d1.division1(15.0,15.0),0);
    }
    @Test
    public void testDivZero(){
        Division d1 = new Division();
        Assert.assertEquals(Infinity,d1.division1(15.0,0.0),0);
        //Assert.assertEquals();
    }
}
