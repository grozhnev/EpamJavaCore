package task07;

import org.junit.Assert;
/*import org.junit.Test;*/


import java.util.ArrayList;

/**
 * JUnit test for InsertionSortTest class.
 */
public class InsertionSortTest {

    /*@Test*/
    public void testInsertionSort(){
        InsertionAndQuickSort sort = new InsertionAndQuickSort();

        ArrayList<Integer> input = new ArrayList<>();
        for (int i = 50; i > 0 ; i--) {
            input.add(i);
        }
        sort.makeInsertionSort(input);

        Assert.assertEquals(3, input.indexOf(input.get(2)));
    }
}

             