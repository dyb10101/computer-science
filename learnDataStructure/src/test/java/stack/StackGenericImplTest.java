package stack;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import stack.impl.StackArrayGenericImpl;

public class StackGenericImplTest {

    private StackGeneric<Integer> stack ;

    @Before
    public void before() throws Exception {
        stack = new StackArrayGenericImpl<Integer>();
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
        stack.push(1);
        int stackArraySize = stack.getSize();
        System.out.println(stackArraySize);
    }

    /**
     * Method: isEmpty()
     */
    @Test
    public void testIsEmpty() throws Exception {
                stack.push(1);
        boolean empty = stack.isEmpty();
        System.out.println(empty?"stack empty":"stack not empty");
    }

    /**
     * Method: push(T e)
     */
    @Test
    public void testPush() throws Exception {
                stack.push(1);
        //测试stack满了
        for (int i = 0; i < 8; i++) {
            stack.push(i);
        }
        stack.push(9);
        Object peek = stack.peek();
        System.out.println(peek);
    }

    /**
     * Method: peek()
     */
    @Test
    public void testPeek() throws Exception {
//TODO: Test goes here...
        //开始stack是empty
        stack.push(1);
        Object peek = stack.peek();
        System.out.println(peek);
        System.out.println(stack.peek());
    }

    /**
     * Method: pop()
     */
    @Test
    public void testPop() throws Exception {
//TODO: Test goes here...
        //开始stack是empty
        stack.push(1);
        Object pop = stack.pop();
        System.out.println(pop);
        stack.pop();
    }


} 
