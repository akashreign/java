import java.util.*;
public class balanced_paranthesis {
    public static void main(String[] args) {
        String str = "[(({})]";


        Stack<Character> stk = new Stack<>();

        for (char c : str.toCharArray())
        {

            if (c == '(' || c == '{' || c == '[')
            {
                stk.push(c);
            }

            else if(c==')' && !stk.isEmpty() && stk.peek()=='(')
            {
                stk.pop();
            }

            else if(c=='}' && !stk.isEmpty() && stk.peek()=='{')
            {
                stk.pop();
            }

            else if(c==']' && !stk.isEmpty() && stk.peek()=='[')
            {
                stk.pop();
            }



        }
        if(stk.isEmpty())
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("false");
        }


    }

}
