import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: thinhdd
 * Date: 6/18/13
 * Time: 11:26 AM
 * To change this template use File | Settings | File Templates.
 */
public class TestStack {
    @Test
    public void testOpenStack()
    {
        Mystack stack = new Mystack();
        assertEquals(stack.size(), 0);
    }@Test
    public void testPush()
    {
        Mystack stack = new Mystack();
        stack.push("abc");
        assertEquals(stack.size(), 1);
    }
    @Test
    public void testPushMulti()
    {
        Mystack stack = new Mystack();
        stack.push("abc");
        assertEquals(stack.size(), 1);
        stack.push("xyz");
        assertEquals(stack.size(), 2);
    }
    @Test
    public void testTopNull()
    {
        Mystack stack = new Mystack();
        assertEquals(null,stack.top());
    }
    @Test
    public void testPopException()
    {
        Mystack stack = new Mystack();
        try{
            stack.pop();
        }   catch(Exception e)
        {
            assertEquals(e.getMessage(), "stack is emppty");
        }
    }
    @Test
    public void testPop()
    {
        Mystack stack = new Mystack();
        stack.push("abc");
        stack.push("abd");
        assertEquals(stack.size(), 2);

        stack.pop();
        assertEquals(stack.size(), 1);
    }
    @Test
    public void testPoPOneElement()
    {
        Mystack stack = new Mystack();
        stack.push("abc");
        assertEquals(stack.size(), 1);

        stack.pop();
        assertEquals(stack.size(), 0);
    }
    @Test
    public void testTopPop()
    {
        Mystack stack = new Mystack();
        stack.push("abc");
        assertEquals(stack.top(), "abc");
        assertEquals(stack.pop(), "abc");
    }
    @Test
    public void testPushPop()
    {
        Mystack stack = new Mystack();
        stack.push("abc");
        stack.push("abd");
        stack.push("abe");
        assertEquals(stack.size(),3);
        assertEquals(stack.pop(), "abe");
        assertEquals(stack.pop(), "abd");
        assertEquals(stack.pop(), "abc");
        assertEquals(stack.size(), 0);

    }
}
