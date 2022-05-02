import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    
    @Test
    public void returnNum() {
        assertEquals(4, SkillDemo.returnNum(3));
    }
}
