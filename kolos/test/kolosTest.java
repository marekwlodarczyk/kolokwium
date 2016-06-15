
import static kolos.Kolos.count;
import org.junit.Test;
import static org.junit.Assert.*;

public class kolosTest {

    @Test
    public void test()
    {
        int A[] = {0,1,0,1,1};
        int countedA = count(A);
        int expCount = 5;
        assertEquals(expCount, countedA);    
    }
}
