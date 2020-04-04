package stack;

import stack.exception.StackEmptyException;

/**
 * 栈（堆栈）的操作接口
 */
public interface Stack {
    //返回堆栈中元素的数量
    public int getSize();
    //判断堆栈是否为空
    public boolean isEmpty();
    //数据元素 e 入栈
    public void push(Object e);
    //栈顶元素出栈
    public Object pop() throws StackEmptyException;
    //读栈顶元素
    public Object peek() throws StackEmptyException;
}
