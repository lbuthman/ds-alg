package linkedList;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingleLinkedListTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void displayList() {
        Node node = new Node(1);
        assertEquals(1, node.info);
    }
}