import TasksJava2.CalculatorTasks.Division;
import org.junit.*;
public class TestCalculator {
    @Test
    public void testOfDivisionFunction (){
        Division d1 = new Division();
        Assert.assertEquals(1,d1.division1(15.0,15.0),0);
    }
}
