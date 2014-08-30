import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: oliver
 * Date: 16.06.14
 * Time: 16:13
 * To change this template use File | Settings | File Templates.
 */
public class HanoiTower
{
    public static void main(String args[])
    {
        Stack<Integer> a = new Stack<>();
        Stack<Integer> b = new Stack<>();
        Stack<Integer> c = new Stack<>();
        for (int i = 3; i > 0 ; i--)
            a.push(i);
        System.out.println("\n"+a+"\n"+b+"\n"+c);

        exchange(a, c, b, a.size());

        System.out.println("\n"+a+"\n"+b+"\n"+c);
    }

    private static void exchange(Stack<Integer> from, Stack<Integer> to, Stack<Integer> help, int count)
    {
        if(count > 0)
        {
            exchange(from, help, to, count-1);
            int biggest = from.pop();
            to.push(biggest);
            exchange(help, to, from, count-1);
        }
    }
}
