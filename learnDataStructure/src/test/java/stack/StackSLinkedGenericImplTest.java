package stack;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import stack.impl.StackSLinkedGenericImpl;

/**
 * StackSLinkedGenericImpl Tester.
 */
public class StackSLinkedGenericImplTest {

    private StackGeneric stack;

    @Before
    public void before() throws Exception {
        stack = new StackSLinkedGenericImpl<Integer>();
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getSize()
     */
    @Test
    public void testGetSize() throws Exception {
        //初始stack empty
        int size = stack.getSize();
        System.out.println(size);
    }

    /**
     * Method: isEmpty()
     */
    @Test
    public void testIsEmpty() throws Exception {
        //初始stack empty
        boolean empty = stack.isEmpty();
        System.out.println(empty?"stack empty":"stack not empty");
    }

    /**
     * Method: push(T e)
     */
    @Test
    public void testPush() throws Exception {
        stack.push(1);
        System.out.println(stack.getSize());
    }

    /**
     * Method: pop()
     */
    @Test
    public void testPop() throws Exception {
        stack.push(686);
        stack.push(666);
        for (int i = stack.getSize(); i > 0 ; i--) {
            System.out.println("index:"+(i-1)+" "+"data:"+stack.pop());
        }
    }

    /**
     * Method: peek()
     */
    @Test
    public void testPeek() throws Exception {
//        stack.peek();//初始stack empty。会抛异常
        stack.push(87);
        stack.push(99);
        System.out.println(stack.peek());
    }

}
