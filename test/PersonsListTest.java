import com.leony.home.Person;
import com.leony.home.PersonsList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonsListTest {

    @Before
    public void beforeEach() { /* empty */}

    @Test
    public void testAddToPersonsList() {
        PersonsList<String> personsList = new PersonsList<String>();
        assertEquals(personsList.size(), 0);

        // personsList.add(1); Won't let because of different type
        personsList.add("Leon");
        personsList.add("Nelly");

        assertEquals(personsList.size(), 2);
    }

    @Test
    public void testDifferentPersonsListTypes() {
        PersonsList<String> personsList = new PersonsList<>();
        personsList.add("Leon");
        assertNotNull(personsList.get(0));

        PersonsList<Integer> personsList2 = new PersonsList<>();
        personsList2.add(123);
        assertNotNull(personsList.get(0));
    }
}
