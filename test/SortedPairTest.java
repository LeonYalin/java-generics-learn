import com.leony.home.Person;
import com.leony.home.PersonFixtures;
import com.leony.home.SortedPair;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortedPairTest {

    @Test
    public void testAddSortedPair() {
        SortedPair<Person> pair = new SortedPair<>(PersonFixtures.me, PersonFixtures.nelly);
        assertTrue(pair.getFirst().getAge() == PersonFixtures.nelly.getAge());
        assertTrue(pair.getSecond().getAge() == PersonFixtures.me.getAge());
    }
}
