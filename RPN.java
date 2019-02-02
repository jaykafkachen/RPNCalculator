import java.util.*;
import java.io.*;

public class RPN
{

    public RPN()
    {

    }

    public int result(Queue<String> keys)
    {
        int one;
        int two;
        String key;
        Stack<Integer> res = new Stack<Integer>();
        while(!keys.isEmpty())
        {
            key = keys.remove();
            System.out.print(key + " ");
            try
            {
                res.push(Integer.parseInt(key));
            }
            catch(NumberFormatException e)
            {
                two = res.pop();
                one = res.pop();
                if(key.equals("+"))
                    res.push(one + two);
                else if(key.equals("-"))
                    res.push(one - two);
                else if(key.equals("*"))
                    res.push(one * two);
                else if(key.equals("/"))
                    res.push(one / two);
                else if(key.equals("%"))
                    res.push(one % two);
                else if(key.equals("^"))
                    res.push(one ^ two);
            }
        }
        if(res.empty()) 
        {
            System.out.println("Empty stack.");
            return 0;
        }
        return res.peek();
    }

    public void calculate()
    {
        Queue<String> keys = new LinkedList<String>();
        Scanner console = new Scanner(System.in);
        int index = 0;
        System.out.println("\n* don't use spaces");
        System.out.println("* end with '=' to return result\n* ex: '926*+='");
        System.out.print("* enter 'e' first to end program\n\nEnter equation:");
        String next = console.next();
        char val = next.charAt(index);
        while(val != 'e')
        {
            while(val != '=')
            {
                keys.add(String.valueOf(val));
                index++;
                val = next.charAt(index);
            }
            int ans = result(keys);
            System.out.println("= " + ans);
            System.out.println("\n* don't use spaces");
            System.out.println("* end with '=' to return result\n* ex: '926*+='");
            System.out.print("* enter 'e' first to end program\n\nEnter equation:");
            next = console.next();
            index = 0;
            val = next.charAt(index);
        }

        
    }
}
