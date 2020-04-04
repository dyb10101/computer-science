package stack;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import stack.impl.StackArray;

/**
 * StackArray Tester.
 *
 * @author
 * @version 1.0
 * @since
 */
public class StackArrayTest {

    private Stack stackArray;

    @Before
    public void before() throws Exception {
        stackArray = new StackArray();
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getSize()
     */
    @Test
    public void testGetSize() throws Exception {
        //开始stack为空
//        stackArray.push(1);
        int stackArraySize = stackArray.getSize();
        System.out.println(stackArraySize);

    }

    /**
     * Method: isEmpty()
     */
    @Test
    public void testIsEmpty() throws Exception {
//        stackArray.push(1);
        boolean empty = stackArray.isEmpty();
        System.out.println(empty?"stack empty":"stack not empty");
    }

    /**
     * Method: push(Object e)
     */
    @Test
    public void testPush() throws Exception {
//        stackArray.push(1);
        //测试stack满了
        for (int i = 0; i < 8; i++) {
            stackArray.push(i);
        }
        stackArray.push(9);
        Object peek = stackArray.peek();
        System.out.println(peek);
    }

    /**
     * Method: pop()
     */
    @Test
    public void testPop() throws Exception {
        //开始stack是empty
        stackArray.push(1);
        Object pop = stackArray.pop();
        System.out.println(pop);
        stackArray.pop();
    }

    /**
     * Method: peek()
     */
    @Test
    public void testPeek() throws Exception {
        //开始stack是empty
        stackArray.push(1);
        Object peek = stackArray.peek();
        System.out.println(peek);
        System.out.println(stackArray.peek());
    }


    /**
     * Method: expandStackSpace()
     */
    @Test
    public void testExpandStackSpace() throws Exception {
//TODO: Test goes here... 
/* 
try { 
   Method method = StackArray.getClass().getMethod("expandStackSpace"); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/
    }

} 
