import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: thinhdd
 * Date: 6/18/13
 * Time: 11:26 AM
 * To change this template use File | Settings | File Templates.
 */
public class Mystack {
    List<String> list = new ArrayList<String>();
    public int size() {

        return list.size();  //To change body of created methods use File | Settings | File Templates.
    }

    public void push(String abc) {
        list.add(abc);
        //To change body of created methods use File | Settings | File Templates.
    }

    public String top() {
        if(list.isEmpty())
            return null;
        else
          return list.get(list.size()-1);//To change body of created methods use File | Settings | File Templates.
    }

    public String pop() throws StackEmptyException{
        if (list==null)
            throw new StackEmptyException("stack is empty");
        else
        {
            String element = list.get(list.size()-1);
            list.remove(list.size()-1);
            return element;
        }
        //To change body of created methods use File | Settings | File Templates.
    }
}
